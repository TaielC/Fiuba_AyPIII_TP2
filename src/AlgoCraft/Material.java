package AlgoCraft;

import AlgoCraft.Item;

public interface Material extends Item {
	
	public int duracionDelHacha();
	public int fuerzaDelHacha();
	public int duracionDelPico();
	public int fuerzaDelPico();
	public int golpear();

}
