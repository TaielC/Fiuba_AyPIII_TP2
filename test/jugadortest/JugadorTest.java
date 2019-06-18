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

        Tablero tablero = new Tablero(100,100);
        Posicion posicionJugador = new Posicion(0,0);
        Jugador jugador = new Jugador(tablero, posicionJugador);


        Herramienta herramienta = jugador.obtenerDeInventario(0);

        assertEquals(Hacha.class, herramienta.getClass());
        assertEquals(MaderaMaterialHerramienta.class, herramienta.material().getClass());
        assertTrue(jugador.inventarioEstaVacio());
    }

    @Test
    public void test02ElJugadorAgregaCorrectamenteUnaHerramientaAlInventario() {

        Tablero tablero = new Tablero(100,100);
        Posicion posicionJugador = new Posicion(0,0);
        Jugador jugador = new Jugador(tablero, posicionJugador);
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());

        int posicion = jugador.agregarAInventario(hacha);

        assertEquals(hacha,jugador.obtenerDeInventario(posicion));
    }


    @Test
    public void test03ElJugadorAgregaCorrectamenteUnaHerramientaAlInventarioSeleccionandoSuPosicionEnElMismo() {

        Tablero tablero = new Tablero(100,100);
        Posicion posicionJugador = new Posicion(0,0);
        Jugador jugador = new Jugador(tablero, posicionJugador);
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());

        jugador.agregarAInventario(pico,2);

        assertEquals(pico,jugador.obtenerDeInventario(2));
    }


    @Test
    public void test04DeberiaVincularUnCasilleroDeFormaCorrectaAlJugadorDeLaPartida() {

        Tablero tablero = new Tablero(100,100);
        Posicion posicionJugador = new Posicion(0,0);
        Jugador jugador = new Jugador(tablero, posicionJugador);

        assertTrue(posicionJugador.esIgualA(jugador.getPosicion()));

    }

    @Test
    public void test05ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaArriba() {

        Tablero tablero = new Tablero(100,100);
        Posicion posicionJugador = new Posicion(0,0);
        Jugador jugador = new Jugador(tablero, posicionJugador);

        jugador.moverHacia(Direccion.arriba());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertTrue(nuevaPosicionJugador.esIgualA(new Posicion(0,1)));

    }

    @Test
    public void test06ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaAbajo() {

        Tablero tablero = new Tablero(100,100);
        Posicion posicionJugador = new Posicion(0,1);
        Jugador jugador = new Jugador(tablero, posicionJugador);

        jugador.moverHacia(Direccion.abajo());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertTrue(nuevaPosicionJugador.esIgualA(new Posicion(0,0)));

    }

    @Test
    public void test07ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaDerecha() {

        Tablero tablero = new Tablero(100,100);
        Posicion posicionJugador = new Posicion(0,0);
        Jugador jugador = new Jugador(tablero, posicionJugador);

        jugador.moverHacia(Direccion.derecha());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertTrue(nuevaPosicionJugador.esIgualA(new Posicion(1,0)));
    }

    @Test
    public void test08ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaIzquierda() {

        Tablero tablero = new Tablero(100,100);
        Posicion posicionJugador = new Posicion(1,0);
        Jugador jugador = new Jugador(tablero, posicionJugador);

        jugador.moverHacia(Direccion.izquierda());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertTrue(nuevaPosicionJugador.esIgualA(new Posicion(0,0)));

    }

    @Test
    public void test09ElJugadorNoDeberiaMoverseDeCasilleroSiElMismoEstaOcupado() {

        Tablero tablero = new Tablero(100,100);
        Posicion posicionJugador = new Posicion(1,1);
        Jugador jugador = new Jugador(tablero, posicionJugador);
        MaterialMineral madera = new MaderaMineral(new Posicion(2,1));
        tablero.agregar(madera, madera.getPosicion());

        jugador.moverHacia(Direccion.derecha());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertTrue(nuevaPosicionJugador.esIgualA(posicionJugador));
    }

}