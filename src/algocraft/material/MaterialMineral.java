package algocraft.material;

import algocraft.*;
import algocraft.herramienta.*;

public abstract class MaterialMineral implements MaterialDaniable {

    public abstract void serGolpeado(Hacha hacha);

    public abstract void serGolpeado(Pico pico);

    public abstract void serGolpeado(PicoFino picoFino);

    public abstract int durabilidad();
}
