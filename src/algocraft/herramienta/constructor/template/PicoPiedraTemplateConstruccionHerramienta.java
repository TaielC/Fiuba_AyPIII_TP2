package algocraft.herramienta.constructor.template;

import algocraft.herramienta.constructor.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.Pico;
import algocraft.material.MaderaMaterialHerramienta;
import algocraft.material.PiedraMaterialHerramienta;

public class PicoPiedraTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public PicoPiedraTemplateConstruccionHerramienta(){
        super();
        TableroConstruccionHerramienta template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new PiedraMaterialHerramienta());
        template.putSuperior(new PiedraMaterialHerramienta());
        template.putSuperiorDerecha(new PiedraMaterialHerramienta());
        template.putCentro(new MaderaMaterialHerramienta());
        template.putInferior(new MaderaMaterialHerramienta());

        templatesPosibles.add(template);
    }

    @Override
    protected Herramienta construir() {
        return new Pico(new PiedraMaterialHerramienta());
    }
}
