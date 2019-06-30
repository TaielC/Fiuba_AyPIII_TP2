package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.control.TextArea;

public class ContenedorTexto extends HBox {

    private TextArea cajaDeTexto;
    private String texto;

    public ContenedorTexto(String texto){
        TextArea cajaDeTexto = new TextArea();
        this.cajaDeTexto = cajaDeTexto;

        //this.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, new Insets(5, 5, 5, 5))));
        this.setAlignment(Pos.CENTER);
        this.setPrefSize(50,50);
        this.setSpacing(10);

        cajaDeTexto.setPrefSize(925,925);
        cajaDeTexto.setPadding(new Insets(5, 5, 5, 5));
        cajaDeTexto.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, new Insets(5, 5, 5, 5))));
        cajaDeTexto.setText(texto);
        this.getChildren().add(cajaDeTexto);

    }
}
