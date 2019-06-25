package view;

import algocraft.juego.Juego;
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

    public PantallaJuego(Juego juego){

        this.tablero = new Tablero();

        this.setCenter(tablero);

    }

}
