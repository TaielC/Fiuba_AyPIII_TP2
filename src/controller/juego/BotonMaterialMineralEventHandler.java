package controller.juego;

import algocraft.juego.Juego;
import algocraft.juego.Posicion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.PantallaJuego;


public class BotonMaterialMineralEventHandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Posicion posicion;
    private PantallaJuego pantallaJuego;

    public BotonMaterialMineralEventHandler(PantallaJuego pantallaJuego, Juego juego, Posicion posicion){
        this.juego = juego;
        this.pantallaJuego = pantallaJuego;
        this.posicion = posicion;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        juego.jugadorUsarHerramientaEquipada(posicion);
        pantallaJuego.actualizar();
    }
}
