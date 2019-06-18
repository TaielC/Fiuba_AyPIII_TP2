package algocraft.excepciones;

public class InventarioEstaLlenoException extends RuntimeException {
    public InventarioEstaLlenoException(){
        super("El inventario Está Lleno");
    }
}
