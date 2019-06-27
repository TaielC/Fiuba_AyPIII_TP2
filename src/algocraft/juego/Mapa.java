package algocraft.juego;

import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import algocraft.materialmineral.*;

public class Mapa {

    private Map<Posicion, ObjetoUbicable> tablero = new HashMap<>();
    private int bordeHorizontal;
    private int bordeVertical;

    public Mapa(int x, int y) {
        this.bordeHorizontal = x;
        this.bordeVertical = y;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Posicion posicion = new Posicion(i, j);
                ObjetoUbicable objeto = new NingunMaterialMineral();
                this.tablero.put(posicion, objeto);
            }
        }

    }

    public ObjetoUbicable getObjetoUbicable(Posicion posicion) {
        return tablero.get(posicion);
    }

    public void agregar(ObjetoUbicable objetoUbicable, Posicion posicion) {
        objetoUbicable.setPosicion(posicion);
        tablero.put(posicion, objetoUbicable);
    }

    public boolean posicionEsValida(Posicion posicion) {
        boolean limiteX = (posicion.getX() < this.bordeHorizontal) || (posicion.getX() >= 0);
        boolean limiteY = (posicion.getY() < this.bordeVertical) || (posicion.getX() >= 0);
        boolean estaVacio = (tablero.get(posicion) instanceof NingunMaterialMineral);
        return limiteX && limiteY && estaVacio;
    }

    public void mover(Posicion posicion, Direccion direccion) {
        Posicion posicionSiguiente = posicion.obtenerSiguiente(direccion);

        if(!posicionEsValida(posicionSiguiente)) {
            return;
        }
        ObjetoUbicable objetoUbicable= tablero.get(posicion);
        tablero.put(posicionSiguiente, objetoUbicable);
        tablero.put(posicion, new NingunMaterialMineral());
        objetoUbicable.setPosicion(posicionSiguiente);
    }

    public int getBordeHorizontal(){
        return bordeHorizontal;
    }

    public int getBordeVertical(){
        return bordeVertical;
    }

    public void actualizar() {

        for (int i = 0; i < bordeHorizontal; i++) {
            for (int j = 0; j < bordeVertical; j++) {
                Posicion posicion = new Posicion(i, j);
                //if(tablero.get(posicion).durabilid)

            }
        }
    }
}


