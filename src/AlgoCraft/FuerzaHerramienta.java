package AlgoCraft;

public class FuerzaHerramienta {

    public int fuerzaPara(Hacha hacha, MaderaItem maderaItem) {
        return 2;
    }

    public int fuerzaPara(Hacha hacha, PiedraItem piedraItem) {
        return 5;
    }

    public int fuerzaPara(Hacha hacha, MetalItem metalItem) {
        return 10;
    }

    public int fuerzaPara(Pico pico, MaderaItem maderaItem) {
        return 2;
    }

    public int fuerzaPara(Pico pico, PiedraItem piedraItem) {
        return 5;
    }

    public int fuerzaPara(Pico pico, MetalItem metalItem) {
        return 10;
    }

    public int fuerzaPara(PicoFino picoFino){
        return 20;
    }
}
