package algocraft.inventario;

import algocraft.excepciones.InventarioEstaLlenoException;
import algocraft.excepciones.PosicionDeInventarioHerramientasInvalidaException;
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

    private void comprobarEspacioLibreDisponible() {
        if(herramientas.length == cantidadHerramientas){
            throw new InventarioEstaLlenoException();
        }
    }

    public int agregarHerramienta(Herramienta herramienta) {
        this.comprobarEspacioLibreDisponible();
        int i;
        for(i = 0; i <= cantidadHerramientas || i < herramientas.length ; i++) {
            if (herramientas[i] == null) {
                herramientas[i] = herramienta;
                cantidadHerramientas++;
                break;
            }
        }
        return i;
    }

    public void agregarHerramienta(Herramienta herramienta, int posicion) {
        this.comprobarEspacioLibreDisponible();
        herramientas[posicion] = herramienta;
        cantidadHerramientas++;
    }

    public Herramienta obtenerHerramienta(int posicion){
        if(herramientas[posicion] == null){
            // Lanzar excepcion o devolver nada
        }
        Herramienta herramienta;
        try {
            herramienta = herramientas[posicion];
        } catch (IndexOutOfBoundsException e) {
            throw new PosicionDeInventarioHerramientasInvalidaException();
        }
        herramientas[posicion] = null;
        cantidadHerramientas--;
        return herramienta;
    }

    public boolean estaVacio() {
        return cantidadHerramientas == 0;
    }
}
