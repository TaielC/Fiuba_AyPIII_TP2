package algocraft.herramientafactory.template;

import algocraft.herramientafactory.TableroConstruccionHerramienta;
import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.materialherramienta.MetalMaterialHerramienta;
import algocraft.materialinventario.MaderaMaterialInventario;
import algocraft.materialinventario.MetalMaterialInventario;

public class HachaMetalTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public HachaMetalTemplateConstruccionHerramienta(){
        template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new MetalMaterialInventario());
        template.putSuperior(new MetalMaterialInventario());
        template.putIzquierda(new MetalMaterialInventario());
        template.putCentro(new MaderaMaterialInventario());
        template.putInferior(new MaderaMaterialInventario());
    }

    @Override
    protected Herramienta construir() {
        return new Hacha(new MetalMaterialHerramienta());
    }
}

