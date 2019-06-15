package algocraft.herramienta.durabilidad;


public class DurabilidadHerramientaPorcentual extends DurabilidadHerramienta {

    private double porcentaje;

    public DurabilidadHerramientaPorcentual(double durabilidadHerrameinta, double porcentajeHerramienta) {
        durabilidad = durabilidadHerrameinta;
        porcentaje = porcentajeHerramienta;
    }

    @Override
    public void desgastar(){
        durabilidad -= durabilidad*porcentaje;
    }
}
