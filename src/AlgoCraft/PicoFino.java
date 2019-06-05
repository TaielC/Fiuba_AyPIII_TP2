package AlgoCraft;

public class PicoFino extends Herramienta {

    public PicoFino(){
        durabilidad = new DurabilidadPorcentual(this);
        fuerza = 20;
    }

    @Override
    public void usar(Material material) {
        material.sergolpeado(this);
    }

    @Override
    public void desgastar() {
        durabilidad.desgastar();
    }
}
