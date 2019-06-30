package view;

import algocraft.herramienta.Herramienta;
import algocraft.inventario.InventarioHerramientas;
import algocraft.juego.Juego;
import algocraft.juego.Jugador;
import algocraft.materialherramienta.MaterialHerramienta;
import controller.juego.BotonInventarioHerramientasEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;

public class ContenedorInventarioHerramientas extends VBox {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/17;

    public ContenedorInventarioHerramientas(PantallaJuego pantallaJuego, Juego juego){

        Jugador jugador = juego.getJugador();
        InventarioHerramientas inventarioHerramientas = jugador.getInventarioHerramientas();
        GridPane gridInventario = new GridPane();
        gridInventario.setAlignment(Pos.CENTER);
        gridInventario.setPrefSize(1, inventarioHerramientas.getTamanio());

        for(int i = 0; i < inventarioHerramientas.getTamanio(); i++){
            Button boton = new Button();
            boton.setMinSize(TAMANIO, TAMANIO);
            boton.setPadding(new Insets(1,1,1,1));

            Herramienta herramienta = inventarioHerramientas.ver(i);
            MaterialHerramienta material = herramienta.material();

            Image imagen = Imagenes.get( herramienta.getClass().getName() + material.getClass().getName());
            boton.setGraphic(new ImageView(imagen));

            BotonInventarioHerramientasEventHandler botonEventHandler = new BotonInventarioHerramientasEventHandler(pantallaJuego, jugador, i);
            boton.setOnAction(botonEventHandler);

            gridInventario.add(boton, 0, i);
        }

        Herramienta herramientaEquipada = jugador.getHerramientaEquipada();
        MaterialHerramienta material = herramientaEquipada.material();
        Image imagen = Imagenes.get( herramientaEquipada.getClass().getName() + material.getClass().getName());
        ImageView vistaHerramienta = new ImageView(imagen);

        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(3,3,3,3));
        this.setSpacing(50);
        this.getChildren().addAll(gridInventario, vistaHerramienta);
    }
}
