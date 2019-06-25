package algocraft.juego;

import algocraft.herramienta.*;
import algocraft.inventario.Inventario;
import algocraft.materialherramienta.MaderaMaterialHerramienta;

public class Jugador implements ObjetoUbicable{

    private Inventario inventario;
    private Posicion posicion;
    private Herramienta herramientaEquipada;

    public Jugador(Posicion posicion) {
        inventario = new Inventario();
        inventario.agregarHerramienta(new Hacha(new MaderaMaterialHerramienta()));
        this.posicion = posicion;
        herramientaEquipada = new NingunaHerramienta();
    }

    public void usarHerramientaEquipada(ObjetoUbicable objetoUbicable){
        herramientaEquipada.usar(objetoUbicable);
    }

    public void equiparDeInventario(int posicion){
        Herramienta herramienta = inventario.intercambiarHerramienta(herramientaEquipada, posicion);
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


    @Override
    public Posicion getPosicion() {
        return this.posicion;
    }

    @Override
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}