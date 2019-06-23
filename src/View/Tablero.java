package View;


//import java.awt.*;
import javax.swing.*;
import algocraft.juego.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javax.swing.text.Element;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;



public class Tablero {

    public static TilePane Tablero() {


        TilePane PanelTablero = new TilePane();
        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        Mapa mapa = juego.getMapa();
        PanelTablero.setHgap(0);
        PanelTablero.setVgap(0);
        Button[][] button = new Button[12][12];


        for(int x=0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                button[x][y] = new Button();
                button[x][y].setStyle("-fx-background-color: #000000 ");
                Posicion posicion = new Posicion(x,y);

                Image imagen = new Image("file:imagenes/TierraMenu1.png",60,60,false,false);
                button[x][y].setGraphic(new ImageView(imagen));

                if(mapa.getObjetoUbicable(posicion) != null){
                    if(mapa.getObjetoUbicable(posicion).getString().equals( "Madera")){
                        button[x][y].setGraphic(new ImageView(imagen));
                        imagen = new Image("file:imagenes/Mineral/MaderaMineral.png");
                    }
                    if(mapa.getObjetoUbicable(posicion).getString().equals( "Metal")){
                        button[x][y].setGraphic(new ImageView(imagen));
                        imagen = new Image("file:imagenes/Mineral/MetalMineral.png");
                    }
                    if(mapa.getObjetoUbicable(posicion).getString().equals( "Piedra")){
                        button[x][y].setGraphic(new ImageView(imagen));
                        imagen = new Image("file:imagenes/Mineral/PiedraMineral.png");
                    }
                    if (mapa.getObjetoUbicable(posicion).getString().equals( "Diamante")){
                        button[x][y].setGraphic(new ImageView(imagen));
                        imagen = new Image("file:imagenes/Mineral/DiamanteMineral.png");
                    }
                }
                PanelTablero.setBackground(new Background(new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
                //button[x][y].setGraphic(new ImageView(imagen));
                PanelTablero.getChildren().add(button[x][y]);
            }

        }

        //PanelTablero.setLayout(new GridLayout(8, 12));
        return PanelTablero;
    }

}