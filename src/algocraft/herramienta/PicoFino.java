package algocraft.herramienta;

import algocraft.material.*;

public class PicoFino extends Herramienta {

    public PicoFino(){
        fuerza = FuerzaPicoFino;
        durabilidad = new DurabilidadPorcentual(DurabilidadPicoFino, PorcentajeDesgastePicoFino);
    }
    @Override
    public void usar(MaterialMineral materialMineral) {
        materialMineral.serGolpeado(this);
    }

    @Override
    public void golpear(Madera madera) { }

    @Override
    public void golpear(Piedra piedra) { durabilidad.desgastar(); }

    @Override
    public void golpear(Metal metal) { durabilidad.desgastar(); }

    @Override
    public void golpear(Diamante diamante) { durabilidad.desgastar(); }
}
