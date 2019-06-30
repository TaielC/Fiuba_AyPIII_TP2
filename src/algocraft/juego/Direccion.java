package algocraft.juego;

public class Direccion {

    public static Direccion ARRIBA;
    public static Direccion ABAJO;
    public static Direccion IZQUIERDA;
    public static Direccion DERECHA;

    static {
        ARRIBA = new Direccion(0, -1);
        ABAJO = new Direccion(0, 1);
        IZQUIERDA = new Direccion(-1, 0);
        DERECHA = new Direccion(1, 0);
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
}
