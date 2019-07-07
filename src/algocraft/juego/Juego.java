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
        this.mapa = MapaFactory.contruirMapa(TAMANIOHORIZONTAL, TAMANIOVERTICAL);
        this.jugador = new Jugador(new Posicion(mapa.getBordeHorizontal()/2,mapa.getBordeVertical()/2));
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
        MaterialMineral materialMineral = (MaterialMineral) mapa.getObjetoUbicable(posicion);
        jugador.usarHerramientaEquipada(materialMineral);
        if(materialMineral.seRompio()){
            mapa.eliminarObjeto(materialMineral.getPosicion());
            jugador.agregarAInventario(materialMineral.obtenerMaterialInventario());
        }
    }

    public static Juego resetJuego(){
        instanciaJuego = new Juego();
        return instanciaJuego;
    }
}
