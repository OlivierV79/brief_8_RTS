package batiments;

public class Ferme extends Batiments{
    public Ferme(String nom) {
        super();
    }

    public String toString() {
        return "ferme";
    }

    public void produireDeLaNouriture(){
        System.out.println("La ferme a produit de la nouriture");
    }
}
