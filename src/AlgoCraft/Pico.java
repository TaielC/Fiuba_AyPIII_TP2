package AlgoCraft;

public class Pico extends Herramienta{
	
	public Pico(MaderaItem madera) {
		durabilidad = 100;
		fuerza = 2;
	}

	public Pico(PiedraItem piedra) {
		durabilidad = 200;
		fuerza = 5;
	}

	public Pico(MetalItem metal) {
		durabilidad = 400;
		fuerza = 10;
	}

	@Override
	public void usar(Material material) {

	}
}
