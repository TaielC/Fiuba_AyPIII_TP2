package view;

import algocraft.juego.Juego;
import javafx.scene.Scene;
import javafx.scene.effect.Effect;
import javafx.scene.effect.GaussianBlur;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class VentanaConstructor extends Stage {

    public VentanaConstructor(PantallaJuego pantallaJuego, Juego juego){
        super(StageStyle.UNDECORATED);

        PantallaConstructor pantallaConstructor = new PantallaConstructor(pantallaJuego, juego);

        Scene escenaConstructor = new Scene(pantallaConstructor);
        Effect efectoAnterior = pantallaJuego.getEffect();
        pantallaJuego.setEffect(new GaussianBlur(8));

        this.setOnHidden(h -> pantallaJuego.setEffect(efectoAnterior));
        this.setTitle("Constructor Herramientas");
        this.initOwner(pantallaJuego.getScene().getWindow());
        this.setScene(escenaConstructor);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setAlwaysOnTop(true);

        this.showAndWait();
        this.setX((pantallaJuego.getWidth() - this.getWidth())/2);
        this.setY((pantallaJuego.getHeight() - this.getHeight())/2);
    }
}
