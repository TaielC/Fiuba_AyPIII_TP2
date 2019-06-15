package algocraft.herramienta.durabilidad;

public class DurabilidadHerramientaPorUsos extends DurabilidadHerramienta {

    private int usos;

    public DurabilidadHerramientaPorUsos(double durabilidadHerramienta, int cantUsos){
        durabilidad = durabilidadHerramienta;
        usos = cantUsos;
    }

    @Override
    public void desgastar() {
        usos -=1;
        if(usos <= 0) durabilidad = 0;
    }
}
