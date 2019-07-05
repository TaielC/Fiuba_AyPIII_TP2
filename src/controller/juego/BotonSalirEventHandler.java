package controller.juego;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;

public class BotonSalirEventHandler implements EventHandler<ActionEvent> {


    public BotonSalirEventHandler(){
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        Button boton = (Button) actionEvent.getSource();
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(-0.5);
        boton.setEffect(colorAdjust);
        System.exit(0);
    }
}
