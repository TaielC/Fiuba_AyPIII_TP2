package algocraft.juego;

import algocraft.herramienta.*;
import algocraft.material.*;
import algocraft.inventario.Inventario;
import algocraft.herramienta.material.MaderaMaterialHerramienta;

public class Jugador implements ObjetoUbicable{

    private Inventario inventario;
    private Tablero tablero;
    private Posicion posicion;
    private Direccion direccion;

    public Jugador(Tablero tablero, Posicion posicion) {
        inventario = new Inventario();
        inventario.agregarHerramienta(new Hacha(new MaderaMaterialHerramienta()));
        this.tablero = tablero;
        this.posicion = posicion;
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

    public void moverHacia(Direccion direccion) {
        this.direccion = direccion;
        Posicion siguientePosicion = this.posicion.obtenerSiguiente(direccion);

        if (this.tablero.sePuedeMover(siguientePosicion)) {
            this.posicion = siguientePosicion;
            //Deberia lanzar una excepcion si esta en el borde
        }
    }

    @Override
    public Posicion getPosicion() {
        return this.posicion;
    }

    @Override
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

}