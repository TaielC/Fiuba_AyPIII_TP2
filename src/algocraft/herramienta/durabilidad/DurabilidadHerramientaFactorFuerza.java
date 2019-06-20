package algocraft.herramienta.durabilidad;


public class DurabilidadHerramientaFactorFuerza extends DurabilidadHerramienta {

    private double factorFuerza;

    public DurabilidadHerramientaFactorFuerza(double durabilidadHerramienta, double desgasteHerramienta) {
        durabilidad = durabilidadHerramienta;
        factorFuerza = desgasteHerramienta;
    }

    @Override
    public void desgastar() {
        durabilidad -= factorFuerza;
    }
}