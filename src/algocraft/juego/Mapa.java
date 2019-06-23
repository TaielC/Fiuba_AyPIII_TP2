package algocraft.juego;

import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import algocraft.materialmineral.*;

public class Mapa {

    private Map<String, ObjetoUbicable> tablero = new HashMap<>();
    private int bordeHorizontal;
    private int bordeVertical;

    public Mapa(int x, int y) {
        this.bordeHorizontal = x;
        this.bordeVertical = y;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                Posicion posicion = new Posicion(i, j);
                ObjetoUbicable objeto = new ObjetoAire();

                this.tablero.put(posicion.toString(), objeto);
            }
        }

    }

    public void ponerMaterialRandom(){
        for (int i = 0; i<10; i++){
            Posicion posicion = new Posicion(i, 5);
            ObjetoUbicable objeto = new MaderaMineral(posicion);
        }
    }

    public ObjetoUbicable getObjetoUbicable(Posicion posicion) {
        return tablero.get(posicion.toString());
    }

    public void agregar(ObjetoUbicable objetoUbicable, Posicion posicion) {
        if (this.posicionEsValida(posicion)) {
            objetoUbicable.setPosicion(posicion);
            tablero.put(posicion.toString(), objetoUbicable);
        }
    }

    public boolean posicionEsValida(Posicion posicion) {
        boolean limiteX = (posicion.getX() < this.bordeHorizontal) || (posicion.getX() >= 0);
        boolean limiteY = (posicion.getY() < this.bordeVertical) || (posicion.getX() >= 0);
        boolean estaVacio = (tablero.get(posicion.toString()) instanceof ObjetoAire);
        return limiteX && limiteY && estaVacio;
    }

    public void moverObjetoHacia(ObjetoUbicable objetoUbicable, Direccion direccion) {
        Posicion posicion = objetoUbicable.getPosicion();
        Posicion posicionSiguiente = posicion.obtenerSiguiente(direccion);

        if (posicionEsValida(posicionSiguiente)) {
            tablero.put(posicion.toString(), new ObjetoAire());
            tablero.put(posicionSiguiente.toString(), objetoUbicable);
            objetoUbicable.setPosicion(posicionSiguiente);
        }
    }
}

