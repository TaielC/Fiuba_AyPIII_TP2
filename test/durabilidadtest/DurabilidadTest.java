package durabilidadtest;

import algocraft.herramienta.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class DurabilidadTest {

    @Test
    public void test01DurabilidadFactorFuerzaSeDecrementaLinealmenteDeAcuerdoAlFactor() {
        double durabilidad = 100;
        int factor = 1;
        Durabilidad durabilidadFactorFuerza = new DurabilidadFactorFuerza(durabilidad, factor);

        for (int i = 0; i < 10; i+=factor) {
            assertEquals(durabilidad - i, durabilidadFactorFuerza.getDurabilidad(), 0);
            durabilidadFactorFuerza.desgastar();
        }

    }

    @Test
    public void test02DurabilidadPorUsosNoDecrementaHastaCumplirCantidadDeUsos() {
        double durabilidad = 20;
        int usos = 10;
        Durabilidad durabilidadPorUsos = new DurabilidadPorUsos(durabilidad, usos);

        for(int i = 0; i < usos; i++) {
            assertEquals(durabilidad, durabilidadPorUsos.getDurabilidad(), 0);
            durabilidadPorUsos.desgastar();
        }
        assertEquals(0, durabilidadPorUsos.getDurabilidad(), 0);
    }

    @Test
    public void test03DurabilidadPorcentualDecrementaPorcentualmente() {
        double durabilidad = 20;
        double porcentaje = 0.5;
        Durabilidad durabilidadPorcentual = new DurabilidadPorcentual(durabilidad, porcentaje);

        for(int i = 0; durabilidad - i*porcentaje*durabilidad > 0 && i < 20; i++) {
            assertEquals(durabilidad - i*porcentaje*durabilidad, durabilidadPorcentual.getDurabilidad(), 0);
            durabilidadPorcentual.desgastar();
        }
    }

}