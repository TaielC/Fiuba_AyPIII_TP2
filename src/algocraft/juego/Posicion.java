package algocraft.juego;

import java.util.Arrays;

public class Posicion {

    private int coordenadaX;
    private int coordenadaY;

    public Posicion(int posX, int posY){
        this.coordenadaX = posX;
        this.coordenadaY = posY;

    }

    public int getX(){
        return coordenadaX;
    }

    public int getY(){
        return coordenadaY;
    }

    public Posicion obtenerSiguiente (Direccion direccion){
        return direccion.obtenerSiguiente(this);
    }

    @Override
    public boolean equals(Object objeto){
        return this.hashCode() == objeto.hashCode();
    }

    @Override
    public int hashCode() {
        int posX = this.coordenadaX;
        int posY = this.coordenadaY;
        int[] posicion = {posX, posY};
        String string = Arrays.toString(posicion);
        return string.hashCode();
    }

    public boolean esAdyacente(Posicion posicion) {
        for(int x=-1 ;x<=1 ;x++) {
            for (int y = -1; y <= 1; y++) {
                if (x == 0 && y == 0) continue;
                if(coordenadaX+x == posicion.getX() && coordenadaY+y == posicion.getY())
                    return true;
            }
        }
        return false;
    }
}
