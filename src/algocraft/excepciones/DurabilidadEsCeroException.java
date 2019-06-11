package algocraft.excepciones;

public class DurabilidadEsCeroException extends RuntimeException {
    public DurabilidadEsCeroException(){
        super("La Durabilidad Llegó a 0");
    }
}
