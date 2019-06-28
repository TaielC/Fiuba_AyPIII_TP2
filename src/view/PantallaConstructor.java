package view;

import algocraft.juego.Juego;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PantallaConstructor extends BorderPane{

    public PantallaConstructor(PantallaJuego pantallaJuego, Juego juego){

        GridPane constructorHerramienta = new ContenedorConstructorHerramientas(pantallaJuego, juego);
        this.setCenter(constructorHerramienta);

        GridPane materialesConstructor = new MaterialesConstructor(juego.getJugador().getInventarioMateriales());
        this.setBottom(materialesConstructor);


    }
}
