package algocraft.material;

import algocraft.herramienta.*;
import algocraft.juego.ObjetoUbicable;

public abstract class MaterialMineral implements MaterialDaniable, ObjetoUbicable {

    protected int durabilidad;

    public abstract void serGolpeado(Hacha hacha);

    public abstract void serGolpeado(Pico pico);
    
    public abstract void serGolpeado(PicoFino picoFino);

    public int durabilidad() {
        return durabilidad;
    }
}
