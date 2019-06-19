package algocraft.juego;

import java.util.HashMap;
import java.lang.String;
import java.util.Arrays;
import java.util.Map;

public class Mapa {

    private Map<String,ObjetoUbicable> tablero = new HashMap<>();
    private int bordeHorizontal;
    private int bordeVertical;


    public Mapa(int x, int y){

        this.bordeHorizontal = x;
        this.bordeVertical = y;
        for(int i = 0; i < x; i ++){
            for (int j = 0; j < y; j++){

                Posicion posicionCasillero = new Posicion(i,j);
                ObjetoUbicable objeto = null;
                int[] posicion = {i, j};

                this.tablero.put(Arrays.toString(posicion), objeto );
            }
        }

    }


    public ObjetoUbicable getObjetoUbicable(String posicion){
        return tablero.get(posicion);
    }

    public ObjetoUbicable getObjetoUbicable(Posicion posicion){
        String posicionString = posicion.getString();
        return tablero.get(posicionString);
    }

    public void agregar(ObjetoUbicable objetoUbicable, Posicion posicion) {
        String posicionObjeto = posicion.getString();
        if (this.tablero.get(posicionObjeto) == null) {
            objetoUbicable.setPosicion(posicion);
            tablero.put(posicionObjeto,objetoUbicable);
        }
    }

    public boolean sePuedeMover(Posicion posicion){
        boolean limiteX = (posicion.getX() <= this.bordeHorizontal) || (posicion.getX() >= 0);
        boolean limiteY = (posicion.getY() <= this.bordeVertical) || (posicion.getX() >= 0);
        boolean estaVacio = (tablero.get(posicion.getString()) == null);
        return limiteX && limiteY && estaVacio;
    }

    public void moverJugadorHacia(Jugador jugador,Direccion direccion){
        Posicion posicionJugador = jugador.getPosicion();
        Posicion siguientePosicion = posicionJugador.obtenerSiguiente(direccion);

        if (sePuedeMover(siguientePosicion)) {
            tablero.put(posicionJugador.getString(), null);
            tablero.put(siguientePosicion.getString(), jugador);
            jugador.modificarPosicion(siguientePosicion);
        }
    }
    }

