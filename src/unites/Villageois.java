package unites;

import batiments.*;
import ressources.ListeRessourceChoix;
import ressources.Ressource;
import ressources.RessourceFactory;
import village.*;

import java.util.List;

public class Villageois extends Unite {



    public Villageois(String nom) {
        super(nom);
    }


    public void collecterRessources(ListeRessourceChoix type) {

        RessourceFactory usineRessource = new RessourceFactory();
        Ressource ressource1 = usineRessource.creerRessource(type);
        System.out.println("Un villageois va chercher la ressource : " + ressource1);
        System.out.println("Un villageois est de retour avec la ressource : " + ressource1);
                this.voguerDansLeVillage();
        System.out.println(" ");
    }

    public Batiments creerBatiment(ListeBatimentChoix type) {

        BatimentFactory usineBatiment = new BatimentFactory();
        Batiments batiments1 = usineBatiment.creerBatiment(type);

        System.out.println("Le villageois à créé le batiment : " + batiments1);
        this.voguerDansLeVillage();
        System.out.println(" ");

        return batiments1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
