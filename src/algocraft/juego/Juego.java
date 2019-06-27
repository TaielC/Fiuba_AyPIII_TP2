package algocraft.juego;

import algocraft.materialmineral.MaterialMineral;

public class Juego {

    private Jugador jugador;
    private Mapa mapa;

    private static Juego instanciaJuego = new Juego();
    public static Juego getInstance() { return instanciaJuego; }

    public final int TAMANIOHORIZONTAL = 20;
    public final int TAMANIOVERTICAL = 12;

    private Juego(){
        this.mapa = new Mapa(TAMANIOHORIZONTAL,TAMANIOVERTICAL);
        ConstructorMapa.contruirMapa(mapa);
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
        mapa.mover(jugador.getPosicion(), direccion);
    }

    public void jugadorUsarHerramientaEquipada(Posicion posicion) {
        if(!posicion.esAdyacente(jugador.getPosicion())) return;
        jugador.usarHerramientaEquipada((MaterialMineral) mapa.getObjetoUbicable(posicion));
    }

    public static Juego resetJuego(){
        instanciaJuego = new Juego();
        return instanciaJuego;
    }

    public void actualizarMapa(){
        mapa.actualizar();
    }
}
