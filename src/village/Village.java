package village;

import batiments.Batiments;
import ressources.Ressource;
import unites.Unite;

import java.util.ArrayList;
import java.util.List;

public class Village {

    private String nom;
    private List<Unite> population = new ArrayList<>();
    private List<Batiments> mobilierUrbain;
    private Integer qBois = 0;
    private Integer qFer = 0;
    private Integer qNourriture = 0;
    private Integer qPierre = 0;


    public Village() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Unite> getPopulation() {
        return population;
    }

    public void setPopulation(List<Unite> population) {
        this.population = population;
    }

    public List<Batiments> getMobilierUrbain() {
        return mobilierUrbain;
    }

    public void setMobilierUrbain(List<Batiments> mobilierUrbain) {
        this.mobilierUrbain = mobilierUrbain;
    }

    public Integer getqBois() {
        return qBois;
    }

    public void setqBois(Integer qBois) {
        this.qBois = qBois;
    }

    public Integer getqFer() {
        return qFer;
    }

    public void setqFer(Integer qFer) {
        this.qFer = qFer;
    }

    public Integer getqNourriture() {
        return qNourriture;
    }

    public void setqNourriture(Integer qNourriture) {
        this.qNourriture = qNourriture;
    }

    public Integer getqPierre() {
        return qPierre;
    }

    public void setqPierre(Integer qPierre) {
        this.qPierre = qPierre;
    }

    public void detailsRessources(){
        System.out.println("L'etat actuel de l'entrepot est : ");
        System.out.println(
                "Bois : " + getqBois() +
                ", Fer : " + getqFer() +
                ", Nourriture : " + getqNourriture() +
                ", Pierre : " + getqPierre() );
        System.out.println(" ");
    }
}
