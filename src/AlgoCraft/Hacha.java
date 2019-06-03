package AlgoCraft;

public class Hacha extends Herramienta{
	
	public Hacha(Material material) {
		duracion=material.duracionDelHacha();
		fuerza=material.fuerzaDelHacha();
	}
	
	public void usar(Material material) {
		duracion=material.golpear();
	}

}
