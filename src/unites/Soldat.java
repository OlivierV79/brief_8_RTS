package unites;

public class Soldat extends Unite{
    public Soldat(String nom) {
        super(nom);
    }

    // se positioner dans les casernes ou mur
    public void sePositioner(){
        System.out.println("Le soldat se positionne dans un batiment militaire");
    }

    // partir en mission
    public void partirEnMission(){
        System.out.println("Le soldat est parti en mission");
    }
}
