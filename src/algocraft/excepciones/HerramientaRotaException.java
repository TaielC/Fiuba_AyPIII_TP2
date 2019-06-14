package algocraft.excepciones;

public class HerramientaRotaException extends RuntimeException {
    public HerramientaRotaException() {
        super("La Herramienta está rota, no se puede seguir utilizando");
    }
}
