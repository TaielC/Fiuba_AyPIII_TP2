package controller.juego;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import media.Sonidos;
import view.menupausajuego.VentanaMenuPausa;
import view.juego.PantallaJuego;

public class BotonAbrirMenuPausaEventHandler implements EventHandler<ActionEvent> {
    private PantallaJuego pantallaJuego;

    public BotonAbrirMenuPausaEventHandler(PantallaJuego pantallaJuego) {
        this.pantallaJuego = pantallaJuego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Media sound = Sonidos.get("boton");
        MediaPlayer sonido = new MediaPlayer(sound);
        sonido.play();
        new VentanaMenuPausa(pantallaJuego, (Button) actionEvent.getSource());
    }
}
