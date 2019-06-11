package jugadortest;

import algocraft.*;
import algocraft.herramienta.*;
import algocraft.material.*;
import java.util.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;


public class JugadorTest {

    @Test
    public void test01ElJugadorSeInicializaCorrectamenteConUnHachaDeMaderaEnSuInventario(){
        Jugador jugador = Jugador.getInstance();

        Herramienta herramienta = jugador.obtenerDeInventario(0);

        assertEquals(Hacha.class, herramienta.getClass());
        assertEquals(Madera.class, herramienta.material().getClass());
        assertTrue(jugador.inventarioEstaVacio());
    }

}