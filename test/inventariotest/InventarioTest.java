package inventariotest;

import algocraft.juego.Inventario;
import algocraft.herramienta.*;
import algocraft.material.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventarioTest {

    @Test
    public void test01SePuedeAgregarUnaHerramientaAlInventarioYObtenerlaDeSuPosicionLuego() {

        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        Inventario inventario = new Inventario();
        int posicion = inventario.agregar(hacha);

        assertEquals(0, posicion);
        assertEquals(hacha, inventario.obtener(posicion));
    }

    @Test
    public void test02AgregarUnaHerramientaEnUnaPosicionAEleccionSePuedeObtenerNuevamente() {
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        Inventario inventario = new Inventario();
        int posicion = 10;

        inventario.agregar(hacha, posicion);
        assertEquals(hacha, inventario.obtener(posicion));
    }

    @Test
    public void test03DeberiaEliminarUnaHerramientaEnUnaPosicionDeterminada() {

        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        Inventario inventario = new Inventario();
        int posicion=2;

        inventario.agregar(hacha,posicion);

        assertEquals(hacha , inventario.obtener(posicion));

        inventario.obtener(posicion);

        assertNull(inventario.obtener(posicion));
    }

    @Test
    public void test04DeberiaVerificarQueElInventarioSePuedaVaciarCorrectamente() {

        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        Inventario inventario = new Inventario();
        int posicion=2;

        inventario.agregar(hacha,posicion);

        assertFalse(inventario.estaVacio());

        inventario.obtener(posicion);

        assertTrue(inventario.estaVacio());
    }
}