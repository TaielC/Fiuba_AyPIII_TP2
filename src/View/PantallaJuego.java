package View;
import Controller.BotonConstructorDeHerramientasEventHandler;

import algocraft.juego.Juego;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
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
    ConstructorDeHerramientas vistaDeConstructorDeHerramientas;
    GridPane PanelConstructorDeHerramientas;

    public PantallaJuego(Juego juego){

        this.tablero = new Tablero();

        this.setCenter(tablero.Tablero());
        
        
        Button boton = new Button("Mesa de Crafteo");
        BotonConstructorDeHerramientasEventHandler botonHerramientas = new BotonConstructorDeHerramientasEventHandler();
        boton.setOnAction(botonHerramientas);
        
        
        Image imagen = new Image("file:imagenes/ConstructorHerramienta.png",60,60,false,false);
        boton.setGraphic(new ImageView(imagen));
        
        this.setBottom(boton);
        
        
 
        
        

    }

}
