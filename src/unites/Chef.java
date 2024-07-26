package unites;

import batiments.Batiments;
import village.Village;

import java.util.List;

public class Chef extends Soldat {
    public Chef(String nom) {
        super(nom);
    }

    public void motiverUnite() {

        System.out.println("Le chef motive ses compagnons");
    }

    public void appliquerBuff(Village village) {
        List<Batiments> mobilierUrbain = village.getMobilierUrbain();

        for (Batiments batiment : mobilierUrbain) {
            // Remplacez 'getAttribut' par le nom de la méthode qui retourne l'attribut que vous souhaitez afficher
            Integer res = batiment.getResistance();
            res *= 2;
            batiment.setResistance(res);
        }
        System.out.println("Le chef applique un buff d'amélioration aux batiments : resistance doublée");
    }

}
