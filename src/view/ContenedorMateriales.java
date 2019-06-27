package view;


import algocraft.juego.Juego;
import controller.BotonConstructorHerramientaEventHandler;
import controller.BotonJugarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ContenedorMateriales extends VBox {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/15;

    public ContenedorMateriales(Juego juego){

        GridPane gridMateriales = new GridPane();

        this.setAlignment(Pos.CENTER);
        gridMateriales.setPrefSize(1,4);
        gridMateriales.setHgap(1);
        gridMateriales.setVgap(20);
        gridMateriales.add(new ImageView(Imagenes.get("MaderaItem")),0,1);
        gridMateriales.add(new ImageView(Imagenes.get("MetalItem")),0,2);
        gridMateriales.add(new ImageView(Imagenes.get("PiedraItem")),0,3);
        gridMateriales.add(new ImageView(Imagenes.get("DiamanteItem")),0,4);

        Button botonConstructorHerramienta = new Button();
        botonConstructorHerramienta.setMinSize(TAMANIO, TAMANIO);
        botonConstructorHerramienta.setPadding(new Insets(1,1,1,1));
        Image imagen = Imagenes.get("ConstructorHerramientas");
        botonConstructorHerramienta.setGraphic(new ImageView(imagen));
        BotonConstructorHerramientaEventHandler botonConstructorHerramientaEventHandler = new BotonConstructorHerramientaEventHandler(juego);
        botonConstructorHerramienta.setOnAction(botonConstructorHerramientaEventHandler);

        Image imagenFondo = Imagenes.get("FondoMenu");
        BackgroundImage fondo = new BackgroundImage(imagenFondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(fondo));
        this.setSpacing(50);
        this.getChildren().addAll(gridMateriales, botonConstructorHerramienta);
    }

}
