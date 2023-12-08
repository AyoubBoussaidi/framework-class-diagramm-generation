package ma.boussaidi.entite;

import ma.boussaidi.Constructeur;
import ma.boussaidi.Methode;

import java.util.List;

public class Record extends Entite{
    Constructeur constructeur;
    List<Methode> Methodes;

    public Record(String nom, Constructeur constructeur, List<Methode> methodes) {
        super(nom);
        this.constructeur = constructeur;
        Methodes = methodes;
    }
}
