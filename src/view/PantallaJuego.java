package view;

import algocraft.juego.Juego;
import controller.AplicacionOnMousePressEventHandler;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javax.swing.*;
import java.awt.*;
import javafx.embed.swing.SwingNode;



public class PantallaJuego extends BorderPane {

    private Tablero tablero;
    private Juego juego;
    private TableroMaterial tableroMaterial;

    public PantallaJuego(Juego juego){
        this.juego = juego;
        this.tablero = new Tablero(juego.getMapa());
        this.setCenter(tablero);
        this.tableroMaterial =  new TableroMaterial();
        this.setRight(tableroMaterial);

    }

    public void actualizar() {
        this.tablero = new Tablero(juego.getMapa());
        this.setCenter(tablero);
        this.tableroMaterial =  new TableroMaterial();
        this.setRight(tableroMaterial);

    }
}
