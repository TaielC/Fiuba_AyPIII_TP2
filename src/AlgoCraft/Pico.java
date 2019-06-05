package AlgoCraft;

public class Pico extends Herramienta{
	protected int cantidadDeUso;
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
		cantidadDeUso = 10;
	}

	@Override
	public void usar(Material material) {

	}
	@Override
	public void desgastarse(){
		durabilidad -= materialItem.desgastar(this);
	}

	public void reducirCantidadDeUso(){
		cantidadDeUso --;
	}
}
