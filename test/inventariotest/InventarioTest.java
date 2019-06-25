package inventariotest;

import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.inventario.Inventario;
import algocraft.herramienta.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventarioTest {

    @Test
    public void test01SePuedeAgregarUnaHerramientaAlInventarioYObtenerlaDeSuPosicionLuego() {

        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        Inventario inventario = new Inventario();
        int posicion = inventario.agregarHerramienta(hacha);

        assertEquals(0, posicion);
        assertEquals(hacha, inventario.obtenerHerramienta(posicion));
    }

    @Test
    public void test02AgregarUnaHerramientaEnUnaPosicionAEleccionSePuedeObtenerNuevamente() {
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        Inventario inventario = new Inventario();
        int posicion = 5;

        inventario.agregarHerramienta(hacha, posicion);
        assertEquals(hacha, inventario.obtenerHerramienta(posicion));
    }

    @Test
    public void test03DeberiaEliminarUnaHerramientaEnUnaPosicionDeterminada() {

        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        Inventario inventario = new Inventario();
        int posicion=2;

        inventario.agregarHerramienta(hacha,posicion);

        assertEquals(hacha , inventario.obtenerHerramienta(posicion));

        inventario.obtenerHerramienta(posicion);

        assertEquals(inventario.obtenerHerramienta(posicion).getClass(), NingunaHerramienta.class);
    }

    @Test
    public void test04DeberiaVerificarQueElInventarioSePuedaVaciarCorrectamente() {

        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        Inventario inventario = new Inventario();
        int posicion=2;

        inventario.agregarHerramienta(hacha,posicion);

        assertFalse(inventario.estaVacio());

        inventario.obtenerHerramienta(posicion);

        assertTrue(inventario.estaVacio());
    }
}