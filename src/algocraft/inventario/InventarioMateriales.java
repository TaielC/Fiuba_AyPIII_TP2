package algocraft.inventario;

import algocraft.excepciones.NoHaySuficienteMaterialExeption;
import algocraft.materialinventario.*;

public class InventarioMateriales {

    private int cantidadMadera;
    private int cantidadPiedra;
    private int cantidadMetal;
    private int cantidadDiamante;

    public InventarioMateriales() {
        cantidadMadera = 0;
        cantidadPiedra = 0;
        cantidadPiedra = 0;
        cantidadDiamante = 0;
    }

    public void agregarMadera() {
        cantidadMadera += 1;
    }
    public void agregarPiedra() {
        cantidadPiedra += 1;
    }
    public void agregarMetal() {
        cantidadMetal += 1;
    }
    public void agregarDiamante() {
        cantidadDiamante += 1;
    }

    public MaterialInventario getMadera(){
        if(cantidadMadera <= 0){
            throw new NoHaySuficienteMaterialExeption("Madera");
        }
        cantidadMadera -= 1;
        return new MaderaMaterialInventario();
    }

    public MaterialInventario getPiedra(){
        if(cantidadPiedra <= 0){
            throw new NoHaySuficienteMaterialExeption("Piedra");
        }
        cantidadPiedra -= 1;
        return new PiedraMaterialInventario();
    }

    public MaterialInventario getMetal(){
        if(cantidadMetal <= 0){
            throw new NoHaySuficienteMaterialExeption("Metal");
        }
        cantidadMetal -= 1;
        return new MetalMaterialInventario();
    }

    public MaterialInventario getDiamante(){
        if(cantidadDiamante <= 0){
            throw new NoHaySuficienteMaterialExeption("Diamante");
        }
        cantidadDiamante -= 1;
        return new DiamanteMaterialInventario();
    }

    public int cantidadMadera() {return cantidadMadera; }
    public int cantidadPiedra() {return cantidadPiedra; }
    public int cantidadMetal() {return cantidadMetal; }
    public int cantidadDiamante() {return cantidadDiamante; }
}
