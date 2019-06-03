package AlgoCraft;

public class Piedra implements Material{
	
	public int duracionDelHacha() {
		return 100;
	}
	
	public int fuerzaDelHacha() {
		return 2;
	}
	
	public int duracionDelPico() {
		return 100;
	}
	
	public int fuerzaDelPico() {
		return 2;
	}
	
	public int golpear() {
		return this.duracionDelHacha()-this.fuerzaDelHacha();
	}

}
