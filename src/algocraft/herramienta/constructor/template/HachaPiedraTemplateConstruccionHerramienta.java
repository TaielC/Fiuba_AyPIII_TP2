package algocraft.herramienta.constructor.template;

import algocraft.herramienta.constructor.TableroConstruccionHerramienta;
import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.material.MaderaMaterialHerramienta;
import algocraft.material.PiedraMaterialHerramienta;

public class HachaPiedraTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public HachaPiedraTemplateConstruccionHerramienta(){
        super();
        TableroConstruccionHerramienta template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new PiedraMaterialHerramienta());
        template.putSuperior(new PiedraMaterialHerramienta());
        template.putIzquierda(new PiedraMaterialHerramienta());
        template.putCentro(new MaderaMaterialHerramienta());
        template.putInferior(new MaderaMaterialHerramienta());

        templatesPosibles.add(template);

        template = new TableroConstruccionHerramienta();

        template.putSuperiorDerecha(new PiedraMaterialHerramienta());
        template.putSuperior(new PiedraMaterialHerramienta());
        template.putDerecha(new PiedraMaterialHerramienta());
        template.putCentro(new MaderaMaterialHerramienta());
        template.putInferior(new MaderaMaterialHerramienta());

        templatesPosibles.add(template);
    }

    @Override
    protected Herramienta construir() {
        return new Hacha(new PiedraMaterialHerramienta());
    }
}


