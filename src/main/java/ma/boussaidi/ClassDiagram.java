package ma.boussaidi;

import ma.boussaidi.entite.Entite;
import ma.boussaidi.observerExportation.DiagramExporter;
import ma.boussaidi.relation.Relation;
import ma.boussaidi.strategyGeneration.CodeGenerationStrategy;

import java.util.ArrayList;
import java.util.List;

public class ClassDiagram {
    private List<Entite> entites;
    private List<Relation> relations;

    public ClassDiagram() {
        this.entites = new ArrayList<>();
        this.relations = new ArrayList<>();
    }

    public void ajouterEntite(Entite entite) {
        entites.add(entite);
    }

    public void ajouterRelation(Relation relation) {
        relations.add(relation);
    }

    public void genererCode(CodeGenerationStrategy strategie) {
        for (Entite entite : entites) {
            strategie.generateCode(entites,relations);
        }
    }

    public void exporterDiagramme(DiagramExporter exporter) {
        for (Entite entite : entites) {
            exporter.exportDiagram(entite);
        }
    }


}

