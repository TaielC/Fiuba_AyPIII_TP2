package view.menupausajuego;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Effect;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import view.juego.PantallaJuego;

public class VentanaMenuPausa extends Stage {

    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/2;

    public VentanaMenuPausa(PantallaJuego pantallaJuego, Button botonPausa){
        super(StageStyle.UNDECORATED);

        PantallaMenuPausa pantallaMenuPausa = new PantallaMenuPausa(this);

        Scene escenaMenuPausa = new Scene(pantallaMenuPausa);
        escenaMenuPausa.setFill(Color.TRANSPARENT);

        this.setTitle("Menu Juego");
        this.initOwner(pantallaMenuPausa.getScene().getWindow());
        this.initModality(Modality.APPLICATION_MODAL);
        this.setHeight(TAMANIO*166/150);
        this.setWidth(TAMANIO*176/150);
        this.initStyle(StageStyle.TRANSPARENT);
        this.setScene(escenaMenuPausa);

        Effect efectoAnterior = pantallaJuego.getEffect();
        this.setOnHidden(e -> {
            pantallaJuego.setEffect(efectoAnterior);
            botonPausa.setEffect(new ColorAdjust());
        });
        pantallaJuego.setEffect(new GaussianBlur(8));

        this.showAndWait();
        this.setX((pantallaJuego.getWidth() - this.getWidth())/2);
        this.setY((pantallaJuego.getHeight() - this.getHeight())/2);
    }
}
