package AlgoCraft;

public class MaderaItem implements MaterialItem {

    public int desgastar(Hacha hacha){
        return hacha.fuerza();

    }

    public int desgastar(Pico pico){
        return pico.fuerza();
    }




}
