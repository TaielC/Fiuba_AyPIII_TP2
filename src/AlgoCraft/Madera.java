package AlgoCraft;

public class Madera implements Material {
    protected int durabilidad;

    public Madera(){
        durabilidad = 10;
    }
    @Override
    public void sergolpeado(Hacha hacha) {
        durabilidad -= hacha.fuerza();
        hacha.desgastar();

    }
    @Override
    public void sergolpeado(Pico pico){

    }

    @Override
    public void sergolpeado(PicoFino picoFino) {

    }

    public int durabilidad(){
        return durabilidad;
    }
}
