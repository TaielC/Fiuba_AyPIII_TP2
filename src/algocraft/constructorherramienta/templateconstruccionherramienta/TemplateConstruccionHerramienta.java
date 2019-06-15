package algocraft.constructorherramienta.templateconstruccionherramienta;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;

import java.util.LinkedList;

public abstract class TemplateConstruccionHerramienta {

    protected LinkedList<TableroConstruccionHerramienta> templatesPosibles;

    protected TemplateConstruccionHerramienta() {
        templatesPosibles = new LinkedList<>();
    }

    public Herramienta construirSiEsIgual(TableroConstruccionHerramienta tablero){
        for(TableroConstruccionHerramienta template : templatesPosibles) {
            if (template.equals(tablero)) {
                return construir();
            }
        }
        return null;
    }

    public LinkedList<TableroConstruccionHerramienta> templatesPosibles(){ return templatesPosibles; }

    protected abstract Herramienta construir();
}
