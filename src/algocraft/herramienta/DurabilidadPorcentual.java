package algocraft.herramienta;


public class DurabilidadPorcentual extends Durabilidad {

    private double porcentaje;

    public DurabilidadPorcentual(double durabilidadHerrameinta, double porcentajeHerramienta) {
        durabilidad = durabilidadHerrameinta;
        porcentaje = porcentajeHerramienta;
    }

    @Override
    public void desgastar(){
        durabilidad -= durabilidad*porcentaje;
    }
}
