package batiments;

public class BatimentFactory {

    public Batiments creerBatiment(BatimentChoix type){
        if(!(type instanceof ListeBatimentChoix)){
            throw  new IllegalArgumentException("Ce type de batiment n'existe pas.");
        }

        switch ((ListeBatimentChoix)type){
            case ATELIER : return new Atelier(type.toString());
            case CASERNE : return new Caserne(type.toString());
            case FERME: return new Ferme(type.toString());
            case MAISON : return new Maison(type.toString());
            case MURDEDEFENSE: return new MurDeDefense(type.toString());


        }
        throw new IllegalArgumentException("Entrée incorrecte, Cette situation ne devrait pas se produire.");

    }
}
