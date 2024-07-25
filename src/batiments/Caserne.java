package batiments;

import unites.Soldat;
import unites.Unite;

public class Caserne extends Batiments{
    public Caserne(String nom) {
        super();
    }

    public String toString() {
        return "caserne";
    }

    public void formerSoldat(Unite unite){
        System.out.println("La caserne à formé un soldat");
    }
}
