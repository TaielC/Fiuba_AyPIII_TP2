package juego;

public class Mapa {
    private Jugador jugador;
    private Tablero tablero;

    private static Mapa instanciaMapa = new Mapa();
    public static Mapa getInstance() { return instanciaMapa; }

    private Mapa(){
        tablero = new Tablero(100,100);
        jugador = Jugador.getInstance();
        Casillero casillero = tablero.casillero("0,0");
        casillero.poner(jugador);
        jugador.vincularTablero(tablero);
        jugador.vincularCasillero(casillero);

    }

}
