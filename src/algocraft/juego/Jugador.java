package algocraft.juego;

import algocraft.excepciones.HerramientaRotaException;
import algocraft.herramienta.*;
import algocraft.inventario.InventarioJugador;
import algocraft.inventario.InventarioHerramientas;
import algocraft.inventario.InventarioMateriales;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.materialmineral.MaterialMineral;

public class Jugador implements ObjetoUbicable{

    private InventarioJugador inventarioJugador;
    private Posicion posicion;
    private Herramienta herramientaEquipada;

    public Jugador(Posicion posicion) {
        inventarioJugador = new InventarioJugador();
        inventarioJugador.agregarHerramienta(new Hacha(new MaderaMaterialHerramienta()));
        this.posicion = posicion;
        herramientaEquipada = new NingunaHerramienta();
    }

    public Herramienta getHerramientaEquipada() {
        return herramientaEquipada;
    }

    public void usarHerramientaEquipada(MaterialMineral material){
        try{
            herramientaEquipada.usar(material);
        } catch (HerramientaRotaException e) {
            herramientaEquipada = new NingunaHerramienta();
        }
    }

    public void equiparDeInventario(int posicion){
        herramientaEquipada = inventarioJugador.intercambiarHerramienta(herramientaEquipada, posicion);
    }

    public int agregarAInventario(Herramienta herramienta) {
        return inventarioJugador.agregarHerramienta(herramienta);
    }

    public void agregarAInventario(Herramienta herramienta, int posicion) {
        inventarioJugador.agregarHerramienta(herramienta, posicion);
    }

    public Herramienta obtenerDeInventario(int posicion) {
        return inventarioJugador.obtenerHerramienta(posicion);
    }

    @Override
    public Posicion getPosicion() {
        return this.posicion;
    }

    @Override
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public InventarioHerramientas getInventarioHerramientas() {
        return inventarioJugador.getInventarioHerramientas();
    }

    public InventarioMateriales getInventarioMateriales() {
        return inventarioJugador.getInventarioMateriales();
    }
}