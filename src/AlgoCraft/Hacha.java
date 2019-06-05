package AlgoCraft;

public class Hacha extends Herramienta{

	private MaterialItem material;

	public Hacha(MaderaItem madera) {
		durabilidad = new DurabilidadFactorFuerza(this, madera);
		fuerza = 2;
		material = madera;
	}

	public Hacha(PiedraItem piedra) {
		durabilidad = new DurabilidadFactorFuerza(this, piedra);
		fuerza = 5;
		material = piedra;
	}

	public Hacha(MetalItem metal) {
		durabilidad = new DurabilidadFactorFuerza(this, metal);
		fuerza = 10;
		material = metal;
	}
	
	
	@Override
	public void usar(Material material) {
		material.sergolpeado(this);
	}
	@Override
	public void desgastar(){
		durabilidad.desgastar();
	}


}
