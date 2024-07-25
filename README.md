```mermaid

classDiagram
    note "Test de creation village"
    
    class Village{
        - List~Unite~ population
        - List~Batiment~ mobilierUrbain
        
    }
    
        
    Unite <|-- Villageois
    Unite <|-- Soldat
    Unite <|-- Éclaireur
    Unite <|-- Chef
    
    class Unite{
        - String nom
        - Integer pointDeVie
        + voguerDansLeVillage()
        }
            
     class Villageois{
         - int capaciteRecolte
         + seReposer(Maison maison)
         + recolterRessource() Ressource
         + construireBatiment(Batiment batiment) Batiment
         }
            
     class Soldat{
         + partirEnGuerre()
         + defendreVillage()
         }
         
     class Éclaireur{
         - int capaciteExploration
         + explorerLesAlentours()
         }
            
     class Chef{
         - int capaciteLeader
         + donnerDuCourage()
         + sonnerAlerteGenerale()
         }

    Batiment <|-- Maison
    Batiment <|-- Caserne
    Batiment <|-- Ferme
    Batiment <|-- Atelier
    Batiment <|-- MurDeDefence
    
    Ressource <|-- Fer
    Ressource <|-- Bois
    Ressource <|-- Nouriture
    Ressource <|-- Pierre
    
    class Ressource{
        - String nom
    }
                
                


```
