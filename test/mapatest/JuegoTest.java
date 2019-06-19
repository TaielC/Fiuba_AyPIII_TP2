package mapatest;

import algocraft.juego.*;
import algocraft.material.*;

import org.junit.Test;
import static org.junit.Assert.*;


public class JuegoTest {

    @Test
    public void test01VerificaQueUnCasilleroEstaVacio() {

        Mapa mapa = new Mapa(10,10);

        ObjetoUbicable objeto = mapa.getObjetoUbicable("[1, 1]");

        assertNull(objeto);
    }

    @Test
    public void test02VerificaQueSePuedeOcuparUnCasilleroVacio() {

        Juego juego = Juego.getInstance();
        Mapa mapa = juego.getMapa();

        assertNull(mapa.getObjetoUbicable("[1, 1]"));

        MaterialMineral madera = new MaderaMineral(new Posicion(1,1));
        mapa.agregar(madera, madera.getPosicion());

        assertNotNull(mapa.getObjetoUbicable("[1, 1]"));
    }

    @Test
    public void test03VerificaQueNoSePuedeOcuparUnCasilleroOcupado() {

        Juego juego = Juego.getInstance();
        Mapa mapa = juego.getMapa();

        MaterialMineral madera = new MaderaMineral(new Posicion(0,0));
        mapa.agregar(madera, madera.getPosicion());

        assertEquals(mapa.getObjetoUbicable("[0, 0]"), juego.getJugador());

    }

    @Test
    public void test04VerificaQueSePuedaOcuparUnCasilleroPorUnPersonaje() {

        Juego juego = Juego.getInstance();
        Mapa mapa = juego.getMapa();

        assertNotNull(mapa.getObjetoUbicable("[0, 0]"));
    }

    @Test
    public void test05VerificaQueSePuedaOcuparUnCasilleroPorUnMaterial() {

        Juego juego = Juego.getInstance();
        Mapa mapa = juego.getMapa();
        MaterialMineral madera = new MaderaMineral(new Posicion(1,1));

        mapa.agregar(madera, madera.getPosicion());

        assertNotNull(mapa.getObjetoUbicable("[1, 1]"));
    }


}
