package algocraft.herramienta.constructor.template;

import algocraft.herramienta.constructor.TableroConstruccionHerramienta;
import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.material.MaderaMaterialHerramienta;

public class HachaMaderaTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public HachaMaderaTemplateConstruccionHerramienta(){
        super();
        TableroConstruccionHerramienta template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        template.putSuperior(new MaderaMaterialHerramienta());
        template.putIzquierda(new MaderaMaterialHerramienta());
        template.putCentro(new MaderaMaterialHerramienta());
        template.putInferior(new MaderaMaterialHerramienta());

        templatesPosibles.add(template);

        template = new TableroConstruccionHerramienta();

        template.putSuperiorDerecha(new MaderaMaterialHerramienta());
        template.putSuperior(new MaderaMaterialHerramienta());
        template.putDerecha(new MaderaMaterialHerramienta());
        template.putCentro(new MaderaMaterialHerramienta());
        template.putInferior(new MaderaMaterialHerramienta());

        templatesPosibles.add(template);
    }


    @Override
    protected Herramienta construir() {
        return new Hacha(new MaderaMaterialHerramienta());
    }
}
