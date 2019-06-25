package algocraft.juego;

import algocraft.excepciones.HerramientaRotaException;
import algocraft.herramienta.*;
import algocraft.inventario.Inventario;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.materialmineral.MaterialMineral;

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

    public void usarHerramientaEquipada(MaterialMineral material){
        try{
            herramientaEquipada.usar(material);
        } catch (HerramientaRotaException e) {
            herramientaEquipada = new NingunaHerramienta();
        }
    }

    public void equiparDeInventario(int posicion){
        herramientaEquipada = inventario.intercambiarHerramienta(herramientaEquipada, posicion);
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