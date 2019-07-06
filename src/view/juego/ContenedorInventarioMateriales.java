package view.juego;


import algocraft.inventario.InventarioMateriales;
import algocraft.juego.Juego;
import controller.juego.BotonAbrirConstructorHerramientaEventHandler;
import controller.juego.BotonAbrirMenuPausaEventHandler;
import controller.menuprincipal.BotonAyudaEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Screen;
import view.Imagenes;

public class ContenedorInventarioMateriales extends BorderPane {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/15;
    private Button botonPausa;

    public ContenedorInventarioMateriales(PantallaJuego pantallaJuego, Juego juego){

        InventarioMateriales inventarioMateriales = juego.getJugador().getInventarioMateriales();

        GridPane gridMateriales = new GridPane();

        gridMateriales.setAlignment(Pos.CENTER);
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

        Label etiqueta1 = new Label();
        etiqueta1.setText("Constructor de");
        etiqueta1.setStyle("-fx-font-size: "+TAMANIO/5+";-fx-font-weight: bold; -fx-text-fill: #000000");

        Label etiqueta2 = new Label();
        etiqueta2.setText("herramientas");
        etiqueta2.setStyle("-fx-font-size: "+TAMANIO/5+";-fx-font-weight: bold; -fx-text-fill: #000000");

        VBox contenedorConstructor = new VBox();
        contenedorConstructor.setAlignment(Pos.CENTER);
        contenedorConstructor.setSpacing(0);
        contenedorConstructor.getChildren().addAll(etiqueta1, etiqueta2, botonConstructorHerramienta);

        Label etiqueta3 = new Label();
        etiqueta3.setText("Inventario");
        etiqueta3.setStyle("-fx-font-size: "+TAMANIO/5+";-fx-font-weight: bold; -fx-text-fill: #000000");

        Label etiqueta4 = new Label();
        etiqueta4.setText("de materiales");
        etiqueta4.setStyle("-fx-font-size: "+TAMANIO/5+";-fx-font-weight: bold; -fx-text-fill: #000000");

        VBox contenedorGridMateriales = new VBox();
        contenedorGridMateriales.setAlignment(Pos.CENTER);
        contenedorGridMateriales.setSpacing(0);
        contenedorGridMateriales.getChildren().addAll(etiqueta3, etiqueta4, gridMateriales);

        VBox centro = new VBox();
        centro.setAlignment(Pos.CENTER);
        centro.setSpacing(50);
        centro.getChildren().addAll(contenedorGridMateriales,contenedorConstructor);

        this.setCenter(centro);

        botonPausa = new Button();
        botonPausa.setAlignment(Pos.CENTER);
        botonPausa.setGraphic(new ImageView(Imagenes.get("BotonMenuPausa")));
        botonPausa.setPadding(new Insets(0, 0, 0, 0));
        botonPausa.setOnAction(new BotonAbrirMenuPausaEventHandler(pantallaJuego));
        VBox top = new VBox();
        top.setAlignment(Pos.CENTER);
        top.getChildren().addAll(botonPausa);
        top.setPadding(new Insets(15,0,0,0));

        this.setTop(top);

        Button botonAyuda = new Button();
        botonAyuda.setAlignment(Pos.CENTER);
        botonAyuda.setGraphic(new ImageView(Imagenes.get("BotonAyuda")));
        botonAyuda.setPadding(new Insets(0, 0, 0, 0));
        botonAyuda.setOnAction(new BotonAyudaEventHandler());
        VBox bottom = new VBox();
        bottom.setAlignment(Pos.CENTER);
        bottom.getChildren().addAll(botonAyuda);
        bottom.setPadding(new Insets(0,0,15,0));

        this.setBottom(bottom);
        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#c6c6c6"), CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public Button getBotonPausa() {
        return this.botonPausa;
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
