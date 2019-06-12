package algocraft;

import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.material.Madera;

public class Jugador {

    private Inventario inventario;
    private Casillero casillero;
    private Herramienta herramientaEquipada;
    private Tablero tablero;

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

    public void setCasillero(Casillero casillero){
        this.casillero = casillero;

    }
    public void setTablero(Tablero tablero){
        this.tablero = tablero;
    }

    public void moverHaciaArriba(){
        casillero = this.tablero.modificarHaciaArriba(casillero);
    }



}
