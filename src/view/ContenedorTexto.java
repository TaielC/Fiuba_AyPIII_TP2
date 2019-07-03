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

        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);

        cajaDeTexto.setPrefSize(1500, 50);
        cajaDeTexto.setPadding(new Insets(5, 5, 5, 5));
        cajaDeTexto.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, new Insets(5, 5, 5, 5))));
        cajaDeTexto.setText(texto);
        this.getChildren().add(cajaDeTexto);

    }
}
