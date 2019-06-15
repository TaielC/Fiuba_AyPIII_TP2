package algocraft.constructorherramienta.templateconstruccionherramienta;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.Pico;
import algocraft.material.MaderaMaterialHerramienta;
import algocraft.material.MetalMaterialHerramienta;

public class PicoMetalTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public PicoMetalTemplateConstruccionHerramienta(){
        super();
        TableroConstruccionHerramienta template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new MetalMaterialHerramienta());
        template.putSuperior(new MetalMaterialHerramienta());
        template.putSuperiorDerecha(new MetalMaterialHerramienta());
        template.putCentro(new MaderaMaterialHerramienta());
        template.putInferior(new MaderaMaterialHerramienta());

        templatesPosibles.add(template);
    }

    @Override
    protected Herramienta construir() {
        return new Pico(new MetalMaterialHerramienta());
    }
}
