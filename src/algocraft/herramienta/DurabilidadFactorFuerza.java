package algocraft.herramienta;


public class DurabilidadFactorFuerza extends Durabilidad {

    private double desgaste;

    public DurabilidadFactorFuerza(double durabilidadHerramienta, double desgasteHerramienta) {
        durabilidad = durabilidadHerramienta;
        desgaste = desgasteHerramienta;
    }

    @Override
    protected void desgastarProtected() {
        durabilidad -= desgaste;
    }
}