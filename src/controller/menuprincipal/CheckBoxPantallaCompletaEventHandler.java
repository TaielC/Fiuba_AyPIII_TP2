package controller.menuprincipal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;

public class CheckBoxPantallaCompletaEventHandler implements EventHandler<ActionEvent> {

    private CheckBox pantallaCompleta;
    private BotonJugarEventHandler botonJugarEventHandler;

    public CheckBoxPantallaCompletaEventHandler(CheckBox pantallaCompleta, BotonJugarEventHandler botonJugarEventHandler) {
        this.pantallaCompleta = pantallaCompleta;
        this.botonJugarEventHandler = botonJugarEventHandler;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        botonJugarEventHandler.setPantallaCompleta(pantallaCompleta.isSelected());
    }
}
