package AlgoCraft;

public class MetalItem implements MaterialItem {

    @Override
    public int desgastar(Hacha hacha) {
        return hacha.fuerza()/2;
    }

    @Override
    public int desgastar(Pico pico) {
        pico.reducirCantidadDeUso();
        return 0;
    }
}
