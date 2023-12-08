package ma.boussaidi;

import java.beans.Visibility;
import java.util.List;

public class Methode {
    private String nom;
    private String typeRetour;
    private List<Parametre> parametres;
    private Visibility visibility;
    private boolean estStatique;
    private boolean estFinal;
    private boolean estAbstraite;

    public Methode(String nom, String typeRetour, List<Parametre> parametres, Visibility visibility, boolean estStatique, boolean estFinal, boolean estAbstraite) {
        this.nom = nom;
        this.typeRetour = typeRetour;
        this.parametres = parametres;
        this.visibility = visibility;
        this.estStatique = estStatique;
        this.estFinal = estFinal;
        this.estAbstraite = estAbstraite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypeRetour() {
        return typeRetour;
    }

    public void setTypeRetour(String typeRetour) {
        this.typeRetour = typeRetour;
    }

    public List<Parametre> getParametres() {
        return parametres;
    }

    public void setParametres(List<Parametre> parametres) {
        this.parametres = parametres;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public boolean isEstStatique() {
        return estStatique;
    }

    public void setEstStatique(boolean estStatique) {
        this.estStatique = estStatique;
    }

    public boolean isEstFinal() {
        return estFinal;
    }

    public void setEstFinal(boolean estFinal) {
        this.estFinal = estFinal;
    }

    public boolean isEstAbstraite() {
        return estAbstraite;
    }

    public void setEstAbstraite(boolean estAbstraite) {
        this.estAbstraite = estAbstraite;
    }
}
