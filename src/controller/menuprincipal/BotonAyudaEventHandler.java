package controller.menuprincipal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.text.Text;

public class BotonAyudaEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Button boton = (Button) actionEvent.getSource();
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(-0.5);
        boton.setEffect(colorAdjust);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("75.07 Algoritmos y  programación III");
        alert.setHeaderText("Algocraft Ayuda");
        String mensaje ="\nC̲o̲n̲t̲r̲o̲l̲e̲s̲ ̲d̲e̲l̲ ̲J̲u̲e̲g̲o_:\n\n" +
                " - Para desplazar al jugador en diferentes direcciones utilise las teclas: \n " +
                "\t + W: arriba\n \t + A: izquierda\n \t + S: abajo\n \t + D: derecha\n\n" +
                " - Para golpear un material haga click sobre el mismo (Puede utilizar la herramienta \n" +
                "equipada en las 8 posisicones que rodean al jugador).\n\n" +
                " - Para construir una herramienta haga click sobre el ícono de constructor de herramientas.\n\n" +
                " - Para equipar una herramienta haga click sobre la herramienta deseada en el inventario\n" +
                "que se encuentra a la derecha.\n\n" +
                " - Puede cambiar entre pantalla completa y ventana con la tecla 'F11'.\n\n" +
                " - Utilice la tecla 'esc' para el menú de pausa.\n";
        alert.getDialogPane().setContent(new Text(mensaje));
        alert.setOnHidden((e) -> boton.setEffect(new ColorAdjust()));
        alert.show();
    }
}
