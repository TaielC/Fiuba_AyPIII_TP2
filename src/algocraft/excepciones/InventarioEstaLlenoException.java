package algocraft.excepciones;

public class InventarioEstaLlenoException extends RuntimeException {
    public InventarioEstaLlenoException(){
        super("El Inventario Está Lleno");
    }
}
