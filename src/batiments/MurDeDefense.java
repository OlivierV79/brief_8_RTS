package batiments;

public class MurDeDefense extends Batiments{

    public MurDeDefense(String nom) {
        super();

        this.setResistance(20);
    }

    public String toString() {
        return "mur de defence";
    }

    public void protegerVillage(){
        System.out.println("Le mur de defence protege le village");
    }
}
