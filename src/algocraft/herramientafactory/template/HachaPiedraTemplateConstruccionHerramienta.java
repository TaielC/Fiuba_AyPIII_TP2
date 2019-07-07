package algocraft.herramientafactory.template;

import algocraft.herramientafactory.TableroConstruccionHerramienta;
import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.materialherramienta.PiedraMaterialHerramienta;
import algocraft.materialinventario.MaderaMaterialInventario;
import algocraft.materialinventario.PiedraMaterialInventario;

public class HachaPiedraTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public HachaPiedraTemplateConstruccionHerramienta(){
        template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new PiedraMaterialInventario());
        template.putSuperior(new PiedraMaterialInventario());
        template.putIzquierda(new PiedraMaterialInventario());
        template.putCentro(new MaderaMaterialInventario());
        template.putInferior(new MaderaMaterialInventario());
    }

    @Override
    protected Herramienta construir() {
        return new Hacha(new PiedraMaterialHerramienta());
    }
}


