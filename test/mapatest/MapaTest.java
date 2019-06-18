package mapatest;

import algocraft.juego.*;
import algocraft.material.*;

import org.junit.Test;
import static org.junit.Assert.*;


public class CasilleroTest {

    @Test
    public void test01VerificaQueUnCasilleroEstaVacio() {

        Tablero tablero = new Tablero(10,10);

        ObjetoUbicable objeto = tablero.getObjetoUbicable("[1, 1]");

        assertNull(objeto);
    }

    @Test
    public void test02VerificaQueSePuedeOcuparUnCasilleroVacio() {

        Mapa mapa = Mapa.getInstance();
        Tablero tablero = mapa.getTablero();

        assertNull(tablero.getObjetoUbicable("[1, 1]"));

        MaterialMineral madera = new MaderaMineral(new Posicion(1,1));
        tablero.agregar(madera, madera.getPosicion());

        assertNotNull(tablero.getObjetoUbicable("[1, 1]"));
    }

    @Test
    public void test03VerificaQueNoSePuedeOcuparUnCasilleroOcupado() {

        Mapa mapa = Mapa.getInstance();
        Tablero tablero = mapa.getTablero();

        MaterialMineral madera = new MaderaMineral(new Posicion(0,0));
        tablero.agregar(madera, madera.getPosicion());

        assertEquals(tablero.getObjetoUbicable("[0, 0]"),mapa.getJugador());

    }

    @Test
    public void test04VerificaQueSePuedaOcuparUnCasilleroPorUnPersonaje() {

        Mapa mapa = Mapa.getInstance();
        Tablero tablero = mapa.getTablero();

        assertEquals(tablero.getObjetoUbicable("[0, 0]"),mapa.getJugador());
    }

    @Test
    public void test05VerificaQueSePuedaOcuparUnCasilleroPorUnMaterial() {

        Mapa mapa = Mapa.getInstance();
        Tablero tablero = mapa.getTablero();
        MaterialMineral madera = new MaderaMineral(new Posicion(1,1));

        tablero.agregar(madera, madera.getPosicion());

        assertEquals(tablero.getObjetoUbicable("[1, 1]"),madera);
    }


}
