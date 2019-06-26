package algocraft.inventario;

import algocraft.herramienta.Herramienta;

public class InventarioJugador {

    private InventarioMateriales inventarioMateriales;
    private InventarioHerramientas inventarioHerramientas;

    public InventarioJugador(){
        inventarioHerramientas = new InventarioHerramientas(10);
        inventarioMateriales = new InventarioMateriales();
    }

    public InventarioHerramientas getInventarioHerramientas() {
        return inventarioHerramientas;
    }

    public int agregarHerramienta(Herramienta herramienta) {
        return inventarioHerramientas.agregarHerramienta(herramienta);
    }

    public void agregarHerramienta(Herramienta herramienta, int posicion) {
        inventarioHerramientas.agregarHerramienta(herramienta, posicion);
    }

    public Herramienta obtenerHerramienta(int posicion){
        return inventarioHerramientas.obtenerHerramienta(posicion);
    }

    public Herramienta intercambiarHerramienta(Herramienta herramienta, int posicion){
        return inventarioHerramientas.intercambiarHerramienta(herramienta, posicion);
    }

}
