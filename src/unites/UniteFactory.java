package unites;


public class UniteFactory {

    public Unite creerUnite(UniteChoix type){
        if(!(type instanceof ListeUniteChoix)){
            throw new IllegalArgumentException("Ce type d'unité n'existe pas.");
        }

        switch ((ListeUniteChoix)type){
            case ARTISAN: {
                System.out.println("Un artisan est apparu.");
                System.out.println(" ");
                return new Artisan(type.toString());
            }
            case CHEF: {
                System.out.println("Un chef est apparu.");
                System.out.println(" ");
                return new Chef(type.toString());
            }
            case ECLAIREUR: {
                System.out.println("Un eclaireur est apparu.");
                System.out.println(" ");
                return new Eclaireur(type.toString());
            }
            case SOLDAT: {
                System.out.println("Un soldat à été formé.");
                System.out.println(" ");
                return new Soldat(type.toString());
            }
            case VILLAGEOIS: {
                System.out.println("Un villageois est apparu.");
                System.out.println(" ");

                return new Villageois(type.toString());}
        }

        throw new IllegalArgumentException("Entrée incorrecte, Cette situation ne devrait pas se produire.");
    }
}
