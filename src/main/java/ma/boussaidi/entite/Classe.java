package ma.boussaidi.entite;

import ma.boussaidi.Attribut;
import ma.boussaidi.Methode;

import java.util.List;

public class Classe extends Entite{
    private List<Attribut> attributs;
    private List<Methode> methodes;

    private boolean estAbstraite;
    private boolean estStatique;

    public Classe(String nom) {
        super(nom);
    }
}
