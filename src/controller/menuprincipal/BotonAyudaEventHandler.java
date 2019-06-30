package controller.menuprincipal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class BotonAyudaEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Algocraft Ayuda");
        alert.setHeaderText("Controles");
        String mensaje = "75.07 Algoritmos y  programación III.";
        alert.setContentText("Los controles pra desplazar ");
        //alert.setGraphic();
        alert.setContentText(mensaje);
        alert.show();
    }
}
