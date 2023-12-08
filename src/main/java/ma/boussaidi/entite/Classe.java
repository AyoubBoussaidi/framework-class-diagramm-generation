package ma.boussaidi.entite;

import ma.boussaidi.Attribut;
import ma.boussaidi.Methode;

import java.util.ArrayList;
import java.util.List;

public class Classe extends Entite{

    private List<Attribut> attributs;
    private List<Methode> methodes;
    private boolean estAbstraite;
    private boolean estStatique;

    public Classe(String nom) {
        super(nom);
        this.attributs = new ArrayList<>();
        this.methodes = new ArrayList<>();
    }

    public void ajouterAttribut(Attribut attribut) {
        attributs.add(attribut);
    }

    public void ajouterMethode(Methode methode) {
        methodes.add(methode);
    }

    public List<Attribut> getAttributs() {
        return attributs;
    }

    public void setAttributs(List<Attribut> attributs) {
        this.attributs = attributs;
    }

    public List<Methode> getMethodes() {
        return methodes;
    }

    public void setMethodes(List<Methode> methodes) {
        this.methodes = methodes;
    }

    public boolean isEstAbstraite() {
        return estAbstraite;
    }

    public void setEstAbstraite(boolean estAbstraite) {
        this.estAbstraite = estAbstraite;
    }

    public boolean isEstStatique() {
        return estStatique;
    }

    public void setEstStatique(boolean estStatique) {
        this.estStatique = estStatique;
    }
}
