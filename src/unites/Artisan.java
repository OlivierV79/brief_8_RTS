package unites;

public class Artisan extends Unite{
    public Artisan(String nom) {
        super(nom);
    }

    // produit des armes et des outils dans un atelier
    public void produire(){
        System.out.println("L'artisan produit des armes et des outils dans un atelier");
    }

    // ameliorer batiment dans un batiment
    public void ameliore(){
        System.out.println("L'artisan ameliore un batiment dans un batiment");
    }
    //
}
