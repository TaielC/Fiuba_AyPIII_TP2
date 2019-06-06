package algocraft;

public class Jugador {
    private static Jugador instanciaJugador = new Jugador();

    public static Jugador getInstance() { return instanciaJugador; }

    private Jugador() {

    }
}
