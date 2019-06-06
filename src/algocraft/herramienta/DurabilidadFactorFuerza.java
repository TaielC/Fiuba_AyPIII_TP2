package algocraft.herramienta;

import algocraft.material.*;

public class DurabilidadFactorFuerza extends Durabilidad {

    private double desgaste;

    public DurabilidadFactorFuerza(Hacha hacha, Madera madera) {
        durabilidad = 100;
        desgaste = 2;
    }

    public DurabilidadFactorFuerza(Hacha hacha, Piedra piedra) {
        durabilidad = 200;
        desgaste = 5;
    }

    public DurabilidadFactorFuerza(Hacha hacha, Metal metal) {
        durabilidad = 400;
        desgaste = 10/2;
    }

    public DurabilidadFactorFuerza(Pico pico, Madera madera) {
        durabilidad = 100;
        desgaste = 2;
    }

    public DurabilidadFactorFuerza(Pico pico, Piedra piedra) {
        durabilidad = 200;
        desgaste = 5/1.5;
    }

    @Override
    protected void _desgastar() {
        durabilidad -= desgaste;
    }
}