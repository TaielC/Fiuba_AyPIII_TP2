package view;


import algocraft.inventario.InventarioMateriales;
import algocraft.juego.Juego;
import controller.juego.BotonConstructorHerramientaEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ContenedorMateriales extends VBox {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/15;

    public ContenedorMateriales(PantallaJuego pantallaJuego, Juego juego){

        InventarioMateriales inventarioMateriales = juego.getJugador().getInventarioMateriales();

        GridPane gridMateriales = new GridPane();

        this.setAlignment(Pos.CENTER);
        gridMateriales.setPrefSize(1,4);
        gridMateriales.setHgap(20);
        gridMateriales.setVgap(35);
        agregarMaterial(gridMateriales, "MaderaItem", inventarioMateriales.cantidadMadera(), 1);
        agregarMaterial(gridMateriales, "PiedraItem", inventarioMateriales.cantidadPiedra(), 2);
        agregarMaterial(gridMateriales, "MetalItem", inventarioMateriales.cantidadMetal(), 3);
        agregarMaterial(gridMateriales, "DiamanteItem", inventarioMateriales.cantidadDiamante(), 4);

        Button botonConstructorHerramienta = new Button();
        botonConstructorHerramienta.setMinSize(TAMANIO, TAMANIO);
        botonConstructorHerramienta.setPadding(new Insets(1,1,1,1));
        Image imagen = Imagenes.get("ConstructorHerramientas");
        botonConstructorHerramienta.setGraphic(new ImageView(imagen));
        BotonConstructorHerramientaEventHandler botonConstructorHerramientaEventHandler = new BotonConstructorHerramientaEventHandler(pantallaJuego,juego);
        botonConstructorHerramienta.setOnAction(botonConstructorHerramientaEventHandler);

        Image imagenFondo = Imagenes.get("FondoMenu");
        BackgroundImage fondo = new BackgroundImage(imagenFondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(fondo));
        this.setSpacing(50);
        this.getChildren().addAll(gridMateriales, botonConstructorHerramienta);
    }

    private void agregarMaterial(GridPane gridMateriales, String stringMaterial, Integer cantidadMaterial, int posicion) {
        ImageView vistaImagen = new ImageView(Imagenes.get(stringMaterial));
        String formaLetra = "-fx-font-size: 30;-fx-font-weight: bold; -fx-text-fill: #050505";
        Text stringCantidadMaterial = new Text(cantidadMaterial.toString());
        stringCantidadMaterial.setFont(Font.font("monospace"));
        stringCantidadMaterial.setStyle(formaLetra);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(vistaImagen);
        stackPane.getChildren().add(stringCantidadMaterial);
        stackPane.setAlignment(Pos.BOTTOM_LEFT);

        gridMateriales.add(stackPane,0, posicion);
    }

}
