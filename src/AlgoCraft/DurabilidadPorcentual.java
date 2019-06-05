package AlgoCraft;

public class DurabilidadPorcentual extends Durabilidad {

    private double porcentaje;

    public DurabilidadPorcentual(PicoFino picoFino) {
        durabilidad = 1000;
        porcentaje = 0.1; // Será del 10% a cada uso
    }

    @Override
    protected void _desgastar() {
        durabilidad -= durabilidad*porcentaje;
    }
}
