package algocraft.juego;

import algocraft.excepciones.HerramientaRotaException;
import algocraft.herramienta.*;
import algocraft.inventario.InventarioHerramientas;
import algocraft.inventario.InventarioMateriales;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.materialinventario.MaterialInventario;
import algocraft.materialmineral.MaterialMineral;

public class Jugador implements ObjetoUbicable{

    private InventarioHerramientas inventarioHerramientas;
    private InventarioMateriales inventarioMateriales;
    private Posicion posicion;
    private Herramienta herramientaEquipada;

    public Jugador(Posicion posicion) {
        inventarioHerramientas = new InventarioHerramientas(10);
        inventarioHerramientas.agregarHerramienta(new Hacha(new MaderaMaterialHerramienta()));
        inventarioMateriales = new InventarioMateriales();
        this.posicion = posicion;
        herramientaEquipada = new HerramientaNula();
    }

    public Herramienta getHerramientaEquipada() {
        return herramientaEquipada;
    }

    public void usarHerramientaEquipada(MaterialMineral material){
        try{
            herramientaEquipada.usar(material);
        } catch (HerramientaRotaException e) {
            herramientaEquipada = new HerramientaNula();
        }
    }

    public void actualizarInventarioMateriales(InventarioMateriales nuevoInventario){ inventarioMateriales = nuevoInventario; }

    public void equiparDeInventario(int posicion){
        herramientaEquipada = inventarioHerramientas.intercambiarHerramienta(herramientaEquipada, posicion);
    }

    public int agregarAInventario(Herramienta herramienta) {
        return inventarioHerramientas.agregarHerramienta(herramienta);
    }

    public void agregarAInventario(MaterialInventario materialInventario) {
        inventarioMateriales.agregar(materialInventario);
    }

    public Herramienta obtenerHerramientaDeInventario(int posicion) {
        return inventarioHerramientas.obtenerHerramienta(posicion);
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
        return inventarioHerramientas;
    }

    public InventarioMateriales getInventarioMateriales() {
        return inventarioMateriales;
    }

}