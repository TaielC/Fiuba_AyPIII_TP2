package controller;

import algocraft.juego.Juego;
import algocraft.juego.Mapa;
import algocraft.juego.Posicion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import view.ContenedorJuego;
import view.PantallaJuego;

public class BotonMaterialMineralEventHandler implements EventHandler<MouseEvent> {

    private Juego juego;
    //private Posicion posicion;
    private PantallaJuego pantallaJuego;

    public BotonMaterialMineralEventHandler(PantallaJuego pantallaJuego, Juego juego){
        this.juego = juego;
        this.pantallaJuego = pantallaJuego;

    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        Posicion posicion = new Posicion((int)mouseEvent.getX(),(int)mouseEvent.getY());
        this.juego.usarHerramientaEquipada(posicion);
        juego.actualizarMapa();
        pantallaJuego.actualizar();

    }
}
