package algocraft.constructorherramienta.template;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.materialinventario.MaderaMaterialInventario;

public class HachaMaderaTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public HachaMaderaTemplateConstruccionHerramienta(){
        template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new MaderaMaterialInventario());
        template.putSuperior(new MaderaMaterialInventario());
        template.putIzquierda(new MaderaMaterialInventario());
        template.putCentro(new MaderaMaterialInventario());
        template.putInferior(new MaderaMaterialInventario());
    }


    @Override
    protected Herramienta construir() {
        return new Hacha(new MaderaMaterialHerramienta());
    }
}
