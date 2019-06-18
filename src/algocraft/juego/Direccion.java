package algocraft.juego;

public class Direccion {

    private static Direccion arriba;
    private static Direccion abajo;
    private static Direccion izquierda;
    private static Direccion derecha;

    static {
        arriba = new Direccion(0, 1);
        abajo = new Direccion(0, -1);
        izquierda = new Direccion(-1, 0);
        derecha = new Direccion(1, 0);
    }

    private int coordenadaX;
    private int coordenadaY;

    private Direccion(int valorX, int valorY) {
        this.coordenadaX = valorX;
        this.coordenadaY = valorY;
    }

    public Posicion obtenerSiguiente(Posicion posicion) {
        int siguienteX = posicion.getX() + this.coordenadaX;
        int siguienteY = posicion.getY() + this.coordenadaY;

        return new Posicion(siguienteX, siguienteY);
    }

    public static Direccion arriba(){
        return arriba;
    }

    public static Direccion abajo(){
        return abajo;
    }

    public static Direccion izquierda(){
        return izquierda;
    }

    public static Direccion derecha(){
        return derecha;
    }
}
