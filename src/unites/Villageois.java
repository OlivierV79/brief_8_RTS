package unites;

import batiments.*;
import ressources.ListeRessourceChoix;
import ressources.Ressource;
import ressources.RessourceFactory;
import unites.interfaces.SeReposer;
import unites.interfaces.Voguer;
import village.*;

import java.sql.SQLOutput;
import java.util.List;

public class Villageois extends Unite implements SeReposer, Voguer {

    private Integer capaciteRecolte = 1;
    private Integer capaciteConstruire = 1;

    public Villageois(String nom) {
        super(nom);
    }


    public Ressource collecterRessources(ListeRessourceChoix type) {

        RessourceFactory usineRessource = new RessourceFactory();
        Ressource ressource1 = usineRessource.creerRessource(type);
        System.out.println("Un villageois va chercher la ressource : " + ressource1);
        System.out.println("Un villageois est de retour avec la ressource : " + ressource1);
        this.voguerDansLeVillage();
        System.out.println(" ");
        return ressource1;
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

    @Override
    public void seReposer() {
        System.out.println("Le villageois se repose");
    }

    @Override
    public void voguerDansLeVillage() {
        System.out.println("Le villageois vogue dans le village");
    }
}
