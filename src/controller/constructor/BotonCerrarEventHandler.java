package controller.constructor;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonCerrarEventHandler implements EventHandler<ActionEvent> {

    private Stage ventanaConstructor;

    public BotonCerrarEventHandler(Stage ventanaConstructor){
        this.ventanaConstructor = ventanaConstructor;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        ventanaConstructor.close();
    }
}
