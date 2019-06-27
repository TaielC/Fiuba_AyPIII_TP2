package controller.juego;

import algocraft.juego.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.PantallaJuego;

public class BotonInventarioHerramientasEventHandler implements EventHandler<ActionEvent> {

    private Jugador jugador;
    private int posicion;
    private PantallaJuego pantallaJuego;

    public BotonInventarioHerramientasEventHandler(PantallaJuego pantallaJuego, Jugador jugador, int posicion) {
        this.jugador = jugador;
        this.posicion = posicion;
        this.pantallaJuego = pantallaJuego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        jugador.equiparDeInventario(posicion);
        pantallaJuego.actualizar();
    }
}
