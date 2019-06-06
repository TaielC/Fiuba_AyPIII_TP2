package jugadortest;

import algocraft.*;
import algocraft.herramienta.*;
import algocraft.material.*;
import java.util.LinkedList;

import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


public class JugadorTest {

    @Test
    public void test01ElJugadorSeInicializaCorrectamenteConUnHachaDeMaderaEnSuInventario(){
        Jugador jugador = Jugador.getInstance();
        LinkedList<Item> listaEsperada = new LinkedList<>();

        listaEsperada.add(new Hacha(new Madera()));
        LinkedList<Item> inventario = jugador.getInventario();

        boolean listasSonIguales = ((listaEsperada.size() == inventario.size()) && inventario.containsAll(listaEsperada));

        assertTrue(listasSonIguales);
    }

}