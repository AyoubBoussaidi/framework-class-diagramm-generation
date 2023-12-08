package ma.boussaidi.entite;

import java.util.List;

public class Enum extends Entite{
    List<String> valeurs;
    public Enum(String nom, List<String> valeurs) {
        super(nom);
        this.valeurs = valeurs;
    }
}
