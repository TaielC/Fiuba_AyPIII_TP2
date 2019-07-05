package view.juego;

import algocraft.juego.Juego;


import controller.juego.BotonSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import view.Imagenes;

public class PantallaJuego extends BorderPane {

    private Juego juego;
    private GridPane bottomPane;

    public PantallaJuego(Juego juego){
        this.juego = juego;
        String textoInicial = ("Bienvenido a AlgoCraft! \nEn este momento no tienes ninguna herramienta equipada. " +
                "Para equipar una herramienta seleccione una del inventario que se encuentra a la derecha.");
        actualizar(textoInicial);
        bottomPane = new GridPane();
        Button botonSalir = new Button();
        botonSalir.setText("Cerrar");
        botonSalir.setFont(Font.font("Monospace", FontWeight.EXTRA_BOLD, 30));
        botonSalir.setMinSize(400, 100);
        botonSalir.setBackground(new Background(new BackgroundImage(Imagenes.get("BotonMenuPrincipal"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(400, 100, false, false, false, false))));
        botonSalir.setOnAction(new BotonSalirEventHandler());
        botonSalir.setAlignment(Pos.BOTTOM_LEFT);

        bottomPane.add(botonSalir, 0,1);
        bottomPane.setAlignment(Pos.CENTER);
        bottomPane.setVgap(30);
        bottomPane.setPadding(new Insets(40, 40, 30, 30));
        bottomPane.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, new Insets(5, 5, 5, 5))));
    }

    public void actualizar(String texto) {

        ContenedorJuego contenedorJuego = new ContenedorJuego(this, juego);
        this.setCenter(contenedorJuego);

        ContenedorInventarioHerramientas contenedorInventarioHerramientas = new ContenedorInventarioHerramientas(this, juego);
        this.setRight(contenedorInventarioHerramientas);

        ContenedorInventarioMateriales contenedorInventarioMateriales = new ContenedorInventarioMateriales(this, juego);
        this.setLeft(contenedorInventarioMateriales);

        ContenedorTexto contenedorTexto = new ContenedorTexto(texto);
        this.setBottom(contenedorTexto);
    }
}
