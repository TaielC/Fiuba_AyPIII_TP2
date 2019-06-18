package algocraft.inventario;

import algocraft.excepciones.InventarioEstaLlenoException;
import algocraft.herramienta.Herramienta;

public class InventarioHerramientas {

    private Herramienta[] herramientas;
    private int cantidadHerramientas;

    public InventarioHerramientas(){
        herramientas = new Herramienta[10];
        for( int i = 0; i < herramientas.length; i++){
            herramientas[i] = null;
        }
        cantidadHerramientas = 0;
    }

    private void comprobarEspacioDisponible() {
        if(herramientas.length == cantidadHerramientas){
            throw new InventarioEstaLlenoException();
        }
    }

    public int agregarHerramienta(Herramienta herramienta) {
        this.comprobarEspacioDisponible();
        int i;
        for(i = 0; i <= cantidadHerramientas && i < herramientas.length ; i++) {
            if (herramientas[i] == null) {
                herramientas[i] = herramienta;
                cantidadHerramientas++;
                break;
            }
        }
        return i;
    }

    public void agregarHerramienta(Herramienta herramienta, int posicion) {
        this.comprobarEspacioDisponible();
        herramientas[posicion] = herramienta;
        cantidadHerramientas++;
    }

    public Herramienta obtenerHerramienta(int posicion){
        if(herramientas[posicion] == null){
            // Lanzar excepcion o devolver nada
        }
        Herramienta herramienta = herramientas[posicion];
        herramientas[posicion] = null;
        cantidadHerramientas--;
        return herramienta;
    }

    public boolean estaVacio() {
        return cantidadHerramientas == 0;
    }
}
