package algocraft.inventario;

import algocraft.excepciones.InventarioHerramientasEstaLlenoException;
import algocraft.excepciones.PosicionDeInventarioHerramientasInvalidaException;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.HerramientaNula;

public class InventarioHerramientas {

    private Herramienta[] herramientas;
    private int cantidadHerramientas;

    public InventarioHerramientas(int tamanio){
        herramientas = new Herramienta[tamanio];
        for( int i = 0; i < herramientas.length; i++){
            herramientas[i] = new HerramientaNula();
        }
        cantidadHerramientas = 0;
    }

    private void comprobarEspacioLibreDisponible() {
        if(herramientas.length == cantidadHerramientas){
            throw new InventarioHerramientasEstaLlenoException();
        }
    }

    public int agregarHerramienta(Herramienta herramienta) {
        this.comprobarEspacioLibreDisponible();
        int i;
        for(i = 0; i <= cantidadHerramientas || i < herramientas.length ; i++) {
            if (herramientas[i] instanceof HerramientaNula) {
                herramientas[i] = herramienta;
                cantidadHerramientas++;
                break;
            }
        }
        return i;
    }

    public Herramienta intercambiarHerramienta(Herramienta herramienta, int posicion) {
        Herramienta herramientaDevolver;
        try{
            herramientaDevolver = herramientas[posicion];
        } catch (IndexOutOfBoundsException e) {
            throw new PosicionDeInventarioHerramientasInvalidaException();
        }
        herramientas[posicion] = herramienta;
        return herramientaDevolver;
    }

    public void agregarHerramienta(Herramienta herramienta, int posicion) {
        this.comprobarEspacioLibreDisponible();
        intercambiarHerramienta(herramienta, posicion);
        cantidadHerramientas++;
    }

    public Herramienta obtenerHerramienta(int posicion){
        Herramienta herramienta = intercambiarHerramienta(new HerramientaNula(), posicion);
        if(!(herramienta instanceof HerramientaNula)){
            cantidadHerramientas--;
        }
        return herramienta;
    }

    public boolean estaVacio() {
        return cantidadHerramientas == 0;
    }

    public int getTamanio() {
        return herramientas.length;
    }

    public Herramienta ver(int posicion) {
        try{
            return herramientas[posicion];
        } catch (IndexOutOfBoundsException e) {
            throw new PosicionDeInventarioHerramientasInvalidaException();
        }
    }
}
