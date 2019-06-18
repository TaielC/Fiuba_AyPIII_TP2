package algocraft.juego;

public class Mapa {
    private Jugador jugador;
    private Tablero tablero;
    private Posicion posicionJugador;

    private static Mapa instanciaMapa = new Mapa();
    public static Mapa getInstance() { return instanciaMapa; }


    private Mapa(){
        this.tablero = new Tablero(100,100);
        this.posicionJugador = new Posicion(0,0);
        this.jugador = new Jugador(tablero, posicionJugador);
        tablero.agregar(jugador, posicionJugador);

    }

    public void moverJugador(Direccion direccion){
        jugador.moverHacia(direccion);
    }

    public Tablero getTablero(){
        return this.tablero;
    }

    public Jugador getJugador(){
        return this.jugador;
    }
}
