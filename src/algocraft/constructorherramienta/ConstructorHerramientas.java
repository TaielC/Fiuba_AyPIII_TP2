package algocraft.constructorherramienta;

import algocraft.herramienta.*;
import algocraft.constructorherramienta.template.*;

import java.util.LinkedList;

public class ConstructorHerramientas {

    static private LinkedList<TemplateConstruccionHerramienta> herramientaTemplates;

    static {
        herramientaTemplates = new LinkedList<>();
        herramientaTemplates.add(new HachaMaderaTemplateConstruccionHerramienta());
        herramientaTemplates.add(new PicoMaderaTemplateConstruccionHerramienta());
        herramientaTemplates.add(new HachaPiedraTemplateConstruccionHerramienta());
        herramientaTemplates.add(new PicoPiedraTemplateConstruccionHerramienta());
        herramientaTemplates.add(new HachaMetalTemplateConstruccionHerramienta());
        herramientaTemplates.add(new PicoMetalTemplateConstruccionHerramienta());
        herramientaTemplates.add(new PicoFinoTemplateConstruccionHerramienta());
    }

    public static Herramienta obtenerHerramienta(TableroConstruccionHerramienta tablero){
        for(TemplateConstruccionHerramienta template : herramientaTemplates) {
            Herramienta herramientaConstruida = template.construirSiEsIgual(tablero);
            if(herramientaConstruida != null) return herramientaConstruida;
        }
        return new NingunaHerramienta();
    }

}
