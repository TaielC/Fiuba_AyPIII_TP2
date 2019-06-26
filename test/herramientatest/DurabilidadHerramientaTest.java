package herramientatest;

import algocraft.herramienta.durabilidad.DurabilidadHerramienta;
import algocraft.herramienta.durabilidad.DurabilidadHerramientaFactorFuerza;
import algocraft.herramienta.durabilidad.DurabilidadHerramientaPorUsos;
import algocraft.herramienta.durabilidad.DurabilidadHerramientaPorcentual;
import org.junit.Test;

import static org.junit.Assert.*;

public class DurabilidadHerramientaTest {

    @Test
    public void test01DurabilidadFactorFuerzaSeDecrementaLinealmenteDeAcuerdoAlFactor() {
        double durabilidad = 100;
        int factor = 1;
        DurabilidadHerramienta durabilidadHerramientaFactorFuerza = new DurabilidadHerramientaFactorFuerza(durabilidad, factor);

        for (int i = 0; i < 10; i+=factor) {
            assertEquals(durabilidad - i, durabilidadHerramientaFactorFuerza.getDurabilidad(), 0);
            durabilidadHerramientaFactorFuerza.desgastar();
        }

    }

    @Test
    public void test02DurabilidadPorUsosNoDecrementaHastaCumplirCantidadDeUsos() {
        double durabilidad = 20;
        int usos = 10;
        DurabilidadHerramienta durabilidadHerramientaPorUsos = new DurabilidadHerramientaPorUsos(durabilidad, usos);

        for(int i = 0; i < usos; i++) {
            assertEquals(durabilidad, durabilidadHerramientaPorUsos.getDurabilidad(), 0);
            durabilidadHerramientaPorUsos.desgastar();
        }
        assertEquals(0, durabilidadHerramientaPorUsos.getDurabilidad(), 0);
    }

    @Test
    public void test03DurabilidadPorcentualDecrementaPorcentualmente() {
        double durabilidad = 20;
        double porcentaje = 0.5;
        DurabilidadHerramienta durabilidadHerramientaPorcentual = new DurabilidadHerramientaPorcentual(durabilidad, porcentaje);

        for(int i = 0; durabilidad - i*porcentaje*durabilidad > 0 && i < 20; i++) {
            assertEquals(durabilidad - i*porcentaje*durabilidad, durabilidadHerramientaPorcentual.getDurabilidad(), 0);
            durabilidadHerramientaPorcentual.desgastar();
        }
    }

}