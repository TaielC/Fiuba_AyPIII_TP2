package jugadortest;

import algocraft.herramienta.material.MaderaMaterialHerramienta;
import algocraft.herramienta.material.PiedraMaterialHerramienta;
import algocraft.juego.*;
import algocraft.herramienta.*;
import algocraft.herramienta.Herramienta;

import org.junit.Test;
import static org.junit.Assert.*;


public class JugadorTest {

	@Test
	public void test01ElJugadorSeInicializaCorrectamenteSolamenteConUnHachaDeMaderaEnSuInventario(){
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

}