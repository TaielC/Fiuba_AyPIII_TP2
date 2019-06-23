package algocraft.constructorherramienta.template;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.Pico;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.materialinventario.MaderaMaterialInventario;

public class PicoMaderaTemplateConstruccionHerramienta extends TemplateConstruccionHerramienta {

    public PicoMaderaTemplateConstruccionHerramienta(){
        template = new TableroConstruccionHerramienta();

        template.putSuperiorIzquierda(new MaderaMaterialInventario());
        template.putSuperior(new MaderaMaterialInventario());
        template.putSuperiorDerecha(new MaderaMaterialInventario());
        template.putCentro(new MaderaMaterialInventario());
        template.putInferior(new MaderaMaterialInventario());
    }

    @Override
    protected Herramienta construir() {
        return new Pico(new MaderaMaterialHerramienta());
    }
}