package algocraft.herramientafactory.template;

import algocraft.herramientafactory.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.Pico;
import algocraft.materialherramienta.PiedraMaterialHerramienta;
import algocraft.materialinventario.MaderaMaterialInventario;
import algocraft.materialinventario.PiedraMaterialInventario;

public class PicoPiedraTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public PicoPiedraTemplateConstruccionHerramienta(){
        template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new PiedraMaterialInventario());
        template.putSuperior(new PiedraMaterialInventario());
        template.putSuperiorDerecha(new PiedraMaterialInventario());
        template.putCentro(new MaderaMaterialInventario());
        template.putInferior(new MaderaMaterialInventario());
    }

    @Override
    protected Herramienta construir() {
        return new Pico(new PiedraMaterialHerramienta());
    }
}
