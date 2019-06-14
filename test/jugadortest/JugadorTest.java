package jugadortest;

import algocraft.juego.*;
import algocraft.herramienta.*;
import algocraft.herramienta.Herramienta;
import algocraft.material.*;

import org.junit.Test;
import static org.junit.Assert.*;


public class JugadorTest {

	@Test
	public void test01ElJugadorSeInicializaCorrectamenteConUnHachaDeMaderaEnSuInventario(){
		Jugador jugador = Jugador.getInstance();

		Herramienta herramienta = jugador.obtenerDeInventario(0);

		assertEquals(Hacha.class, herramienta.getClass());
		assertEquals(MaderaMaterialHerramienta.class, herramienta.material().getClass());
		assertTrue(jugador.inventarioEstaVacio());
	}

	@Test
	public void test02ElJugadorAgregaCorrectamenteUnaHerramientaAlInventario() {
		Jugador jugador = Jugador.getInstance();
		Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());

		int posicion = jugador.agregarAInventario(hacha);

		assertEquals(hacha,jugador.obtenerDeInventario(posicion));
	}


	@Test
	public void test03ElJugadorAgregaCorrectamenteUnaHerramientaAlInventarioSeleccionandoSuPosicionEnElMismo() {
		Jugador jugador = Jugador.getInstance();
		Herramienta pico = new Pico(new PiedraMaterialHerramienta());

		jugador.agregarAInventario(pico,2);

		assertEquals(pico,jugador.obtenerDeInventario(2));
	}


	@Test
	public void test04DeberiaVincularUnCasilleroDeFormaCorrectaAlJugadorDeLaPartida() {
		Jugador jugador = Jugador.getInstance();
		Casillero casillero = new Casillero(1,2);

		jugador.vincularCasillero(casillero);

		assertEquals(1,jugador.obtenerPosicionHorizontal());
		assertEquals(2,jugador.obtenerPosicionVertical());

	}

	@Test
	public void test05ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaArriba() {
		Jugador jugador = Jugador.getInstance();
		Tablero tablero = new Tablero(10,10);
		Casillero casillero = new Casillero(1,2);

		jugador.vincularTablero(tablero);
		jugador.vincularCasillero(casillero);

		jugador.moverHaciaArriba();

		assertEquals(3,jugador.obtenerPosicionVertical());

	}

	@Test
	public void test06ElJugadorDeberiaMoverseCorrectamenteEnFormaVerticalHaciaAbajo() {
		Jugador jugador = Jugador.getInstance();
		Tablero tablero = new Tablero(10,10);
		Casillero casillero = new Casillero(1,2);

		jugador.vincularTablero(tablero);
		jugador.vincularCasillero(casillero);

		jugador.moverHaciaAbajo();

		assertEquals(1,jugador.obtenerPosicionVertical());

	}

	@Test
	public void test07ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaDerecha() {
		Jugador jugador = Jugador.getInstance();
		Tablero tablero = new Tablero(10,10);
		Casillero casillero = new Casillero(1,2);

		jugador.vincularTablero(tablero);
		jugador.vincularCasillero(casillero);

		jugador.moverHaciaDerecha();

		assertEquals(2,jugador.obtenerPosicionHorizontal());
	}

	@Test
	public void test08ElJugadorDeberiaMoverseCorrectamenteEnFormaHorizontalHaciaIzquierda() {
		Jugador jugador = Jugador.getInstance();
		Tablero tablero = new Tablero(10,10);
		Casillero casillero = new Casillero(1,2);

		jugador.vincularTablero(tablero);
		jugador.vincularCasillero(casillero);

		jugador.moverHaciaIzquierda();

		assertEquals(0,jugador.obtenerPosicionHorizontal());

	}

    /*
    @Test
    public void test09ElJugadorNoDeberiaMoverseDeCasilleroSiElMismoEstaOcupado() {
        Jugador jugador = Jugador.getInstance();
        MaterialMineral madera = new Madera();
        Tablero tablero = new Tablero(10,10);
        Casillero casillero = new Casillero(1,2);

        tablero.agregar(madera, "0,2");

        jugador.vincularTablero(tablero);
        jugador.vincularCasillero(casillero);
        jugador.moverHaciaIzquierda();

        assertEquals(1,jugador.obtenerPosicionHorizontal());
    }*/

}