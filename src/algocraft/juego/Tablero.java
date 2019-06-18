package algocraft.juego;

import algocraft.material.MaterialMineral;

import java.util.HashMap;
import java.lang.String;
import java.util.Arrays;
import java.util.Map;

public class Tablero {

    private Map<String,Casillero> tablero = new HashMap<>();
    private int bordeHorizontal;
    private int bordeVertical;


    public Tablero(int x, int y){

        this.bordeHorizontal = x;
        this.bordeVertical = y;
        for(int i = 0; i < x; i ++){
            for (int j = 0; j < y; j++){

                //Posicion posicionCasillero = new Posicion(i,j);
                Casillero casillero = new Casillero(new Posicion(i,j));
                int[] posicion = {i, j};

                this.tablero.put(Arrays.toString(posicion), casillero);
            }
        }

    }


    public Casillero casillero(String clave){
        return tablero.get(clave);
    }

    public void agregar(ObjetoUbicable objetoUbicable, Posicion posicion) {
        Casillero casillero = tablero.get(posicion.getString());
        casillero.agregar(objetoUbicable);
    }
    
    public boolean estaEnElLimite(Posicion posicion){
        boolean limiteX = posicion.getX() >= this.bordeHorizontal;
        boolean limiteY = posicion.getY() >= this.bordeVertical;
        return limiteX || limiteY;
    }


}
