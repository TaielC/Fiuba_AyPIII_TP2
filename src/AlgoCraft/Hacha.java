package AlgoCraft;

public class Hacha extends Herramienta{

	public Hacha(MaderaItem madera) {
		durabilidad = 100;
		fuerza = 2;
	}

	public Hacha(PiedraItem piedra) {
		durabilidad = 200;
		fuerza = 5;
	}

	public Hacha(MetalItem metal) {
		durabilidad = 400;
		fuerza = 10;
	}

	@Override
	public void usar(Material material) {
	}

}
