package controller.juego;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonContinuarEventHandler implements EventHandler<ActionEvent> {
    private final Stage ventana;

    public BotonContinuarEventHandler(Stage ventanaMenu) {
        this.ventana = ventanaMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        ventana.close();
    }
}
