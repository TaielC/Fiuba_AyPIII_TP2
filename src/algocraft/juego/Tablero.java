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

        bordeHorizontal = x;
        bordeVertical = y;
        for(int i = 0; i < x; i ++){
            for (int j = 0; j < y; j++){

                Casillero casillero = new Casillero(i, j);
                int[] posicion = {i, j};

                this.tablero.put(Arrays.toString(posicion), casillero);
            }
        }

    }


    public Casillero casillero(String clave){
        return tablero.get(clave);
    }

    public Casillero moverHaciaArriba(Casillero casillero){
        if(casillero.posicionVertical() + 1 > bordeVertical ){
            return casillero;
        }
        int[] pos = {casillero.posicionHorizontal(), casillero.posicionVertical() + 1};
        Casillero casilleroNuevo = tablero.get(Arrays.toString(pos));

        if(casilleroNuevo.estaVacio()){
            return casilleroNuevo;
        }
        return casillero;
    }

    public Casillero moverHaciaAbajo(Casillero casillero){
        if(casillero.posicionVertical() - 1 < 0){
            return casillero;
        }
        int[] pos = {casillero.posicionHorizontal(), casillero.posicionVertical() - 1};
        Casillero casilleroNuevo = tablero.get(Arrays.toString(pos));

        if(casilleroNuevo.estaVacio()){
            return casilleroNuevo;
        }
        return casillero;
    }
    public Casillero moverHaciaIzquierda(Casillero casillero){
        if(casillero.posicionHorizontal() - 1 < 0 ){
            return casillero;
        }
        int[] pos = {casillero.posicionHorizontal() - 1 , casillero.posicionVertical()};
        Casillero casilleroNuevo = tablero.get(Arrays.toString(pos));

        if(casilleroNuevo.estaVacio()){
            return casilleroNuevo;
        }
        return casillero;
    }

    public Casillero moverHaciaDerecha(Casillero casillero){
        if(casillero.posicionHorizontal() + 1 > bordeHorizontal ){
            return casillero;
        }
        int[] pos = {casillero.posicionHorizontal() + 1, casillero.posicionVertical() };
        Casillero casilleroNuevo = tablero.get(Arrays.toString(pos));

        if(casilleroNuevo.estaVacio()){
            return casilleroNuevo;
        }
        return casillero;
    }


    public void agregar(ObjetoUbicable objetoUbicable, String posicion) {
        tablero.get(posicion).poner(objetoUbicable);
    }
}
