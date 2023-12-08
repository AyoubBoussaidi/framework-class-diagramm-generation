package ma.boussaidi.relation;

import ma.boussaidi.entite.Entite;

public class Heritage implements Relation{
    private Entite source;
    private Entite destination;
    @Override
    public Entite getSource() {
        return source;
    }
    @Override
    public Entite getDestination() {
        return destination;
    }
}
