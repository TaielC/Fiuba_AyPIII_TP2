package algocraft.juego;

public class Juego {

    private Jugador jugador;
    private Mapa mapa;
    private Posicion posicionJugador;

    private static Juego instanciaJuego = new Juego();
    public static Juego getInstance() { return instanciaJuego; }


    private Juego(){
        this.mapa = new Mapa(100,100);
        this.posicionJugador = new Posicion(0,0);
        this.jugador = new Jugador(posicionJugador);
        this.mapa.agregar(jugador, posicionJugador);

    }


    public Mapa getMapa(){
        return this.mapa;
    }

    public Jugador getJugador(){
        return this.jugador;
    }

    public void moverJugadorHacia(Direccion direccion) {
        mapa.moverJugadorHacia(jugador, direccion);
    }

    public static Juego resetJuego(){
        instanciaJuego = new Juego();
        return instanciaJuego;
    }

}
