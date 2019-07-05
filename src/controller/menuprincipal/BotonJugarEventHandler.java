package controller.menuprincipal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.stage.Stage;

import java.util.concurrent.TimeUnit;

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
        Button boton = (Button) actionEvent.getSource();
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(-0.5);
        boton.setEffect(colorAdjust);
        ejecutarJuego();
    }

    private void ejecutarJuego() {
        stage.setScene(escenaJuego);
        if(pantallaCompleta){
            stage.setFullScreenExitHint("Presione F11 para salir de pantalla completa");
            stage.setFullScreen(true);
        }
    }

    public void setPantallaCompleta(boolean pantallaCompleta) {
        this.pantallaCompleta = pantallaCompleta;
    }
}
