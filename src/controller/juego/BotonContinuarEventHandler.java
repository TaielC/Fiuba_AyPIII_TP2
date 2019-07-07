package controller.juego;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import media.Sonidos;

public class BotonContinuarEventHandler implements EventHandler<ActionEvent> {
    private final Stage ventana;

    public BotonContinuarEventHandler(Stage ventanaMenu) {
        this.ventana = ventanaMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Media sound = Sonidos.get("boton");
        MediaPlayer sonido = new MediaPlayer(sound);
        sonido.play();
        ventana.close();
    }
}
