package controller.juego;

import algocraft.juego.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import view.PantallaJuego;
import view.VentanaConstructor;

public class BotonAbrirConstructorHerramientaEventHandler implements EventHandler<ActionEvent> {
    private Juego juego;
    private PantallaJuego pantallaJuego;


    public BotonAbrirConstructorHerramientaEventHandler(PantallaJuego pantallaJuego, Juego juego) {
        this.juego = juego;
        this.pantallaJuego = pantallaJuego;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        new VentanaConstructor(this.pantallaJuego, this.juego);
    }
}