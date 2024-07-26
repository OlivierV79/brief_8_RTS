package unites;

public class Eclaireur extends Unite{

    private Integer capaciteExploration;

    public Eclaireur(String nom) {
        super(nom);
    }

    // partir en exploration hors du village
    public void partirExplorer(){
        System.out.println("L'explorateur est parti explorer les environs");
    }


    // prendre place dans une maison
    public void rentrerDansMaison(){
        System.out.println("L'explorateur est rentré dans une maison");
    }
}
