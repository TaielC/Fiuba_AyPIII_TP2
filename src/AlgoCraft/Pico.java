package AlgoCraft;

public class Pico extends Herramienta{
	
	public Pico(Material material) {
		duracion=material.duracionDelPico();
		fuerza=material.fuerzaDelPico();
	}

}
