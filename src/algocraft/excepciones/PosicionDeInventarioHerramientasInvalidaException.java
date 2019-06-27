package algocraft.excepciones;

public class PosicionDeInventarioHerramientasInvalidaException extends RuntimeException {
    public PosicionDeInventarioHerramientasInvalidaException(){
        super("La posicion donde se quiso acceder al Inventario Es Inválida");
    }
}
