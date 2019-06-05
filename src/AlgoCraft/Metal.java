package AlgoCraft;

public class Metal implements Material{
    protected int durabilidad;

    public Metal(){
        durabilidad = 50;
    }

    public void sergolpeado(Hacha hacha) {

    }

    @Override
    public void sergolpeado(Pico pico) {

    }

    @Override
    public void sergolpeado(PicoFino picoFino) {

    }

    @Override
    public int durabilidad() {
        return durabilidad;
    }
}
