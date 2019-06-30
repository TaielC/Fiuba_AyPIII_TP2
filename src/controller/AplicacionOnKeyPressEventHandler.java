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
    private String texto;

    public AplicacionOnKeyPressEventHandler(PantallaJuego pantallaJuego, Juego juego, Stage stage){
        this.pantallaJuego = pantallaJuego;
        this.juego = juego;
        this.jugador = juego.getJugador();
        this.stage = stage;
        this.texto = (" ");
    }

    @Override
    public void handle(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.W || keyEvent.getCode() == KeyCode.UP) {
            juego.moverJugadorHacia(Direccion.ARRIBA);
            pantallaJuego.actualizar(texto);
        }
        if (keyEvent.getCode() == KeyCode.A || keyEvent.getCode() == KeyCode.LEFT) {
            juego.moverJugadorHacia(Direccion.IZQUIERDA);
            pantallaJuego.actualizar(texto);
        }
        if (keyEvent.getCode() == KeyCode.S || keyEvent.getCode() == KeyCode.DOWN) {
            juego.moverJugadorHacia(Direccion.ABAJO);
            pantallaJuego.actualizar(texto);
        }
        if (keyEvent.getCode() == KeyCode.D || keyEvent.getCode() == KeyCode.RIGHT) {
            juego.moverJugadorHacia(Direccion.DERECHA);
            pantallaJuego.actualizar(texto);
        }
        if (keyEvent.getCode() == KeyCode.F11) {
            stage.setFullScreen(!stage.isFullScreen());
        }
    }
}