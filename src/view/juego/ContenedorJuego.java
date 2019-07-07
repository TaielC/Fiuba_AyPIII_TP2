package view.juego;

import algocraft.juego.*;
import controller.juego.BotonMaterialMineralEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Screen;
import view.Imagenes;

import java.io.File;

public class ContenedorJuego extends GridPane {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/17;

    public ContenedorJuego(PantallaJuego pantallaJuego, Juego juego) {
        Mapa mapa = juego.getMapa();

        this.setAlignment(Pos.CENTER);
        this.setGridLinesVisible(false);
        this.setHgap(0);
        this.setVgap(0);
        int tamanioHorizontal = mapa.getBordeHorizontal();
        int tamanioVertical = mapa.getBordeVertical();
        this.setPrefSize(tamanioHorizontal, tamanioVertical);

        for(int x=0; x < tamanioHorizontal; x++) {
            for (int y = 0; y < tamanioVertical; y++) {
                Button boton = new Button();
                boton.setMinSize(TAMANIO, TAMANIO);
                boton.setPadding(new Insets(0,0,0,0));
                Posicion posicion = new Posicion(x,y);

                ObjetoUbicable objetoUbicable = mapa.getObjetoUbicable(posicion);
                Image imagen = Imagenes.get(objetoUbicable.getClass().getName());

                String musicFile = "sonidos/golpe.mp3";
                Media sound = new Media(new File(musicFile).toURI().toString());
                MediaPlayer sonido = new MediaPlayer(sound);

                boton.setGraphic(new ImageView(imagen));
                BotonMaterialMineralEventHandler botonEventHandler = new BotonMaterialMineralEventHandler(pantallaJuego, juego, posicion, sonido);
                boton.setOnAction(botonEventHandler);
                this.add(boton,x,y);
            }
        }

        Image imagenFondo = Imagenes.get("FondoJuego");
        BackgroundImage fondo = new BackgroundImage(imagenFondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setPadding(new Insets(25,25,25,25));
        this.setBackground(new Background(fondo));
    }
}
