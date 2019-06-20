package algocraft.inventario;

import algocraft.herramienta.material.MaderaMaterialHerramienta;
import algocraft.herramienta.material.MetalMaterialHerramienta;
import algocraft.herramienta.material.PiedraMaterialHerramienta;
import algocraft.juego.Posicion;
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
        diamanteMineralStack.push(new DiamanteMineral(new Posicion(0,0)));
    }

    public MaderaMaterialHerramienta getMadera(){
        return maderaStack.pop();
    }
    public PiedraMaterialHerramienta getPiedra(){
        return piedraStack.pop();
    }
    public MetalMaterialHerramienta getMetal(){
        return metalStack.pop();
    }
    public MaterialMineral getDiamante(){
        return diamanteMineralStack.pop();
    }

    public int cantidadMader() {return maderaStack.size(); }
    public int cantidadPiedra() {return piedraStack.size(); }
    public int cantidadMetal() {return metalStack.size(); }
    public int cantidadDiamante() {return diamanteMineralStack.size(); }

}
