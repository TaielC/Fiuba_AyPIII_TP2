package controller.juego;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import view.menupausajuego.VentanaMenuPausa;
import view.juego.PantallaJuego;

public class BotonAbrirMenuPausaEventHandler implements EventHandler<ActionEvent> {
    private PantallaJuego pantallaJuego;

    public BotonAbrirMenuPausaEventHandler(PantallaJuego pantallaJuego) {
        this.pantallaJuego = pantallaJuego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        new VentanaMenuPausa(pantallaJuego, (Button) actionEvent.getSource());
    }
}
