package view;

import algocraft.juego.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.stage.Screen;

public class Tablero extends TilePane {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/20;

    public Tablero(Mapa mapa, Jugador jugador) {

        this.setHgap(0);
        this.setVgap(0);
        this.setAlignment(Pos.CENTER);
        this.setPrefColumns(16);
        this.setPrefRows(9);
        this.setHgap(1);
        this.setVgap(1);
        Button[][] button = new Button[16][9];

        Posicion posicionJugador = jugador.getPosicion();
        for(int x=0; x < 16; x++) {
            for (int y = 0; y < 9; y++) {
                button[x][y] = new Button();
                button[x][y].setMinSize(TAMANIO, TAMANIO);
                button[x][y].setPadding(new Insets(0,0,0,0));
                Posicion posicion = new Posicion(x,y);

                ObjetoUbicable objetoUbicable = mapa.getObjetoUbicable(posicion);
                Image imagen = new Image("file:imagenes/"+objetoUbicable.getClass().getName()+".png",TAMANIO,TAMANIO,false,false);

                button[x][y].setGraphic(new ImageView(imagen));
                this.getChildren().add(button[x][y]);
            }
        }
        Image imagenFondo = new Image("file:imagenes/Borde.png", 100, 100, false, false);
        BackgroundImage fondo = new BackgroundImage(imagenFondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(fondo));
    }
}
