package algocraft.excepciones;

public class ExcepcionDurabilidadEsCero extends RuntimeException {
    public ExcepcionDurabilidadEsCero(){
        super("La Durabilidad Llegó a 0");
    }
}
