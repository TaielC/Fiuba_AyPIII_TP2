package controller.menuprincipal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonJugarEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Scene escenaJuego;
    private boolean pantallaCompleta;

    public BotonJugarEventHandler(Stage stage, Scene escenaJuego) {
        this.stage = stage;
        this.escenaJuego = escenaJuego;
        this.pantallaCompleta = true;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(escenaJuego);
        if(pantallaCompleta){
            stage.setFullScreenExitHint("");
            stage.setFullScreen(true);
        }

    }

    public void setPantallaCompleta(boolean pantallaCompleta) {
        this.pantallaCompleta = pantallaCompleta;
    }
}
