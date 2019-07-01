package controller.menuprincipal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class BotonAyudaEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Algocraft Ayuda");
        String mensaje ="Controles:\n_Para desplazar al jugador utilise las teclas WASD.\n" +
                "_Para golpear un material haga click sobre el mismo.\n" +
                "_Para construir una herramienta haga click sobre el icono de constructor de herramientas.\n" +
                "_Para equipar una herramienta haga click sobre la herramienta deseada en el inventario que se encuentra a la derecha.";
        alert.setHeaderText("75.07 Algoritmos y  programación III.");
        alert.setContentText(mensaje);
        alert.show();
    }
}
