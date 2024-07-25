package batiments;

import unites.Unite;
import unites.Villageois;

public class Maison extends Batiments{


    public Maison(String nom) {
        super();
    }

    public String toString() {
        return "maison";
    }

public void sertDeLieuDeRepos(Villageois villageois){
    System.out.println("Un villageois se repose dans une maison");
}



}
