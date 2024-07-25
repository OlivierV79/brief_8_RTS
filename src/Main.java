import batiments.ListeBatimentChoix;
import batiments.Maison;
import ressources.ListeRessourceChoix;
import unites.ListeUniteChoix;
import unites.Unite;
import unites.UniteFactory;
import unites.Villageois;
import village.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println(" -------------------------------------------------------------------- ");
        System.out.println(" ------------------------ LEGACY OF LANDS --------------------------- ");
        System.out.println(" -------------------------------------------------------------------- ");
        System.out.println(" ");

        UniteFactory usineUnite = new UniteFactory();

        // CREATION DU VILLAGE

        Village paris = new Village();
        paris.setNom("Paris");
        System.out.println("Bienvenue dans le petit village de " + paris.getNom() + ".");
        System.out.println(" ");



        // CREATION DES UNITES
        Unite villageois1 = usineUnite.creerUnite(ListeUniteChoix.VILLAGEOIS);
        villageois1.setNom("Momo");

        Unite villageois2 = usineUnite.creerUnite(ListeUniteChoix.VILLAGEOIS);
        villageois2.setNom("Conan");

        Unite artisan1 = usineUnite.creerUnite(ListeUniteChoix.ARTISAN);
        artisan1.setNom("Toto");

        Unite chef = usineUnite.creerUnite(ListeUniteChoix.CHEF);
        chef.setNom("Oli");

        Unite eclaireur = usineUnite.creerUnite(ListeUniteChoix.ECLAIREUR);
        eclaireur.setNom("Bibi");

        // Unite soldat = usineUnite.creerUnite(ListeUniteChoix.SOLDAT);  - VIENDRA PLUTARD DANS LA CASERNE

        List<Unite> popu = paris.getPopulation();
        popu.add(villageois1);
        popu.add(villageois2);
        popu.add(artisan1);
        popu.add(chef);
        popu.add(eclaireur);
        paris.setPopulation(popu);

        System.out.println("Voici la population actuelle de Paris :");
        System.out.println(paris.getPopulation());
        System.out.println(" ");


        // COLLECTE DES RESSOURCES


        paris.detailsRessources();


        ((Villageois) villageois1).collecterRessources(ListeRessourceChoix.BOIS);
        paris.setqBois(paris.getqBois()+1);

        ((Villageois) villageois1).collecterRessources(ListeRessourceChoix.FER);
        paris.setqFer(paris.getqFer()+1);

        ((Villageois) villageois1).collecterRessources(ListeRessourceChoix.PIERRE);
        paris.setqPierre(paris.getqPierre()+1);

        ((Villageois) villageois1).collecterRessources(ListeRessourceChoix.NOURRITURE);
        paris.setqNourriture(paris.getqNourriture()+1);


        paris.detailsRessources();


        // CREATION DES BATIMENTS
        ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.MAISON);
        // AJOUTER LE BATIMENT A LA LISTE DES BATIMENTS !!! CONDITIONS DE RESSOURCES

        ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.ATELIER);
        ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.CASERNE);
        ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.FERME);
        ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.MURDEDEFENSE);












        //Unite chef = usineUnite.creerUnite(ListeUniteChoix.CHEF);
    }
}