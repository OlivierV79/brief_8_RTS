package equipements;

public class EquipementFactory {

    public Equipement creerEquipement(EquipementChoix type){
        if(!(type instanceof ListeEquipementChoix)){
            throw new IllegalArgumentException("Ce type de ressource n'existe pas.");
        }

        switch ((ListeEquipementChoix)type){
            case ARME: return new Arme(type.toString());
            case OUTIL: return new Outil(type.toString());
        }
        throw new IllegalArgumentException("Entrée incorrecte, cette situation ne devrait pas se produire.");

    }
}
