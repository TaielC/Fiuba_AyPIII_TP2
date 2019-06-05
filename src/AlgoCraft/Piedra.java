package AlgoCraft;

public class Piedra implements Material{

    private int durabilidad;

    @Override
    public void sergolpeado(Hacha hacha) {

    }

    @Override
    public void sergolpeado(Pico pico) {
    	durabilidad-=pico.fuerza();
    	pico.desgastar();

    }

    @Override
    public void sergolpeado(PicoFino picoFino) {

    }

    @Override
    public int durabilidad() {
        return durabilidad;
    }
}
