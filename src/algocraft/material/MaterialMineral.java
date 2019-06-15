package algocraft.material;

import algocraft.herramienta.*;

public abstract class MaterialMineral {

    protected int durabilidad;

    public abstract void serGolpeado(Hacha hacha);

    public abstract void serGolpeado(Pico pico);

    public abstract void serGolpeado(PicoFino picoFino);

    public abstract boolean esDaniadoPor(MaterialHerramienta material);

    public int durabilidad() {
        return durabilidad;
    }

}
