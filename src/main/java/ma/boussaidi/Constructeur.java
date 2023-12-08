package ma.boussaidi;

import java.util.List;

public class Constructeur {
    private String nom;
    private List<Parametre> parametres;


    public Constructeur(String nom, List<Parametre> parametres) {
        this.nom = nom;
        this.parametres = parametres;

    }

    public String getNom() {
        return nom;
    }

    public List<Parametre> getParametres() {
        return parametres;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setParametres(List<Parametre> parametres) {
        this.parametres = parametres;
    }
}

