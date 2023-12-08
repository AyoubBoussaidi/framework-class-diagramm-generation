package ma.boussaidi.entite;

import ma.boussaidi.Methode;

import java.util.List;

public class Interface extends Entite{
    List<Methode> methodes;

    public Interface(String nom,List<Methode> methodes) {
        super(nom);
        this.methodes = methodes;
    }
}
