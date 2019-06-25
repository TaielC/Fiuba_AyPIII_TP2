package view;

import algocraft.juego.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.stage.Screen;

public class ContenedorJuego extends GridPane {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/17;

    public ContenedorJuego(Mapa mapa) {

        this.setAlignment(Pos.CENTER);
        this.setPrefSize(16,9);
        this.setHgap(1);
        this.setVgap(1);
        int tamanioHorizontal = mapa.getBordeHorizontal();
        int tamanioVertical = mapa.getBordeVertical();
        this.setPrefSize(tamanioHorizontal, tamanioVertical);
        Button[][] button = new Button[tamanioHorizontal][tamanioVertical];

        for(int x=0; x < tamanioHorizontal; x++) {
            for (int y = 0; y < tamanioVertical; y++) {
                button[x][y] = new Button();
                button[x][y].setMinSize(TAMANIO, TAMANIO);
                button[x][y].setPadding(new Insets(0,0,0,0));
                Posicion posicion = new Posicion(x,y);

                ObjetoUbicable objetoUbicable = mapa.getObjetoUbicable(posicion);
                Image imagen = Imagenes.get(objetoUbicable.getClass().getName());

                button[x][y].setGraphic(new ImageView(imagen));
                this.add(button[x][y],x,y);
            }
        }
        Image imagenFondo = Imagenes.get("FondoJuego");
        BackgroundImage fondo = new BackgroundImage(imagenFondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(fondo));
    }
}
