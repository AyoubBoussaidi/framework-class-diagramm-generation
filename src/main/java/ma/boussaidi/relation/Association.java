package ma.boussaidi.relation;

import ma.boussaidi.entite.Entite;

public class Association implements Relation{

    private Entite source;
    private Entite destination;
    private Cardinalite cardinaliteSource;
    private Cardinalite cardinaliteDestination;
    @Override
    public Entite getSource() {
        return source;
    }

    @Override
    public Entite getDestination() {
        return destination;
    }
}
