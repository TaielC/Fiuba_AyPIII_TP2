package algocraft.herramienta;

import algocraft.material.MaterialMineral;

public class PicoFino extends Herramienta {
	
	public PicoFino() {
		fuerza=FuerzaPicoMetalYPiedra;
		durabilidad=new DurabilidadPorcentual(DurabilidadPicoMetalYPiedra,PorcentajeDesgastePicoMetalYPiedra);
		
	}

    @Override
    public void golpear(MaterialMineral materialMineral) {

    }
}
