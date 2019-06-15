package algocraft.herramienta.durabilidad;

public abstract class DurabilidadHerramienta {

    protected double durabilidad;

    public abstract void desgastar();

    public double getDurabilidad(){ return durabilidad; }

    public boolean seDesgasto() {
        return durabilidad <= 0;
    }
}
