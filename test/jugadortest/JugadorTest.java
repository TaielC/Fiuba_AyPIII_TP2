package jugadortest;

import algocraft.juego.*;
import algocraft.herramienta.*;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.materialherramienta.PiedraMaterialHerramienta;
import algocraft.materialmineral.MaderaMineral;
import algocraft.materialmineral.MaterialMineral;

import algocraft.materialmineral.NingunMaterialMineral;
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
        Mapa mapa = juego.getMapa();


        Posicion posicion = new Posicion(0,1);
        ObjetoUbicable aire = new NingunMaterialMineral();
        mapa.agregar(aire, posicion);
        juego.moverJugadorHacia(Direccion.arriba());


        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertEquals(nuevaPosicionJugador,posicion);

    }

    @Test
    public void test06ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaAbajo() {

        Juego juego = Juego.resetJuego();

        Jugador jugador = juego.getJugador();

        Mapa mapa = juego.getMapa();
        Posicion posicion = new Posicion(0,1);
        ObjetoUbicable aire = new NingunMaterialMineral();
        mapa.agregar(aire, posicion);
        juego.moverJugadorHacia(Direccion.arriba());

        juego.moverJugadorHacia(Direccion.abajo());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        Posicion posicion_ = new Posicion(0,0);

        assertEquals(nuevaPosicionJugador,posicion_);

    }

    @Test
    public void test07ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaDerecha() {

        Juego juego = Juego.resetJuego();
        Jugador jugador = juego.getJugador();
        Mapa mapa = juego.getMapa();

        Posicion posicion = new Posicion(1,0);
        ObjetoUbicable aire = new NingunMaterialMineral();
        mapa.agregar(aire, posicion);

        juego.moverJugadorHacia(Direccion.derecha());
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertEquals(nuevaPosicionJugador,posicion);
    }

    @Test
    public void test08ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaIzquierda() {
        Juego juego = Juego.resetJuego();
        Jugador jugador = juego.getJugador();
        Mapa mapa = juego.getMapa();

        Posicion posicion = new Posicion(1,0);
        ObjetoUbicable aire = new NingunMaterialMineral();
        mapa.agregar(aire, posicion);

        juego.moverJugadorHacia(Direccion.derecha());
        juego.moverJugadorHacia(Direccion.izquierda());
        Posicion nuevaPosicionJugador = jugador.getPosicion();
        Posicion posicion_ = new Posicion(0,0);

        assertEquals(nuevaPosicionJugador,posicion_);

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