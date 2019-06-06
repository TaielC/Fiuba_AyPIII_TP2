package algocraft.herramienta;

public class DurabilidadPorcentual extends Durabilidad {

    private double porcentaje;

    public DurabilidadPorcentual(double durabilidadHerrameinta, double porcentajeHerramienta) {
        durabilidad = durabilidadHerrameinta;
        porcentaje = porcentajeHerramienta;
    }

    @Override
    protected void _desgastar() {
        durabilidad -= durabilidad*porcentaje;
    }
}
