package controller;

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

    public BotonConstructorHerramientaEventHandler() {
        this.pantallaCompleta = true;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.stage = new VentanaConstructor();
        if(pantallaCompleta){
//            stage.setFullScreenExitHint("");
            stage.setFullScreen(true);
        }

    }
}
