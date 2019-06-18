package jugadortest;

import algocraft.juego.*;
import algocraft.herramienta.*;
import algocraft.herramienta.material.MaderaMaterialHerramienta;
import algocraft.herramienta.material.PiedraMaterialHerramienta;
import algocraft.material.MaderaMineral;
import algocraft.material.MaterialMineral;

import org.junit.Test;
import static org.junit.Assert.*;


public class JugadorTest {

    @Test
    public void test01ElJugadorSeInicializaCorrectamenteConUnHachaDeMaderaEnSuInventario(){

        Mapa mapa = Mapa.getInstance();
        Jugador jugador = mapa.getJugador();

        Herramienta herramienta = jugador.obtenerDeInventario(0);

        assertEquals(Hacha.class, herramienta.getClass());
        assertEquals(MaderaMaterialHerramienta.class, herramienta.material().getClass());
        assertTrue(jugador.inventarioEstaVacio());
    }

    @Test
    public void test02ElJugadorAgregaCorrectamenteUnaHerramientaAlInventario() {

        Mapa mapa = Mapa.getInstance();
        Jugador jugador = mapa.getJugador();
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());

        int posicion = jugador.agregarAInventario(hacha);

        assertEquals(hacha,jugador.obtenerDeInventario(posicion));
    }


    @Test
    public void test03ElJugadorAgregaCorrectamenteUnaHerramientaAlInventarioSeleccionandoSuPosicionEnElMismo() {

        Mapa mapa = Mapa.getInstance();
        Jugador jugador = mapa.getJugador();
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());

        jugador.agregarAInventario(pico,2);

        assertEquals(pico,jugador.obtenerDeInventario(2));
    }


    @Test
    public void test04DeberiaVincularUnCasilleroDeFormaCorrectaAlJugadorDeLaPartida() {

        Mapa mapa = Mapa.getInstance();
        Jugador jugador = mapa.getJugador();
        Posicion posicionJugador = jugador.getPosicion();

        assertTrue(posicionJugador.esIgualA(jugador.getPosicion()));

    }

    @Test
    public void test05ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaArriba() {

        Mapa mapa = Mapa.getInstance();
        Jugador jugador = mapa.getJugador();

        mapa.moverJugadorHacia(Direccion.arriba());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertTrue(nuevaPosicionJugador.esIgualA(new Posicion(0,1)));

    }

    @Test
    public void test06ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaAbajo() {

        Mapa mapa = Mapa.getInstance();
        Jugador jugador = mapa.getJugador();

        mapa.moverJugadorHacia(Direccion.arriba());
        mapa.moverJugadorHacia(Direccion.abajo());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertTrue(nuevaPosicionJugador.esIgualA(new Posicion(0,0)));

    }

    @Test
    public void test07ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaDerecha() {

        Mapa mapa = Mapa.getInstance();
        Jugador jugador = mapa.getJugador();

        mapa.moverJugadorHacia(Direccion.derecha());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertTrue(nuevaPosicionJugador.esIgualA(new Posicion(1,0)));
    }

    @Test
    public void test08ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaIzquierda() {

        Mapa mapa = Mapa.getInstance();
        Jugador jugador = mapa.getJugador();

        mapa.moverJugadorHacia(Direccion.derecha());
        mapa.moverJugadorHacia(Direccion.izquierda());
        Posicion nuevaPosicionJugador = jugador.getPosicion();
        Posicion posicion = new Posicion(0,0);

        assertEquals(nuevaPosicionJugador.getString(), posicion.getString() );

    }

    @Test
    public void test09ElJugadorNoDeberiaMoverseDeCasilleroSiElMismoEstaOcupado() {

        Mapa mapa = Mapa.getInstance();
        Tablero tablero = mapa.getTablero();
        Jugador jugador = mapa.getJugador();
        Posicion posicionJugador = jugador.getPosicion();
        MaterialMineral madera = new MaderaMineral(new Posicion(0,1));
        tablero.agregar(madera, madera.getPosicion());

        jugador.moverHacia(Direccion.arriba());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertTrue(nuevaPosicionJugador.esIgualA(posicionJugador));
    }

}