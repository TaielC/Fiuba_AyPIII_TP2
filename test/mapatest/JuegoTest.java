package mapatest;

import algocraft.juego.*;
import algocraft.materialmineral.*;

import org.junit.Test;
import static org.junit.Assert.*;


public class JuegoTest {

    @Test
    public void test01VerificaQueUnCasilleroEstaVacio() {

        Mapa mapa = new Mapa(10,10);
        Posicion posicion = new Posicion(1,1);
        ObjetoUbicable aire = new ObjetoAire();
        mapa.agregar(aire, posicion);

        ObjetoUbicable objeto = mapa.getObjetoUbicable(posicion);

        assertTrue(objeto instanceof ObjetoAire);
    }

    @Test
    public void test02VerificaQueSePuedeOcuparUnCasilleroVacio() {
        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        Mapa mapa = juego.getMapa();
        Posicion posicion = new Posicion(1,1);

        MaterialMineral madera = new MaderaMineral(new Posicion(1,1));
        mapa.agregar(madera, madera.getPosicion());

        assertNotNull(mapa.getObjetoUbicable(posicion));
    }

    @Test
    public void test03VerificaQueNoSePuedeOcuparUnCasilleroOcupado() {
        Mapa mapa = new Mapa(5, 5);

        MaterialMineral madera = new MaderaMineral(new Posicion(0,0));
        mapa.agregar(madera, madera.getPosicion());

        assertFalse(mapa.posicionEsValida(new Posicion(0,0)));
    }

    @Test
    public void test04VerificaQueSePuedaOcuparUnCasilleroPorUnPersonaje() {

        Juego juego = Juego.getInstance();
        Mapa mapa = juego.getMapa();
        Posicion posicion = new Posicion(0,0);

        assertNotNull(mapa.getObjetoUbicable(posicion));
    }

    @Test
    public void test05VerificaQueSePuedaOcuparUnCasilleroPorUnMaterial() {

        Juego juego = Juego.getInstance();
        Mapa mapa = juego.getMapa();
        Posicion posicion = new Posicion(1,1);
        MaterialMineral madera = new MaderaMineral(posicion);

        mapa.agregar(madera, madera.getPosicion());

        assertNotNull(mapa.getObjetoUbicable(posicion));
    }
}
