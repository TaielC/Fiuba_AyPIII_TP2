package algocraft.constructorherramienta.templateconstruccionherramienta;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.material.MaderaMaterialHerramienta;
import algocraft.material.MetalMaterialHerramienta;

public class HachaMetalTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public HachaMetalTemplateConstruccionHerramienta(){
        super();
        TableroConstruccionHerramienta template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new MetalMaterialHerramienta());
        template.putSuperior(new MetalMaterialHerramienta());
        template.putIzquierda(new MetalMaterialHerramienta());
        template.putCentro(new MaderaMaterialHerramienta());
        template.putInferior(new MaderaMaterialHerramienta());

        templatesPosibles.add(template);

        template = new TableroConstruccionHerramienta();

        template.putSuperiorDerecha(new MetalMaterialHerramienta());
        template.putSuperior(new MetalMaterialHerramienta());
        template.putDerecha(new MetalMaterialHerramienta());
        template.putCentro(new MaderaMaterialHerramienta());
        template.putInferior(new MaderaMaterialHerramienta());

        templatesPosibles.add(template);
    }

    @Override
    protected Herramienta construir() {
        return new Hacha(new MetalMaterialHerramienta());
    }
}

