package algocraft;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;

import java.util.Arrays;

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
        else {
        	return casillero;
        }
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
        else {
        	return casillero;
        }
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
        else {
        	return casillero;
        }
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
        else {
        	return casillero;
        }
    
    }
    
}
