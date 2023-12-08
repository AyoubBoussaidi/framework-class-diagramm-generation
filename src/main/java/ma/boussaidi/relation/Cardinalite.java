package ma.boussaidi.relation;

import ma.boussaidi.enums.CardinaliteType;
public interface Cardinalite {
    CardinaliteType getMin();
    CardinaliteType getMax();
}
