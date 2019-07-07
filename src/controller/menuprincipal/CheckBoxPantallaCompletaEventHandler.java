package controller.menuprincipal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import media.Sonidos;

public class CheckBoxPantallaCompletaEventHandler implements EventHandler<ActionEvent> {

    private CheckBox pantallaCompleta;
    private BotonJugarEventHandler botonJugarEventHandler;

    public CheckBoxPantallaCompletaEventHandler(CheckBox pantallaCompleta, BotonJugarEventHandler botonJugarEventHandler) {
        this.pantallaCompleta = pantallaCompleta;
        this.botonJugarEventHandler = botonJugarEventHandler;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Media sound = Sonidos.get("boton");
        MediaPlayer sonido = new MediaPlayer(sound);
        sonido.play();
        botonJugarEventHandler.setPantallaCompleta(pantallaCompleta.isSelected());
    }
}
