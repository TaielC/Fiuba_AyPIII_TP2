package algocraft.inventario;

import algocraft.herramienta.material.MaderaMaterialHerramienta;
import algocraft.herramienta.material.MaterialHerramienta;
import algocraft.herramienta.material.MetalMaterialHerramienta;
import algocraft.herramienta.material.PiedraMaterialHerramienta;
import algocraft.material.*;

import java.util.Stack;

public class InventarioMateriales {

    private Stack<MaderaMaterialHerramienta> maderaStack;
    private Stack<PiedraMaterialHerramienta> piedraStack;
    private Stack<MetalMaterialHerramienta> metalStack;
    private Stack<DiamanteMineral> diamanteMineralStack;

    public InventarioMateriales() {
        this.maderaStack = new Stack<>();
        this.piedraStack = new Stack<>();
        this.metalStack = new Stack<>();
        this.diamanteMineralStack = new Stack<>();
    }

    public void agregarMadera() {
        maderaStack.push(new MaderaMaterialHerramienta());
    }
    public void agregarPiedra() {
        piedraStack.push(new PiedraMaterialHerramienta());
    }
    public void agregarMetal() {
        metalStack.push(new MetalMaterialHerramienta());
    }
    public void agregarDiamante() {
        diamanteMineralStack.push(new DiamanteMineral());
    }

    public MaterialHerramienta getMadera(){
        return maderaStack.pop();
    }
    public MaterialHerramienta getPiedra(){
        return piedraStack.pop();
    }
    public MaterialHerramienta getMetal(){
        return metalStack.pop();
    }
    public MaterialMineral getDiamante(){
        return diamanteMineralStack.pop();
    }
}
