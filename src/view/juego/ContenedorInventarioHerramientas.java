package view.juego;

import algocraft.herramienta.Herramienta;
import algocraft.inventario.InventarioHerramientas;
import algocraft.juego.Juego;
import algocraft.juego.Jugador;
import algocraft.materialherramienta.MaterialHerramienta;
import controller.juego.BotonInventarioHerramientasEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import media.Imagenes;

public class ContenedorInventarioHerramientas extends VBox {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/15;

    public ContenedorInventarioHerramientas(PantallaJuego pantallaJuego, Juego juego){

        Jugador jugador = juego.getJugador();
        InventarioHerramientas inventarioHerramientas = jugador.getInventarioHerramientas();
        GridPane gridInventario = new GridPane();
        gridInventario.setAlignment(Pos.CENTER);
        gridInventario.setPrefSize(1, inventarioHerramientas.getTamanio());

        for(int i = 0; i < inventarioHerramientas.getTamanio(); i++){
            Button boton = new Button();
            boton.setMinSize(TAMANIO*1.2, TAMANIO*1.2);
            boton.setPadding(new Insets(0,0,0,0));

            Herramienta herramienta = inventarioHerramientas.ver(i);
            MaterialHerramienta material = herramienta.material();

            Image imagen = Imagenes.get( herramienta.getClass().getName() + material.getClass().getName());
            StackPane stackPane = new StackPane();
            stackPane.setPrefSize(TAMANIO*1.2, TAMANIO*1.2);
            stackPane.getChildren().addAll(new ImageView(Imagenes.get("FondoCasillero")), new ImageView(imagen));
            boton.setGraphic(stackPane);

            BotonInventarioHerramientasEventHandler botonEventHandler = new BotonInventarioHerramientasEventHandler(pantallaJuego, jugador, i);
            boton.setOnAction(botonEventHandler);

            gridInventario.add(boton, 0, i);
        }

        Herramienta herramientaEquipada = jugador.getHerramientaEquipada();
        MaterialHerramienta material = herramientaEquipada.material();
        Image imagen = Imagenes.get( herramientaEquipada.getClass().getName() + material.getClass().getName());
        ImageView vistaHerramienta = new ImageView(imagen);

        StackPane contenedorVistaImagen = new StackPane();
        contenedorVistaImagen.setPrefSize(TAMANIO*1.3, TAMANIO*1.3);
        contenedorVistaImagen.getChildren().addAll(new ImageView(Imagenes.get("FondoHerramientaEquipada")), vistaHerramienta);
        contenedorVistaImagen.setAlignment(Pos.CENTER);

        Label etiqueta1 = new Label();
        etiqueta1.setText("Inventario");
        etiqueta1.setStyle("-fx-font-size:"+TAMANIO/5+";-fx-font-weight: bold; -fx-text-fill: #000000");

        Label etiqueta2 = new Label();
        etiqueta2.setText("de herramientas");
        etiqueta2.setPadding(new Insets(0,0,10,0));
        etiqueta2.setStyle("-fx-font-size:"+TAMANIO/5+";-fx-font-weight: bold; -fx-text-fill: #000000");

        VBox contenedorInventarioHerramientas = new VBox();
        contenedorInventarioHerramientas.setAlignment(Pos.CENTER);
        contenedorInventarioHerramientas.setSpacing(2);
        contenedorInventarioHerramientas.getChildren().addAll(etiqueta1, etiqueta2, gridInventario);

        Label etiqueta3 = new Label();
        etiqueta3.setText("Herramienta");
        etiqueta3.setStyle("-fx-font-size:"+TAMANIO/5+";-fx-font-weight: bold; -fx-text-fill: #000000");

        Label etiqueta4 = new Label();
        etiqueta4.setText("equipada:");
        etiqueta4.setStyle("-fx-font-size:"+TAMANIO/5+";-fx-font-weight: bold; -fx-text-fill: #000000");

        VBox contenedorVistaHerramienta = new VBox();
        contenedorVistaHerramienta.setAlignment(Pos.CENTER);
        contenedorVistaHerramienta.setSpacing(0);
        contenedorVistaHerramienta.getChildren().addAll(etiqueta3, etiqueta4, contenedorVistaImagen);

        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#c6c6c6"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(3,3,3,3));
        this.setSpacing(50);
        this.getChildren().addAll(contenedorInventarioHerramientas, contenedorVistaHerramienta);
    }
}
