package unites;

public class Soldat extends Unite{

    private Integer capaciteAttaque;
    private Integer capaciteDefense;

    public Soldat(String nom) {
        super(nom);
    }

    // se positioner dans les casernes ou mur
    public void sePositioner(){
        System.out.println("Un soldat se positionne dans un batiment militaire");
    }

    // partir en mission
    public void partirEnMission(){
        System.out.println("Un soldat est parti en mission");
    }
}
