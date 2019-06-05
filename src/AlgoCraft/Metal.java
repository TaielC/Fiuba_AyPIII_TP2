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
    	if(pico.fuerza()==4) { //En caso de que sea pico de piedra se debilita el Metal (Fuerza del pico de piedra==4)
    		
    		durabilidad-=pico.fuerza();
    		pico.desgastar();
    	}

    }

    @Override
    public void sergolpeado(PicoFino picoFino) {

    }

    @Override
    public int durabilidad() {
        return durabilidad;
    }
}
