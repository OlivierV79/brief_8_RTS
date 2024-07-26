```mermaid

classDiagram
        
    class Village{
        - List~Unite~ population
        - List~Batiment~ mobilierUrbain
        - Integer qBois
        - Integer qFer
        - Integer qNourriture
        - Integer qPierre
        + detailsRessources()
        + commercerAvecMarchand(Ressource ressource)
        + EtatDesBiments()
        
    }
    
    Village --> Unite
    Village --> Batiment
    Village --> Ressource
    
        
    Unite <|-- Villageois
    Unite <|-- Soldat
    Unite <|-- Éclaireur
    Unite <|-- Artisan
    Soldat <|-- Chef
    
    class Unite{
        <<abstract>>
        - Type type
        - String nom
        - Integer pointDeVie;
        + voguerDansLeVillage()
        }
            
     class Villageois{
         - Integer capaciteRecolte
         - Integer capaciteConstruire
         + seReposer(Maison maison)
         + recolterRessource() Ressource
         + construireBatiment(Batiment batiment) Batiment
         }
            
     class Soldat{
         - Integer capaciteAttaque
         - Integer capaciteDefense
         + sePositioner()
         + partirEnMission()
         }
         
     class Éclaireur{
         - Integer capaciteExploration
         - Integer capaciteAmeliorationBatiment
         + partirExplorer()
         + rentrerDansMaison()
         }
            
     class Chef{
         + motiverUnite()
         + appliquerBuff(Village village)
                  }
         
         class Artisan{
             - Integer capaciteProduction
             - Integer capaciteAmeliorationBatiment
             + ameliorerBatiment(Batiments batiment)
             + produire()
             + seReposer(Maison maison)
         }

    Batiment <|-- Maison
    Batiment <|-- Caserne
    Batiment <|-- Ferme
    Batiment <|-- Atelier
    Batiment <|-- MurDeDefence
    
    class Batiment{
        <<abstract>>
        - String type
        - String nom
        - Integer resistance
    }
    
    class Maison{
        + sertDeLieuDeRepos(Villageois villageois)
    }
    
    class Caserne{
        + formerSoldat(Unite unite)
    }
    
    class Ferme{
        + produireDeLaNouriture()
    }
    
    class Atelier{
        + produireOutil()
        + produireArme()
    }
    
    class MurDeDefence{
        + protegerVillage()
    }
    
    Ressource <|-- Fer
    Ressource <|-- Bois
    Ressource <|-- Nourriture
    Ressource <|-- Pierre
       
    class Ressource{
        <<abstract>>
        - Type type
        - String nom
    }

    class Fer{

    }

    class Bois{

    }

    class Nourriture{

    }
    
    class SeReposer{
        <<interface>>
        + seReposer()
    }
    
    class Voguer{
        <<interface>>
        + voguerDansLeVillage()
    }
    
    Villageois ..> SeReposer
    Artisan ..> SeReposer

    Artisan ..> Voguer
    Villageois ..> Voguer
                
                


```

````mermaid
sequenceDiagram
    actor Villageois
    participant Ressources
    participant Village
    participant AncienMur
    participant NouveauMur
    
    participant Maison

    Villageois->>Ressources: Récolte des ressources
    Villageois->>Village: Ramène les ressources
    Villageois->>NouveauMur: Utilise les ressources pour terminer la construction
    Villageois->>Maison: Va se reposer

    actor soldats ennemis
    
    soldats ennemis->>NouveauMur: detruit
    soldats ennemis->>AncienMur: n'arrive pas a detruire
    
````

````mermaid
sequenceDiagram
    participant Foret
    actor Villageois
    participant Maison
    participant Murs

    Villageois->>Foret: collecterRessources(Ressource bois2)
    Foret-->>Villageois: reviend avec du bois
    
    Villageois->>Murs: creerBatiment(MurDeDefence mur2)
    Murs-->>Villageois: voguerDansLeVillage()
    Villageois->>Maison: seReposer(Maison saMaison)
   

    actor soldats ennemis
    
    soldats ennemis->>Murs: attaquer(Mur)
    Murs-->>soldats ennemis: n'arrive pas a detruire l'ancien mur
    
````
