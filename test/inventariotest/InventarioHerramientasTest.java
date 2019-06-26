package inventariotest;

import algocraft.excepciones.PosicionDeInventarioHerramientasInvalidaException;
import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.PicoFino;
import algocraft.inventario.InventarioHerramientas;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventarioHerramientasTest {

    private static final int TAMANIO = 10;

    @Test
    public void test01UnInventarioHerramientasEstaInicialmenteVacio() {
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas(TAMANIO);

        assertTrue(inventarioHerramientas.estaVacio());
    }

    @Test
    public void test02SePuedeAgregarUnaHerramientaAUnInventarioVacioYSeEncuentraEnLaMismaPosicion() {
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas(TAMANIO);
        Herramienta picoFino = new PicoFino();

        int posicion = inventarioHerramientas.agregarHerramienta(picoFino);

        assertEquals(picoFino, inventarioHerramientas.ver(posicion));
    }

    @Test
    public void test03SePuedeAgregarUnaHerramientaEnUnaPosicionQueSeElija() {
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas(TAMANIO);
        Herramienta picoFino = new PicoFino();

        int posicion = (int) inventarioHerramientas.getTamanio()/2;
        inventarioHerramientas.agregarHerramienta(picoFino, posicion);

        assertEquals(picoFino, inventarioHerramientas.ver(posicion));
    }

    @Test (expected = PosicionDeInventarioHerramientasInvalidaException.class)
    public void test04AlIntentarAgregarEnUnaPosicionFueraDeRangoLanzaExcepcion() {
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas(TAMANIO);
        Herramienta picoFino = new PicoFino();

        int posicion = inventarioHerramientas.getTamanio();
        inventarioHerramientas.agregarHerramienta(picoFino, posicion);
    }

    @Test
    public void test05LuegoDeAgregarUnaHerramientaNoEstaVacio() {
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas(TAMANIO);
        Herramienta picoFino = new PicoFino();

        inventarioHerramientas.agregarHerramienta(picoFino);

        assertFalse(inventarioHerramientas.estaVacio());
    }

    @Test
    public void test06SePuedePonerUnaHerramientaYLuegoIntercambiarPosicionConOtra() {
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas(TAMANIO);
        Herramienta picoFino = new PicoFino();
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());

        int posicion = (int) (inventarioHerramientas.getTamanio()/2);
        inventarioHerramientas.agregarHerramienta(picoFino, posicion);
        Herramienta herramienta = inventarioHerramientas.intercambiarHerramienta(hacha, posicion);

        assertEquals(herramienta, picoFino);
        assertEquals(hacha, inventarioHerramientas.ver(posicion));
    }

    @Test
    public void test07AlAgregarUnaHerramientaYLuegoObtenerlaElInventarioSeEncuentraVacio() {
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas(TAMANIO);
        Herramienta picoFino = new PicoFino();

        int posicion = (int) inventarioHerramientas.getTamanio()/2;
        inventarioHerramientas.agregarHerramienta(picoFino, posicion);

        assertEquals(picoFino, inventarioHerramientas.obtenerHerramienta(posicion));
        assertTrue(inventarioHerramientas.estaVacio());
    }
}
