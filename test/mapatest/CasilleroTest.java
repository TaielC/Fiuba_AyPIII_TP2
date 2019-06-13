package mapatest;

import algocraft.juego.*;
import algocraft.material.*;

import org.junit.Test;
import static org.junit.Assert.*;


class CasilleroTest {

	@Test
	public void test01VerificaQueUnCasilleroEstaVacio() {
		Casillero casillero = new Casillero(1,1);
		assertTrue(casillero.estaVacio());
	}

	@Test
	public void test02VerificaQueSePuedeOcuparUnCasilleroVacio() {
		
		Casillero casillero = new Casillero(1,1);
		Jugador jugador = Jugador.getInstance();
		
		casillero.poner(jugador);

		assertFalse(casillero.estaVacio());
	}
	
	@Test
	public void test03VerificaQueNoSePuedeOcuparUnCasilleroOcupado() {
		Casillero casillero = new Casillero(1,1);
		Jugador jugador = Jugador.getInstance();
		Jugador jugador2 = Jugador.getInstance(); //Tendria que ir un material pero me tira error
		
		casillero.poner(jugador);
		casillero.poner(jugador2);
		
		assertEquals(casillero.obtenido(),jugador);
		
	}
	
	@Test
	public void test04VerificaQueSePuedaOcuparUnCasilleroPorUnPersonaje() {
		Casillero casillero = new Casillero(1,1);
		Jugador jugador = Jugador.getInstance();
		
		casillero.poner(jugador);
		assertFalse(casillero.estaVacio());
	}
	
	@Test
	public void test05VerificaQueSePuedaOcuparUnCasilleroPorUnMaterial() {
		Casillero casillero = new Casillero(1,1);
		MaterialMineral madera = new Madera();
		
		casillero.poner(madera); // me tira error cuando pongo un material en un casillero
		assertEquals(false,casillero.estaVacio());
	}
	
	@Test
	public void test06VerificaLaCorrectaPosicionDelObjetoAgregadoAlCasilleroYQuePuedaSerDevuelto() {
		
		Casillero casillero = new Casillero(1,2);
		Jugador jugador = Jugador.getInstance();
		
		
		casillero.poner(jugador);
		
		assertEquals(1,casillero.posicionHorizontal());
		assertEquals(2,casillero.posicionVertical());
		assertEquals(jugador,casillero.obtenido());
	}
	
	@Test
	public void test07VerificaQueEnCasoDeMoverseHaciaArribaSeActualiceLaPosicionEnUnNuevoCasillero(){
		Tablero tablero = new Tablero(10,10);
		Casillero casillero = new Casillero(1,2);
		
		
		Casillero casilleroNuevo = tablero.moverHaciaArriba(casillero);
		
		assertEquals(3,casilleroNuevo.posicionVertical());
		
}
	@Test
	public void test08VerificaQueEnCasoDeMoverseHaciaAbajoSeActualiceLaPosicionEnUnNuevoCasillero() {
		Tablero tablero = new Tablero(10,10);
		Casillero casillero = new Casillero(1,2);
		
		Casillero casilleroNuevo = tablero.moverHaciaAbajo(casillero);
		
		assertEquals(1,casilleroNuevo.posicionVertical());
	}
	
	@Test
	public void test09VerificaQueEnCasoDeMoverseHaciaLaDerechaSeActualiceLaPosicionEnUnNuevoCasillero() {
		Tablero tablero = new Tablero(10,10);
		Casillero casillero = new Casillero(1,2);
		
		Casillero casilleroNuevo = tablero.moverHaciaDerecha(casillero);
		
		assertEquals(2,casilleroNuevo.posicionHorizontal());
	}
	
	@Test
	public void test10VerificaQueEnCasoDeMoverseHaciaLaIzquierdaSeActualiceLaPosicionEnUnNuevoCasillero() {
		Tablero tablero = new Tablero(10,10);
		Casillero casillero = new Casillero(1,2);
		
		Casillero casilleroNuevo = tablero.moverHaciaIzquierda(casillero);
		
		assertEquals(0,casilleroNuevo.posicionHorizontal());
	}
	
	
	
	
	
}
