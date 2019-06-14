package algocraft.tableroconstruccionherramientatemplates;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.material.MaderaMaterialHerramienta;
import algocraft.material.MetalMaterialHerramienta;
import algocraft.material.MaterialHerramienta;

public class TableroPicoMetalTemplate extends TableroConstruccionHerramienta {

    public TableroPicoMetalTemplate(){
        super();

        tablero[0] = new MetalMaterialHerramienta();
        tablero[1] = new MetalMaterialHerramienta();
        tablero[2] = new MetalMaterialHerramienta();
        tablero[4] = new MaderaMaterialHerramienta();
        tablero[7] = new MaderaMaterialHerramienta();
    }


    @Override
    public void putSuperiorIzquierda(MaterialHerramienta material){
        // No se puede modificar el Template.
    }
    @Override
    public void putSuperior(MaterialHerramienta material){
        // No se puede modificar el Template.
    }
    @Override
    public void putSuperiorDerecha(MaterialHerramienta material){
        // No se puede modificar el Template.
    }
    @Override
    public void putIzquierda(MaterialHerramienta material){
        // No se puede modificar el Template.
    }
    @Override
    public void putCentro(MaterialHerramienta material){
        // No se puede modificar el Template.
    }
    @Override
    public void putDerecha(MaterialHerramienta material){
        // No se puede modificar el Template.
    }
    @Override
    public void putInferiorIzquierda(MaterialHerramienta material){
        // No se puede modificar el Template.
    }
    @Override
    public void putInferior(MaterialHerramienta material){
        // No se puede modificar el Template.
    }
    @Override
    public void putInferiorDerecha(MaterialHerramienta material){
        // No se puede modificar el Template.
    }
}
