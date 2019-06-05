package AlgoCraft;

public class Diamante implements Material {
	
	protected int durabilidad;
	
	public Diamante() {
		durabilidad=100;
	}
	
	public int durabilidad() {
		return durabilidad;
	}
	
	@Override
	public void sergolpeado(Hacha hacha) {
		hacha.desgastar();
	}
	
	public void sergolpeado(Pico pico) {
		pico.desgastar();
	}

	@Override
	public void sergolpeado(PicoFino picoFino) {
		durabilidad-=picoFino.fuerza();
		picoFino.desgastar();
		
	}
	
	
	
	

}
