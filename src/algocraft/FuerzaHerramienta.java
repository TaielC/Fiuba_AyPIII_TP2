package algocraft;

import algocraft.herramienta.Hacha;
import algocraft.herramienta.Pico;
import algocraft.herramienta.PicoFino;
import algocraft.material.Madera;
import algocraft.material.Metal;
import algocraft.material.Piedra;

public class FuerzaHerramienta {

    public int fuerzaPara(Hacha hacha, Madera madera) {
        return 2;
    }

    public int fuerzaPara(Hacha hacha, Piedra piedra) {
        return 5;
    }

    public int fuerzaPara(Hacha hacha, Metal metal) {
        return 10;
    }

    public int fuerzaPara(Pico pico, Madera madera) {
        return 2;
    }

    public int fuerzaPara(Pico pico, Piedra piedra) {
        return 5;
    }

    public int fuerzaPara(Pico pico, Metal metal) {
        return 10;
    }

    public int fuerzaPara(PicoFino picoFino){
        return 20;
    }
}
