package jugadortest;

import algocraft.juego.*;
import algocraft.herramienta.*;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.materialherramienta.PiedraMaterialHerramienta;
import algocraft.materialmineral.MaderaMineral;
import algocraft.materialmineral.MaterialMineral;

import algocraft.materialmineral.MaterialMineralNulo;
import org.junit.Test;
import static org.junit.Assert.*;


public class JugadorTest {

    @Test
    public void test01ElJugadorSeInicializaCorrectamenteConUnHachaDeMaderaEnSuInventario(){
        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();

        Herramienta herramienta = jugador.obtenerHerramientaDeInventario(0);

        assertEquals(Hacha.class, herramienta.getClass());
        assertEquals(MaderaMaterialHerramienta.class, herramienta.material().getClass());
    }

    @Test
    public void test02ElJugadorAgregaCorrectamenteUnaHerramientaAlInventario() {
        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());

        int posicion = jugador.agregarAInventario(hacha);

        assertEquals(hacha,jugador.obtenerHerramientaDeInventario(posicion));
    }


    @Test
    public void test03ElJugadorAgregaCorrectamenteUnaHerramientaAlInventarioSeleccionandoSuPosicionEnElMismo() {
        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());

        jugador.agregarAInventario(pico);

        assertEquals(pico,jugador.obtenerHerramientaDeInventario(1));
    }


    @Test
    public void test04DeberiaVincularUnCasilleroDeFormaCorrectaAlJugadorDeLaPartida() {
        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();
        Posicion posicionJugador = jugador.getPosicion();

        assertEquals(posicionJugador, jugador.getPosicion());
    }

    @Test
    public void test05ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaArriba() {
        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        Jugador jugador = juego.getJugador();

        Posicion posicion = new Posicion(10,5);
        Mapa mapa = juego.getMapa();
        ObjetoUbicable materialMineralNulo = new MaterialMineralNulo();
        mapa.agregar(materialMineralNulo, posicion);
        juego.moverJugadorHacia(Direccion.ARRIBA);

        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertEquals(nuevaPosicionJugador,posicion);

    }

    @Test
    public void test06ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaAbajo() {
        Juego juego = Juego.resetJuego();
        Jugador jugador = juego.getJugador();
        Mapa mapa = juego.getMapa();
        Posicion posicion = new Posicion(10,5);
        ObjetoUbicable aire = new MaterialMineralNulo();
        mapa.agregar(aire, posicion);
        juego.moverJugadorHacia(Direccion.ARRIBA);

        juego.moverJugadorHacia(Direccion.ABAJO);
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        Posicion posicionEsperada = new Posicion(10,6);

        assertEquals(nuevaPosicionJugador,posicionEsperada);
    }

    @Test
    public void test07ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaDerecha() {
        Juego.resetJuego();
        Juego juego = Juego.resetJuego();
        Jugador jugador = juego.getJugador();

        Posicion posicion = new Posicion(11,6);
        Mapa mapa = juego.getMapa();
        ObjetoUbicable aire = new MaterialMineralNulo();
        mapa.agregar(aire, posicion);

        juego.moverJugadorHacia(Direccion.DERECHA);
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertEquals(posicion, nuevaPosicionJugador);
    }

    @Test
    public void test08ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaIzquierda() {
        Juego juego = Juego.resetJuego();
        Jugador jugador = juego.getJugador();
        Mapa mapa = juego.getMapa();

        Posicion posicion = new Posicion(11,6);
        ObjetoUbicable aire = new MaterialMineralNulo();
        mapa.agregar(aire, posicion);

        juego.moverJugadorHacia(Direccion.DERECHA);
        juego.moverJugadorHacia(Direccion.IZQUIERDA);
        Posicion nuevaPosicionJugador = jugador.getPosicion();
        Posicion posicion_ = new Posicion(10,6);

        assertEquals(nuevaPosicionJugador,posicion_);
    }

    @Test
    public void test09ElJugadorNoDeberiaMoverseDeCasilleroSiElMismoEstaOcupado() {
        Juego juego = Juego.resetJuego();
        Mapa mapa = juego.getMapa();
        Jugador jugador = juego.getJugador();
        Posicion posicionJugador = jugador.getPosicion();
        MaterialMineral madera = new MaderaMineral(new Posicion(10,6));
        mapa.agregar(madera, madera.getPosicion());

        juego.moverJugadorHacia(Direccion.ARRIBA);
        Posicion nuevaPosicionJugador = jugador.getPosicion();

        assertEquals(nuevaPosicionJugador, posicionJugador);
    }

}