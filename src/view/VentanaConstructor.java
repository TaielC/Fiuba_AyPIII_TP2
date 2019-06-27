package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;

public class VentanaConstructor extends Stage {

    public VentanaConstructor(){

        GridPane constructorHerramienta = new ContenedorConstructorHerramientas();

        Scene segundaEscena = new Scene(constructorHerramienta, 300, 300);

        Stage nuevoStage = new Stage();
        nuevoStage.setTitle("Constructor Herramientas");
        nuevoStage.setScene(segundaEscena);

        nuevoStage.show();
    }
}
