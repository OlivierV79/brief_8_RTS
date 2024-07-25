package unites;

public abstract class Unite {

    private String type;
    private String nom;

    public Unite(String nom) {
        this.type = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public void voguerDansLeVillage() {
        System.out.println("Il vogue dans le village.");
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return                nom + " est un " + type;
    }
}
