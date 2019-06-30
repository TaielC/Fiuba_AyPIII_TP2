package view;


import algocraft.inventario.InventarioMateriales;
import algocraft.juego.Juego;
import controller.juego.BotonAbrirConstructorHerramientaEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Screen;

public class ContenedorInventarioMateriales extends VBox {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/15;

    public ContenedorInventarioMateriales(PantallaJuego pantallaJuego, Juego juego){

        InventarioMateriales inventarioMateriales = juego.getJugador().getInventarioMateriales();

        GridPane gridMateriales = new GridPane();

        this.setAlignment(Pos.CENTER);
        gridMateriales.setPrefSize(1,4);
        gridMateriales.setHgap(TAMANIO/3);
        gridMateriales.setVgap(TAMANIO/3);
        agregarMaterial(gridMateriales, "MaderaItem", inventarioMateriales.cantidadMadera(), 1);
        agregarMaterial(gridMateriales, "PiedraItem", inventarioMateriales.cantidadPiedra(), 2);
        agregarMaterial(gridMateriales, "MetalItem", inventarioMateriales.cantidadMetal(), 3);
        agregarMaterial(gridMateriales, "DiamanteItem", inventarioMateriales.cantidadDiamante(), 4);

        Button botonConstructorHerramienta = new Button();
        botonConstructorHerramienta.setMinSize(TAMANIO*1.2, TAMANIO*1.2);
        botonConstructorHerramienta.setPadding(new Insets(1,1,1,1));
        Image imagen = Imagenes.get("ConstructorHerramientas");
        botonConstructorHerramienta.setGraphic(new StackPane(new ImageView(Imagenes.get("FondoCasillero")), new ImageView(imagen)));
        BotonAbrirConstructorHerramientaEventHandler botonAbrirConstructorHerramientaEventHandler = new BotonAbrirConstructorHerramientaEventHandler(pantallaJuego,juego);
        botonConstructorHerramienta.setOnAction(botonAbrirConstructorHerramientaEventHandler);

        this.setBackground(new Background(new BackgroundImage(Imagenes.get("FondoMenuIzquierda"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        this.setSpacing(50);
        this.getChildren().addAll(gridMateriales, botonConstructorHerramienta);
    }

    private void agregarMaterial(GridPane gridMateriales, String stringMaterial, Integer cantidadMaterial, int posicion) {
        ImageView vistaImagen = new ImageView(Imagenes.get(stringMaterial));
        String formaLetra = "-fx-font-size: "+TAMANIO/2.3+";-fx-font-weight: bold; -fx-text-fill: #000000";
        Text stringCantidadMaterial = new Text(cantidadMaterial.toString());
        stringCantidadMaterial.setTextAlignment(TextAlignment.LEFT);
        stringCantidadMaterial.setFont(Font.font("monospace", TAMANIO/2.3));
        stringCantidadMaterial.setStyle(formaLetra);

        StackPane stackPane = new StackPane();
        stackPane.setPrefSize(TAMANIO*1.3, TAMANIO*1.3);
        stackPane.getChildren().addAll(new ImageView(Imagenes.get("FondoCasillero")), vistaImagen, stringCantidadMaterial);
        stackPane.setAlignment(Pos.CENTER);
        StackPane.setAlignment(stringCantidadMaterial, Pos.BOTTOM_RIGHT);

        gridMateriales.add(stackPane,0, posicion);
    }

}
