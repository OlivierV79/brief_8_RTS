package ressources;

public class RessourceFactory {

    public Ressource creerRessource(RessourceChoix type){
        if(!(type instanceof ListeRessourceChoix)){
            throw new IllegalArgumentException("Ce type de ressource n'existe pas.");
        }

        switch ((ListeRessourceChoix)type){
            case BOIS: return new Bois(type.toString());
            case FER: return new Fer(type.toString());
            case NOURRITURE: return new Nourriture(type.toString());
            case PIERRE: return new Pierre(type.toString());

        }
        throw new IllegalArgumentException("Entrée incorrecte, Cette situation ne devrait pas se produire.");

    }

}
