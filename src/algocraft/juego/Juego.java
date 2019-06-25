package algocraft.juego;

public class Juego {

    private Jugador jugador;
    private Mapa mapa;
    private ConstructorMapa constructorMapa;

    private static Juego instanciaJuego = new Juego();
    public static Juego getInstance() { return instanciaJuego; }

    public final int TAMANIOHORIZONTAL = 24;
    public final int TAMANIOVERTICAL = 15;

    private Juego(){
        this.mapa = new Mapa(TAMANIOHORIZONTAL,TAMANIOVERTICAL);
        this.constructorMapa = new ConstructorMapa(mapa);
        constructorMapa.contruirMapa(15);
        this.jugador = new Jugador(new Posicion(0,0));
        this.mapa.agregar(jugador, jugador.getPosicion());
    }

    public Mapa getMapa(){
        return this.mapa;
    }

    public Jugador getJugador(){
        return this.jugador;
    }

    public void moverJugadorHacia(Direccion direccion) {
        mapa.moverObjetoHacia(jugador, direccion);
    }

    public void usarHerramientaEquipada(Posicion posicion) {
        Jugador.usarHerramientaEquipada(mapa.getObjetoUbicable(posicion));

    }

    public static Juego resetJuego(){
        instanciaJuego = new Juego();
        return instanciaJuego;
    }

}
