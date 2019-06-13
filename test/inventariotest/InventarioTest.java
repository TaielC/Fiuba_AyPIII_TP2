package inventariotest;

import algocraft.Inventario;
import algocraft.herramienta.*;
import algocraft.material.Madera;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventarioTest {

	@Test
    public void test01SePuedeAgregarUnaHerramientaAlInventarioYObtenerlaDeSuPosicionLuego() {
        
    	Herramienta hacha = new Hacha(new Madera());
        Inventario inventario = inventario.getInstance();
        int posicion = inventario.agregar(hacha);
        
    	assertEquals(0, posicion);
        assertEquals(hacha, inventario.obtener(posicion));
    }

    @Test
    public void test02AgregarUnaHerramientaEnUnaPosicionAEleccionSePuedeObtenerNuevamente() {
        Herramienta hacha = new Hacha(new Madera());
        Inventario inventario = inventario.getInstance();
        int posicion = 10;

        inventario.agregar(hacha, posicion);
        assertEquals(hacha, inventario.obtener(posicion));
    }
    
    public void test03DeberiaEliminarUnaHerramientaEnUnaPosicionDeterminada() {
    	
    	Herramienta hacha = new Hacha(new Madera());
    	Inventario inventario = inventario.getInstance();
    	int posicion=2;
    	
    	inventario.agregar(hacha,posicion);
    	
    	assertEquals(hacha , inventario.obtener(posicion));
    	
    	inventario.eliminar(posicion);
    	
    	assertEquals(0,inventario.obtener(posicion)); //Tomo el 0 como vacio.
    }
    
    public void test04DeberiaVerificarQueElInventarioSePuedaVaciarCorrectamente() {
    	
    	Herramienta hacha = new Hacha(new Madera());
    	Inventario inventario = inventario.getInstance();
    	int posicion=2;
    	
    	inventario.agregar(hacha,posicion);
    	
    	assertEquals(false,inventario.estaVacio());
    	
    	inventario.eliminar(posicion);
    	
    	assertEquals(true,inventario.estaVacio());
    }




}