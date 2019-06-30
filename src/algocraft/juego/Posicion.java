package algocraft.juego;

import java.util.Arrays;

import static java.lang.Math.abs;

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
        boolean sonDiferentes = coordenadaX != posicion.getX() && coordenadaY != posicion.getY();
        return sonDiferentes && (abs(coordenadaX - posicion.getX()) <= 1) && (abs(coordenadaY - posicion.getY()) <= 1);
    }
}
