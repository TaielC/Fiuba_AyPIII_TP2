package algocraft.excepciones;

public class PosicionDeTableroConstruccionHerramientaInvalidaException extends RuntimeException {
    public PosicionDeTableroConstruccionHerramientaInvalidaException(){
        super("Se quiso acceder a una posicion inválida del Mapa de Construcción");
    }
}
