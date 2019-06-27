package controller;

import algocraft.juego.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.ContenedorConstructorHerramientas;
import view.ContenedorJuego;
import view.VentanaConstructor;

public class BotonConstructorHerramientaEventHandler implements EventHandler<ActionEvent> {
    private Stage stage;
    private boolean pantallaCompleta;
    private Juego juego;

    public BotonConstructorHerramientaEventHandler(Juego juego) {
        //this.pantallaCompleta = true;
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.stage = new VentanaConstructor(this.juego);
/*        if(pantallaCompleta){
//            stage.setFullScreenExitHint("");
            stage.setFullScreen(true);
        }*/

    }

}