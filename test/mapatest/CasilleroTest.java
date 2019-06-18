package mapatest;

import algocraft.juego.*;
import algocraft.material.*;

import org.junit.Test;
import static org.junit.Assert.*;


public class CasilleroTest {

    @Test
    public void test01VerificaQueUnCasilleroEstaVacio() {

        Tablero tablero = new Tablero(10,10);
        Casillero casillero = tablero.casillero("[1, 1]");
        assertNull(casillero.obtenido());
    }

    @Test
    public void test02VerificaQueSePuedeOcuparUnCasilleroVacio() {

        Mapa mapa = Mapa.getInstance();
        Tablero tablero = mapa.getTablero();
        Casillero casillero = tablero.casillero("[1, 1]");

        assertTrue(casillero.estaVacio());

        MaterialMineral madera = new Madera(new Posicion(1,1));
        tablero.agregar(madera, madera.getPosicion());

        assertFalse(casillero.estaVacio());
    }

    @Test
    public void test03VerificaQueNoSePuedeOcuparUnCasilleroOcupado() {

        Mapa mapa = Mapa.getInstance();
        Tablero tablero = mapa.getTablero();
        Casillero casillero = tablero.casillero("[0, 0]");

        MaterialMineral madera = new Madera(new Posicion(0,0));
        tablero.agregar(madera, madera.getPosicion());

        assertEquals(casillero.obtenido(),mapa.getJugador());

    }

    @Test
    public void test04VerificaQueSePuedaOcuparUnCasilleroPorUnPersonaje() {

        Mapa mapa = Mapa.getInstance();
        Tablero tablero = mapa.getTablero();
        Casillero casillero = tablero.casillero("[0, 0]");

        assertFalse(casillero.estaVacio());
    }

    @Test
    public void test05VerificaQueSePuedaOcuparUnCasilleroPorUnMaterial() {

        Mapa mapa = Mapa.getInstance();
        Tablero tablero = mapa.getTablero();
        MaterialMineral madera = new Madera(new Posicion(1,1));

        tablero.agregar(madera, madera.getPosicion());
        Casillero casillero = tablero.casillero("[1, 1]");

        assertFalse(casillero.estaVacio());
    }


}
