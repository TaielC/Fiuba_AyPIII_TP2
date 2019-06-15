package algocraft.herramienta.durabilidad;


public class DurabilidadHerramientaFactorFuerza extends DurabilidadHerramienta {

    private double desgaste;

    public DurabilidadHerramientaFactorFuerza(double durabilidadHerramienta, double desgasteHerramienta) {
        durabilidad = durabilidadHerramienta;
        desgaste = desgasteHerramienta;
    }

    @Override
    public void desgastar() {
        durabilidad -= desgaste;
    }
}