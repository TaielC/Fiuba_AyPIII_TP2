package juego;

import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.material.Madera;

public class Jugador implements ObjectoUbicable{

    private Inventario inventario;
    private Tablero tablero;
    private Casillero casillero;

    private static Jugador instanciaJugador = new Jugador();
    public static Jugador getInstance() { return instanciaJugador; }

    private Jugador() {
        inventario = Inventario.getInstance();
        inventario.agregar(new Hacha(new Madera()));
    }

    public int agregarAInventario(Herramienta herramienta) {
        return inventario.agregar(herramienta);
    }

    public void agregarAInventario(Herramienta herramienta, int posicion) {
        inventario.agregar(herramienta, posicion);
    }

    public Herramienta obtenerDeInventario(int posicion) {
        return inventario.obtener(posicion);
    }

    public boolean inventarioEstaVacio() {
        return inventario.estaVacio();
    }

    public void vincularTablero(Tablero tablero_){ tablero = tablero_; }

    public void vincularCasillero(Casillero casillero_){ casillero = casillero_; }

    public void moverHaciaArriba(){ tablero.moverHaciaArriba(casillero); }

    public void moverHaciaAbajo(){ tablero.moverHaciaAbajo(casillero); }

    public void moverHaciaIzquierda(){ tablero.moverHaciaIzquierda(casillero); }

    public void moverhaciaDerecha(){ tablero.moverHaciaDerecha(casillero) }
}

