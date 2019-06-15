package algocraft.herramienta.constructor.template;

import algocraft.herramienta.constructor.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.Pico;
import algocraft.material.MaderaMaterialHerramienta;

public class PicoMaderaTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public PicoMaderaTemplateConstruccionHerramienta(){
        super();
        TableroConstruccionHerramienta template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        template.putSuperior(new MaderaMaterialHerramienta());
        template.putSuperiorDerecha(new MaderaMaterialHerramienta());
        template.putCentro(new MaderaMaterialHerramienta());
        template.putInferior(new MaderaMaterialHerramienta());

        templatesPosibles.add(template);
    }

    @Override
    protected Herramienta construir() {
        return new Pico(new MaderaMaterialHerramienta());
    }
}