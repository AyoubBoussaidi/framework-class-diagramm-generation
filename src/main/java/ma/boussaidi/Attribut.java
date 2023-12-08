package ma.boussaidi;

import ma.boussaidi.enums.Type;

public class Attribut {
    private String nom;
    private Type type;
    private boolean statique;
    private boolean finalAttribut;

    public Attribut(String nom, Type type, boolean statique, boolean finalAttribut) {
        this.nom = nom;
        this.type = type;
        this.statique = statique;
        this.finalAttribut = finalAttribut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isStatique() {
        return statique;
    }

    public void setStatique(boolean statique) {
        this.statique = statique;
    }

    public boolean isFinalAttribut() {
        return finalAttribut;
    }

    public void setFinalAttribut(boolean finalAttribut) {
        this.finalAttribut = finalAttribut;
    }
}
