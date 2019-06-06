package algocraft;

import algocraft.herramienta.Hacha;
import algocraft.material.Madera;

import java.util.LinkedList;

public class Jugador {

    private LinkedList<Item> inventario;

    private static Jugador instanciaJugador = new Jugador();

    public static Jugador getInstance() { return instanciaJugador; }

    private Jugador() {
        inventario = new LinkedList<Item>();
        inventario.add(new Hacha(new Madera()));
    }

    public LinkedList<Item> getInventario(){ return inventario; }
}
