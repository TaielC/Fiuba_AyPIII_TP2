package controller.menuprincipal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import media.Sonidos;

import java.util.concurrent.TimeUnit;

public class BotonJugarEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Scene escenaJuego;
    private boolean pantallaCompleta;

    public BotonJugarEventHandler(Stage stage, Scene escenaJuego) {
        this.stage = stage;
        this.escenaJuego = escenaJuego;
        this.pantallaCompleta = true;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Media sound = Sonidos.get("boton");
        MediaPlayer sonido = new MediaPlayer(sound);
        sonido.play();
        ejecutarJuego();
    }

    private void ejecutarJuego() {
        stage.setScene(escenaJuego);
        if(pantallaCompleta){
            stage.setFullScreenExitHint("Presione F11 para salir de pantalla completa");
            stage.setFullScreen(true);
        }
    }

    public void setPantallaCompleta(boolean pantallaCompleta) {
        this.pantallaCompleta = pantallaCompleta;
    }
}
