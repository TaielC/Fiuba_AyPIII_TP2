package algocraft.juego;

import algocraft.herramienta.*;
import algocraft.material.*;

public class Jugador implements ObjetoUbicable{

    private Inventario inventario;
    private Tablero tablero;
    private Casillero casillero;

    private static Jugador instanciaJugador = new Jugador();
    public static Jugador getInstance() { return instanciaJugador; }

    private Jugador() {
        inventario = new Inventario();
        inventario.agregar(new Hacha(new MaderaMaterialHerramienta()));
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

    public void vincularTablero(Tablero tablero){ this.tablero = tablero; }

    public void vincularCasillero(Casillero casillero_){ casillero = casillero_; }

    public void moverHaciaArriba(){ casillero=tablero.moverHaciaArriba(casillero); }

    public void moverHaciaAbajo(){ casillero=tablero.moverHaciaAbajo(casillero); }

    public void moverHaciaIzquierda(){ casillero=tablero.moverHaciaIzquierda(casillero); }

    public void moverHaciaDerecha(){ casillero=tablero.moverHaciaDerecha(casillero); }

    @Override
    public int obtenerPosicionHorizontal() {
        return casillero.posicionHorizontal();
    }

    @Override
    public int obtenerPosicionVertical() {
        return casillero.posicionVertical();
    }
}

