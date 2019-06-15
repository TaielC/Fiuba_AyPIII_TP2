package algocraft.juego;

import algocraft.herramienta.*;
import algocraft.material.*;

public class Jugador {

    private Inventario inventario;

    private static Jugador instanciaJugador = new Jugador();
    public static Jugador getInstance() { return instanciaJugador; }

    private Jugador() {
        inventario = new Inventario();
        inventario.agregarHerramienta(new Hacha(new MaderaMaterialHerramienta()));
    }

    public int agregarAInventario(Herramienta herramienta) {
        return inventario.agregarHerramienta(herramienta);
    }

    public void agregarAInventario(Herramienta herramienta, int posicion) {
        inventario.agregarHerramienta(herramienta, posicion);
    }

    public Herramienta obtenerDeInventario(int posicion) {
        return inventario.obtenerHerramienta(posicion);
    }

    public boolean inventarioEstaVacio() {
        return inventario.estaVacio();
    }

}

