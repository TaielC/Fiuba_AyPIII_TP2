package AlgoCraft;

public class DurabilidadPorUsos extends Durabilidad {

    private int usos;

    public DurabilidadPorUsos(Pico pico, MetalItem Metal){
        durabilidad = 400;
        usos = 10;
    }

    @Override
    protected void _desgastar() {
        usos -=1;
        if(usos == 0) durabilidad = 0;
    }
}
