package view;

import algocraft.juego.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.stage.Screen;

public class Tablero extends GridPane {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/10;

    public Tablero() {

        this.setHgap(0);
        this.setVgap(0);
        this.setAlignment(Pos.CENTER);
        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        Mapa mapa = juego.getMapa();
        this.setHgap(1);
        this.setVgap(1);
        this.setPrefSize(16,9);
        Button[][] button = new Button[16][9];

        Image pasto = new Image("file:imagenes/ObjetoAire.png",TAMANIO,TAMANIO,false,false);
        for(int x=0; x < 16; x++) {
            for (int y = 0; y < 9; y++) {
                button[x][y] = new Button();
                button[x][y].setMinSize(TAMANIO, TAMANIO);
                button[x][y].setPadding(new Insets(0,0,0,0));
                Posicion posicion = new Posicion(x,y);

                Image imagen = pasto;
                if(mapa.getObjetoUbicable(posicion) != null){
                    if(mapa.getObjetoUbicable(posicion).getString().equals( "Madera")){
                        imagen = new Image("file:imagenes/Mineral/MaderaMineral.png",TAMANIO,TAMANIO,false,false);
                    }
                    if(mapa.getObjetoUbicable(posicion).getString().equals( "Metal")){
                        imagen = new Image("file:imagenes/Mineral/MetalMineral.png",TAMANIO,TAMANIO,false,false);
                    }
                    if(mapa.getObjetoUbicable(posicion).getString().equals( "Piedra")){
                        imagen = new Image("file:imagenes/Mineral/PiedraMineral.png",TAMANIO,TAMANIO,false,false);
                    }
                    if (mapa.getObjetoUbicable(posicion).getString().equals( "Diamante")){
                        imagen = new Image("file:imagenes/Mineral/DiamanteMineral.png",TAMANIO,TAMANIO,false,false);
                    }
                }
                button[x][y].setGraphic(new ImageView(imagen));
                this.add(button[x][y],x,y);
            }
        }
        Image imagenFondo = new Image("file:imagenes/Borde.png", 100, 100, false, false);
        BackgroundImage fondo = new BackgroundImage(imagenFondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(fondo));
    }
}
