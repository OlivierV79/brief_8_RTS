package batiments;

public class MurDeDefense extends Batiments{

    public MurDeDefense(String nom) {
        super();
    }

    public String toString() {
        return "mur de defence";
    }

    public void protegerVillage(){
        System.out.println("Le mur de defence protege le village");
    }
}
