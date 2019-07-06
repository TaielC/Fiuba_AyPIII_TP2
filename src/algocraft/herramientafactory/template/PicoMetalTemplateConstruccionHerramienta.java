package algocraft.herramientafactory.template;

import algocraft.herramientafactory.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.Pico;
import algocraft.materialherramienta.MetalMaterialHerramienta;
import algocraft.materialinventario.MaderaMaterialInventario;
import algocraft.materialinventario.MetalMaterialInventario;

public class PicoMetalTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public PicoMetalTemplateConstruccionHerramienta(){
        template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new MetalMaterialInventario());
        template.putSuperior(new MetalMaterialInventario());
        template.putSuperiorDerecha(new MetalMaterialInventario());
        template.putCentro(new MaderaMaterialInventario());
        template.putInferior(new MaderaMaterialInventario());
    }

    @Override
    protected Herramienta construir() {
        return new Pico(new MetalMaterialHerramienta());
    }
}
