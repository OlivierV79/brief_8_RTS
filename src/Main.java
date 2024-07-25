import batiments.*;
import ressources.ListeRessourceChoix;
import unites.*;
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
        Batiments maison1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.MAISON);
        Batiments atelier1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.ATELIER);
        Batiments caserne1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.CASERNE);
        Batiments ferme1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.FERME);
        Batiments murDeDefence1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.MURDEDEFENSE);

        List<Batiments> bat = paris.getMobilierUrbain();
        bat.add(maison1);
        bat.add(atelier1);
        bat.add(caserne1);
        bat.add(ferme1);
        bat.add(murDeDefence1);
        paris.setMobilierUrbain(bat);

        ((Maison) maison1).sertDeLieuDeRepos((Villageois) villageois1);

        // Methodes mise en place avec des println sans arguments
        ((Caserne) caserne1).formerSoldat(villageois2);
        Unite soldat1 = usineUnite.creerUnite(ListeUniteChoix.SOLDAT);
        ((Ferme)ferme1).produireDeLaNouriture();
        ((Atelier)atelier1).produireArme();
        ((Atelier)atelier1).produireOutil();
        ((MurDeDefense)murDeDefence1).protegerVillage();
        ((Soldat)soldat1).partirEnMission();
        ((Soldat)soldat1).sePositioner();
        ((Eclaireur)eclaireur).partirExplorer();
        ((Eclaireur)eclaireur).rentrerDansMaison();
        ((Artisan)artisan1).produire();

        ((Artisan)artisan1).ameliorerBatiment(ferme1);










        //Unite chef = usineUnite.creerUnite(ListeUniteChoix.CHEF);
    }
}