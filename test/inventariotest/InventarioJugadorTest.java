package inventariotest;

import algocraft.excepciones.InventarioEstaLlenoException;
import algocraft.excepciones.PosicionDeInventarioHerramientasInvalidaException;
import algocraft.inventario.InventarioJugador;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.herramienta.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventarioJugadorTest {

    @Test
    public void test01SePuedeAgregarUnaHerramientaAlInventarioYObtenerlaDeSuPosicionLuego() {
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        InventarioJugador inventarioJugador = new InventarioJugador();

        int posicion = inventarioJugador.agregarHerramienta(hacha);

        assertEquals(hacha, inventarioJugador.obtenerHerramienta(posicion));
    }

    @Test
    public void test02AgregarUnaHerramientaEnUnaPosicionAEleccionSePuedeObtenerNuevamente() {
        InventarioJugador inventarioJugador = new InventarioJugador();
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());

        int posicion = 5;

        inventarioJugador.agregarHerramienta(hacha, posicion);
        assertEquals(hacha, inventarioJugador.obtenerHerramienta(posicion));
    }

    @Test (expected = InventarioEstaLlenoException.class)
    public void test03SeVerificaQueHastaQueNoSePonen11HerramientasLanzaExcepcion() {
        InventarioJugador inventarioJugador = new InventarioJugador();

        for(int i = 0; i < 11; i++){
            Herramienta picoFino = new PicoFino();
            inventarioJugador.agregarHerramienta(picoFino);
        }
    }

    @Test
    public void test04SePuedeIntercambiarUnaHerramientaConOtra() {
        InventarioJugador inventarioJugador = new InventarioJugador();
        Herramienta picoFino = new PicoFino();
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());

        int posicion = 5;
        inventarioJugador.agregarHerramienta(picoFino, posicion);
        Herramienta herramienta = inventarioJugador.intercambiarHerramienta(hacha, posicion);

        assertEquals(herramienta, picoFino);
        assertEquals(hacha, inventarioJugador.obtenerHerramienta(posicion));
    }

    @Test (expected = PosicionDeInventarioHerramientasInvalidaException.class)
    public void test05LaPosicion10ParaHerramientasEsInvalidaLanzaExcepcion() {
        InventarioJugador inventarioJugador = new InventarioJugador();
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());

        int posicion = 10;

        inventarioJugador.agregarHerramienta(hacha, posicion);
    }
}