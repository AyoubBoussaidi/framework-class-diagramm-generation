package ma.boussaidi.strategyGeneration;

import ma.boussaidi.ClassDiagram;
import ma.boussaidi.entite.Classe;
import ma.boussaidi.entite.Entite;
import ma.boussaidi.relation.Relation;

import java.util.List;

public interface CodeGenerationStrategy {
    void generateCode(List<Entite> entites, List<Relation> relations);
}
