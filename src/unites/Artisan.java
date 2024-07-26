package unites;

import batiments.Batiments;
import unites.interfaces.SeReposer;
import unites.interfaces.Voguer;

public class Artisan extends Unite implements SeReposer, Voguer {

    private Integer capaciteProduction;
    private Integer capaciteAmeliorationBatiment;

    public Artisan(String nom) {
        super(nom);
    }

    // produit des armes et des outils dans un atelier
    public void produire(){
        System.out.println("L'artisan produit des armes et des outils dans un atelier");
    }

    // ameliorer batiment dans un batiment
    public void ameliorerBatiment(Batiments batiment){
        System.out.println("L'artisan ameliore " + batiment);
    }
    //

    public void seReposer() {
        System.out.println("L'artisan se repose");
    }

    @Override
    public void voguerDansLeVillage() {
        System.out.println("L'artisan vogue dans le village");
    }
}
