package view.MenuJuego;

import controller.constructor.BotonCerrarEventHandler;
import controller.juego.BotonSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import view.Imagenes;

public class PantallaMenu extends BorderPane {
    private GridPane bottomPane;

    public PantallaMenu(Stage ventanaMenu){

        bottomPane = new GridPane();
        Button botonSalir = new Button();
        botonSalir.setText("Cerrar");
        botonSalir.setFont(Font.font("Monospace", FontWeight.EXTRA_BOLD, 30));
        botonSalir.setMinSize(400, 100);
        botonSalir.setBackground(new Background(new BackgroundImage(Imagenes.get("BotonMenuPrincipal"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(400, 100, false, false, false, false))));
        botonSalir.setOnAction(new BotonCerrarEventHandler(ventanaMenu));
        botonSalir.setAlignment(Pos.BOTTOM_LEFT);

        bottomPane.add(botonSalir, 0,1);
        bottomPane.setAlignment(Pos.CENTER);
        bottomPane.setVgap(30);
        bottomPane.setPadding(new Insets(40, 40, 30, 30));
        bottomPane.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, new Insets(5, 5, 5, 5))));


    }
}
