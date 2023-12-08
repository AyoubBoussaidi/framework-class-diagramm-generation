package ma.boussaidi.relation;

import ma.boussaidi.entite.Entite;

public interface Relation {
    Entite getSource();
    Entite getDestination();
}
