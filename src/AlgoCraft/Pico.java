package AlgoCraft;

public class Pico extends Herramienta{

	private MaterialItem material;


	public Pico(MaderaItem madera) {
		durabilidad = new DurabilidadFactorFuerza(this, madera);
		fuerza = 2;
		material = madera;
	}

	public Pico(PiedraItem piedra) {
		durabilidad = new DurabilidadFactorFuerza(this, piedra);
		fuerza = 5;
		material = piedra;
	}

	public Pico(MetalItem metal) {
		durabilidad = new DurabilidadPorUsos(this, metal);
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
