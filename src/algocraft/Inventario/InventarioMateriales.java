package algocraft.juego;

import algocraft.material.*;

import java.util.Stack;

public class InventarioMateriales {

    private Stack<MaderaMaterialHerramienta> maderaStack;
    private Stack<PiedraMaterialHerramienta> piedraStack;
    private Stack<MetalMaterialHerramienta> metalStack;
    private Stack<Diamante> diamanteStack;

    public InventarioMateriales() {
        this.maderaStack = new Stack<>();
        this.piedraStack = new Stack<>();
        this.metalStack = new Stack<>();
        this.diamanteStack = new Stack<>();
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
        diamanteStack.push(new Diamante());
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
        return diamanteStack.pop();
    }
}
