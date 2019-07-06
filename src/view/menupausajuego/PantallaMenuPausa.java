package view.menupausajuego;

import controller.juego.BotonContinuarEventHandler;
import controller.menuprincipal.BotonSalirEventHandler;
import controller.menuprincipal.BotonAyudaEventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import view.Imagenes;

public class PantallaMenuPausa extends VBox {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/2;

    public PantallaMenuPausa(VentanaMenuPausa ventanaMenuPausa){

        Button botonContinuar = botonNuevo("Continuar");
        botonContinuar.setOnAction(new BotonContinuarEventHandler(ventanaMenuPausa));

        Button botonAyuda = botonNuevo("Ayuda");
        botonAyuda.setOnAction(new BotonAyudaEventHandler());

        Button botonSalir = botonNuevo("Salir");
        botonSalir.setOnAction(new BotonSalirEventHandler());

        this.getChildren().addAll(botonContinuar, botonAyuda, botonSalir);

        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setBackground(new Background(new BackgroundImage(Imagenes.get("FondoMenuEmergente"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(TAMANIO*176/150, TAMANIO*166/150, false, false, false, false))));
    }

    private Button botonNuevo(String string) {
        Button boton = new Button();
        boton.setText(string);
        boton.setFont(Font.font("Monospace", FontWeight.EXTRA_BOLD, 30));
        boton.setMinSize(300, 80);
        boton.setBackground(new Background(new BackgroundImage(Imagenes.get("BotonMenuPrincipal"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(300, 80, false, false, false, false))));
        boton.setAlignment(Pos.CENTER);
        return boton;
    }
}
