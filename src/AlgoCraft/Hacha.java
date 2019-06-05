package AlgoCraft;

public class Hacha extends Herramienta{

	public Hacha(MaderaItem madera) {
		durabilidad = 100;
		fuerza = 2;
		materialItem = madera;
	}

	public Hacha(PiedraItem piedra) {
		durabilidad = 200;
		fuerza = 5;
		materialItem = piedra;
	}

	public Hacha(MetalItem metal) {
		durabilidad = 400;
		fuerza = 10;
		materialItem = metal;
	}

	@Override
	public void usar(Material material) {
		material.sergolpeado(this);

	}
	@Override
	public void desgastarse(){
		durabilidad -= materialItem.desgastar(this);
	}


}
