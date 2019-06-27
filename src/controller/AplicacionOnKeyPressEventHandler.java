package controller;

import algocraft.juego.Direccion;
import algocraft.juego.Juego;
import algocraft.juego.Jugador;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import view.PantallaJuego;

public class AplicacionOnKeyPressEventHandler implements EventHandler<KeyEvent> {
    private PantallaJuego pantallaJuego;
    private Juego juego;
    private Jugador jugador;
    private Stage stage;

    public AplicacionOnKeyPressEventHandler(PantallaJuego pantallaJuego, Juego juego, Stage stage){
        this.pantallaJuego = pantallaJuego;
        this.juego = juego;
        this.jugador = juego.getJugador();
        this.stage = stage;
    }
    @Override
    public void handle(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.S) {
            juego.moverJugadorHacia(Direccion.ARRIBA);
            pantallaJuego.actualizar();
        }
        if (keyEvent.getCode() == KeyCode.W) {
            juego.moverJugadorHacia(Direccion.ABAJO);
            pantallaJuego.actualizar();
        }
        if (keyEvent.getCode() == KeyCode.A) {
            juego.moverJugadorHacia(Direccion.IZQUIERDA);
            pantallaJuego.actualizar();
        }
        if (keyEvent.getCode() == KeyCode.D) {
            juego.moverJugadorHacia(Direccion.DERECHA);
            pantallaJuego.actualizar();
        }
        if (keyEvent.getCode() == KeyCode.F11) {
            stage.setFullScreen(!stage.isFullScreen());
        }

    }
}