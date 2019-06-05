package AlgoCraft;

public class DurabilidadFactorFuerza extends Durabilidad {

    private double desgaste;

    public DurabilidadFactorFuerza(Hacha hacha, MaderaItem maderaItem) {
        durabilidad = 100;
        desgaste = 2;
    }

    public DurabilidadFactorFuerza(Hacha hacha, PiedraItem piedraItem) {
        durabilidad = 200;
        desgaste = 5;
    }

    public DurabilidadFactorFuerza(Hacha hacha, MetalItem metalItem) {
        durabilidad = 400;
        desgaste = 10/2;
    }

    public DurabilidadFactorFuerza(Pico pico, MaderaItem maderaItem) {
        durabilidad = 100;
        desgaste = 2;
    }

    public DurabilidadFactorFuerza(Pico pico, PiedraItem piedraItem) {
        durabilidad = 200;
        desgaste = 5/1.5;
    }

    @Override
    protected void _desgastar() {
        durabilidad -= desgaste;
    }
}