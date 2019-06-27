package view;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.inventario.InventarioMateriales;
import algocraft.juego.Juego;
import algocraft.juego.Jugador;
import algocraft.juego.Posicion;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;


public class ContenedorConstructorHerramientas extends GridPane {


    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/17;

    public ContenedorConstructorHerramientas(Juego juego) {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        tablero.getTablero();
        Jugador jugador = juego.getJugador();
        InventarioMateriales inventarioMateriales = jugador.getInventarioMateriales();

        this.setAlignment(Pos.CENTER);
        this.setPrefSize(4,3);
        this.setHgap(1);
        this.setVgap(1);
        Button[][] button = new Button[3][3];

        for(int x=0 ;x<3 ;x++) {
            for(int y=0; y<3; y++) {
                button[x][y] = new Button();
                button[x][y].setMinSize(TAMANIO, TAMANIO);
                button[x][y].setPadding(new Insets(0,0,0,0));
                Posicion posicion = new Posicion(x,y);
                this.add(button[x][y],x,y);

            }
        }

        Button botonMaderaItem = new Button();
        botonMaderaItem.setGraphic(new ImageView(Imagenes.get("MaderaItem")));
        botonMaderaItem.setMinSize(TAMANIO, TAMANIO);
        botonMaderaItem.setPadding(new Insets(0,0,0,0));
        this.add(botonMaderaItem,4,0);

        Button botonMetalItem = new Button();
        botonMetalItem.setGraphic(new ImageView(Imagenes.get("MetalItem")));
        botonMetalItem.setMinSize(TAMANIO, TAMANIO);
        botonMetalItem.setPadding(new Insets(0,0,0,0));
        this.add(botonMetalItem,4,1);
        String stringMetal = botonMetalItem.getStyle();

        Button botonPiedraItem = new Button();
        botonPiedraItem.setGraphic(new ImageView(Imagenes.get("PiedraItem")));
        botonPiedraItem.setMinSize(TAMANIO, TAMANIO);
        botonPiedraItem.setPadding(new Insets(0,0,0,0));
        this.add(botonPiedraItem,4,2);

        Button boton = new Button("Obtener");
        boton.setFont(Font.font("Monospace", FontWeight.EXTRA_BOLD, 15));
        boton.setMinSize(100, 50);
        this.add(boton,2,3);

        }
}
