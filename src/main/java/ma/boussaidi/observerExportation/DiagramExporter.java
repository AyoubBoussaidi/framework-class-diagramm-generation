package ma.boussaidi.observerExportation;

import ma.boussaidi.entite.Entite;
import ma.boussaidi.relation.Relation;

import java.util.List;

public interface DiagramExporter {
    void exportDiagram(List<Entite> entites, List<Relation> relations);
}
