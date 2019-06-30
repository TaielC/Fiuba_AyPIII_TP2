package algocraft.excepciones;

public class InventarioHerramientasEstaLlenoException extends RuntimeException {
    public InventarioHerramientasEstaLlenoException(){
        super("El inventario Está Lleno");
    }
}
