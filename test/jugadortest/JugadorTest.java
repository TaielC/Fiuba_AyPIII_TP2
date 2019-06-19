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

        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();

        Herramienta herramienta = jugador.obtenerDeInventario(0);

        assertEquals(Hacha.class, herramienta.getClass());
        assertEquals(MaderaMaterialHerramienta.class, herramienta.material().getClass());
        assertTrue(jugador.inventarioEstaVacio());
    }

    @Test
    public void test02ElJugadorAgregaCorrectamenteUnaHerramientaAlInventario() {

        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());

        int posicion = jugador.agregarAInventario(hacha);

        assertEquals(hacha,jugador.obtenerDeInventario(posicion));
    }


    @Test
    public void test03ElJugadorAgregaCorrectamenteUnaHerramientaAlInventarioSeleccionandoSuPosicionEnElMismo() {

        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());

        jugador.agregarAInventario(pico,2);

        assertEquals(pico,jugador.obtenerDeInventario(2));
    }


    @Test
    public void test04DeberiaVincularUnCasilleroDeFormaCorrectaAlJugadorDeLaPartida() {

        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();
        Posicion posicionJugador = jugador.getPosicion();

        assertEquals(posicionJugador, jugador.getPosicion());

    }

    @Test
    public void test05ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaArriba() {

        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();

        juego.moverJugadorHacia(Direccion.arriba());
        Posicion nuevaPosicionJugador = jugador.getPosicion();
        Posicion posicion = new Posicion(0,1);

        assertTrue(nuevaPosicionJugador.equals(posicion));

    }

    @Test
    public void test06ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaAbajo() {

        Juego juego = Juego.resetJuego();

        Jugador jugador = juego.getJugador();

        juego.moverJugadorHacia(Direccion.arriba());
        juego.moverJugadorHacia(Direccion.abajo());
        Posicion nuevaPosicionJugador = jugador.getPosicion();
        Posicion posicion = new Posicion(0,0);

        assertTrue(nuevaPosicionJugador.equals(posicion));

    }

    @Test
    public void test07ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaDerecha() {

        Juego juego = Juego.resetJuego();
        Jugador jugador = juego.getJugador();

        juego.moverJugadorHacia(Direccion.derecha());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertEquals(nuevaPosicionJugador, new Posicion(1, 0));
    }

    @Test
    public void test08ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaIzquierda() {
        Juego juego = Juego.resetJuego();
        Jugador jugador = juego.getJugador();

        juego.moverJugadorHacia(Direccion.derecha());
        juego.moverJugadorHacia(Direccion.izquierda());
        Posicion nuevaPosicionJugador = jugador.getPosicion();
        Posicion posicion = new Posicion(0,0);

        assertEquals(posicion, nuevaPosicionJugador);

    }

    @Test
    public void test09ElJugadorNoDeberiaMoverseDeCasilleroSiElMismoEstaOcupado() {
        Juego juego = Juego.resetJuego();
        Mapa mapa = juego.getMapa();
        Jugador jugador = juego.getJugador();
        Posicion posicionJugador = jugador.getPosicion();
        MaterialMineral madera = new MaderaMineral(new Posicion(0,1));
        mapa.agregar(madera, madera.getPosicion());

        juego.moverJugadorHacia(Direccion.arriba());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertEquals(nuevaPosicionJugador, posicionJugador);
    }

}