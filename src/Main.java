import batiments.*;
import ressources.ListeRessourceChoix;
import ressources.Ressource;
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


        Ressource bois1 = ((Villageois) villageois1).collecterRessources(ListeRessourceChoix.BOIS);
        paris.setqBois(paris.getqBois()+1);

        Ressource fer1 = ((Villageois) villageois1).collecterRessources(ListeRessourceChoix.FER);
        paris.setqFer(paris.getqFer()+1);

        Ressource pierre1 = ((Villageois) villageois1).collecterRessources(ListeRessourceChoix.PIERRE);
        paris.setqPierre(paris.getqPierre()+1);

        Ressource nouriturre1 = ((Villageois) villageois1).collecterRessources(ListeRessourceChoix.NOURRITURE);
        paris.setqNourriture(paris.getqNourriture()+1);


        paris.detailsRessources();


        // CREATION DES BATIMENTS
        Batiments maison1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.MAISON);
        maison1.setNom("La maison de Oli");

        Batiments atelier1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.ATELIER);
        atelier1.setNom("L'atelier de Dédé");

        Batiments caserne1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.CASERNE);
        caserne1.setNom("La caserne des soulards");

        Batiments ferme1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.FERME);
        ferme1.setNom("La ferme de Momo");

        Batiments murDeDefence1 = ((Villageois) villageois1).creerBatiment(ListeBatimentChoix.MURDEDEFENSE);
        murDeDefence1.setNom("Le grand mur Sud");

        List<Batiments> bat = paris.getMobilierUrbain();
        bat.add(maison1);
        bat.add(atelier1);
        bat.add(caserne1);
        bat.add(ferme1);
        bat.add(murDeDefence1);
        paris.setMobilierUrbain(bat);



        // Certaines methodes sont misent en place avec des println sans arguments
        ((Caserne) caserne1).formerSoldat(villageois2);
        Unite soldat1 = usineUnite.creerUnite(ListeUniteChoix.SOLDAT);
        ((Ferme)ferme1).produireDeLaNouriture();
        ((Atelier)atelier1).produireArme();
        ((Atelier)atelier1).produireOutil();
        ((MurDeDefense)murDeDefence1).protegerVillage();
        ((Soldat)soldat1).partirEnMission();
        ((Eclaireur)eclaireur).partirExplorer();
        ((Eclaireur)eclaireur).rentrerDansMaison();
        ((Artisan)artisan1).produire((Atelier)atelier1);

        ((Artisan)artisan1).ameliorerBatiment(ferme1);
        ((Chef)chef).motiverUnite();

        ((Villageois)villageois1).voguerDansLeVillage();

        System.out.println(" ");
        System.out.println("Ah !? Il y a un marchand aux portes du village !");
        paris.commercerAvecMarchand(nouriturre1);
        System.out.println(" ");

        System.out.println("------------- ATTAQUE -------------");
        System.out.println("Attention une attaque se prepare !");
        ((Soldat)soldat1).sePositioner();
        System.out.println(" ");
        paris.EtatDesBiments();
        System.out.println(" ");
        ((Chef)chef).appliquerBuff(paris);
        System.out.println(" ");
        paris.EtatDesBiments();
        System.out.println("-------------");

    }
}