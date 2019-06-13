package algocraft;

import algocraft.herramienta.Hacha;
import algocraft.herramienta.Herramienta;
import algocraft.material.Madera;

public class Jugador implements ObjetoUbicable{

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
    
    public int obtenerPosicionHorizontal() {
    	return casillero.posicionHorizontal();
    }
    
    public int obtenerPosicionVertical() {
    	return casillero.posicionVertical();
    }

    public void vincularTablero(Tablero tablero_){ tablero = tablero_; }

    public void vincularCasillero(Casillero casillero_){ casillero = casillero_; }

    public void moverHaciaArriba(){ casillero=tablero.moverHaciaArriba(casillero); }

    public void moverHaciaAbajo(){ casillero=tablero.moverHaciaAbajo(casillero); }

    public void moverHaciaIzquierda(){ casillero=tablero.moverHaciaIzquierda(casillero); }

    public void moverHaciaDerecha(){ casillero=tablero.moverHaciaDerecha(casillero); }
}
