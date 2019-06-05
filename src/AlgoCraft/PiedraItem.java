package AlgoCraft;

public class PiedraItem implements MaterialItem {

    @Override
    public int desgastar(Hacha hacha) {
        return hacha.fuerza();
    }

    @Override
    public int desgastar(Pico pico) {
        return (int) (pico.fuerza()/1.5);
    }
}
