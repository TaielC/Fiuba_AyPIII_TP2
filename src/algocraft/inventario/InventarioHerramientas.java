package algocraft.inventario;

import algocraft.excepciones.InventarioEstaLlenoException;
import algocraft.excepciones.PosicionDeInventarioHerramientasInvalidaException;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.NingunaHerramienta;
import algocraft.materialinventario.NingunMaterialInventario;

public class InventarioHerramientas {

    private Herramienta[] herramientas;
    private int cantidadHerramientas;

    public InventarioHerramientas(){
        herramientas = new Herramienta[10];
        for( int i = 0; i < herramientas.length; i++){
            herramientas[i] = new NingunaHerramienta();
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
            if (herramientas[i] instanceof NingunaHerramienta) {
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
        Herramienta herramienta = intercambiarHerramienta(new NingunaHerramienta(), posicion);
        if(!(herramienta instanceof NingunaHerramienta)){
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
