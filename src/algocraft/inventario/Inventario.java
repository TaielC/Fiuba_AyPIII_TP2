package algocraft.inventario;

import algocraft.herramienta.Herramienta;

public class Inventario {

    private InventarioMateriales inventarioMateriales;
    private InventarioHerramientas inventarioHerramientas;

    public Inventario(){
        inventarioHerramientas = new InventarioHerramientas();
        inventarioMateriales = new InventarioMateriales();
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

    public boolean estaVacio() { return inventarioHerramientas.estaVacio(); }

    public Herramienta intercambiarHerramienta(Herramienta herramienta, int posicion){
        return inventarioHerramientas.intercambiarHerramienta(herramienta, posicion);
    }
}
