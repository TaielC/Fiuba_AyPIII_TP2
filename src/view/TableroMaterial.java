package view;
import algocraft.juego.*;
import algocraft.materialmineral.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.stage.Screen;

public class TableroMaterial extends GridPane{

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/15;

    public TableroMaterial(){
        this.setHgap(0);
        this.setVgap(0);
        this.setAlignment(Pos.CENTER);
        this.setPrefSize(16,9);
        this.setHgap(1);
        this.setVgap(20);
        this.add(new ImageView(Imagenes.get("MaderaItem")),0,1);
        this.add(new ImageView(Imagenes.get("MetalItem")),0,3);
        this.add(new ImageView(Imagenes.get("PiedraItem")),0,5);
        this.add(new ImageView(Imagenes.get("DiamanteItem")),0,7);

        Button button  =  new Button();



        Image imagenFondo = Imagenes.get("FondoMenu");
        BackgroundImage fondo = new BackgroundImage(imagenFondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(fondo));
    }

}
