package algocraft.constructorherramienta.template;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.PicoFino;
import algocraft.materialinventario.MaderaMaterialInventario;
import algocraft.materialinventario.MetalMaterialInventario;
import algocraft.materialinventario.PiedraMaterialInventario;

public class PicoFinoTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public PicoFinoTemplateConstruccionHerramienta(){
        template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new MetalMaterialInventario());
        template.putSuperior(new MetalMaterialInventario());
        template.putSuperiorDerecha(new MetalMaterialInventario());
        template.putIzquierda(new PiedraMaterialInventario());
        template.putCentro(new MaderaMaterialInventario());
        template.putInferior(new MaderaMaterialInventario());
    }

    @Override
    protected Herramienta construir() {
        return new PicoFino();
    }
}