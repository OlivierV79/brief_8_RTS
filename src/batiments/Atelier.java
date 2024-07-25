package batiments;

public class Atelier extends Batiments{

    public Atelier(String nom) {
        super();
    }

    public String toString() {
        return "atelier";
    }

    public void produireOutil(){
        System.out.println("L'atelier a produit un outil");
    }

    public void produireArme(){
        System.out.println("L'atelier a produit une arme");
    }
}
