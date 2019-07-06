package view.juego;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ContenedorTexto extends HBox {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/15;

    public ContenedorTexto(String texto){

        TextArea cajaDeTexto = new TextArea();

        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setFillHeight(false);
        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#c6c6c6"), CornerRadii.EMPTY, Insets.EMPTY)));

        cajaDeTexto.setPrefSize(1500, 50);
        cajaDeTexto.setPadding(new Insets(10, 5, 10, 5));
        cajaDeTexto.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, new Insets(5, 5, 5, 5))));
        cajaDeTexto.setText(texto);
        cajaDeTexto.setStyle("-fx-font-size: "+TAMANIO/4+";-fx-font-weight: bold; -fx-text-fill: #000000");
        this.getChildren().add(cajaDeTexto);
    }
}
