package controller;

import algocraft.juego.Direccion;
import algocraft.juego.Juego;
import algocraft.juego.Jugador;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import view.PantallaJuego;

public class AplicacionOnKeyPressEventHandler implements EventHandler<KeyEvent> {
    private PantallaJuego pantallaJuego;
    private Juego juego;
    private Jugador jugador;

    public AplicacionOnKeyPressEventHandler(PantallaJuego pantallaJuego, Juego juego){
        this.pantallaJuego = pantallaJuego;
        this.juego = juego;
        this.jugador = juego.getJugador();

    }
    @Override
    public void handle(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.S) {
            juego.moverJugadorHacia(Direccion.arriba());
        }
        if (keyEvent.getCode() == KeyCode.W) {
            juego.moverJugadorHacia(Direccion.abajo());
        }
        if (keyEvent.getCode() == KeyCode.A) {
            juego.moverJugadorHacia(Direccion.izquierda());
        }
        if (keyEvent.getCode() == KeyCode.D) {
            juego.moverJugadorHacia(Direccion.derecha());
        }
        pantallaJuego.actualizar();
    }
}