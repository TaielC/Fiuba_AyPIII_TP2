package view;

import algocraft.juego.Juego;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;

public class VentanaConstructor extends Stage {

    public VentanaConstructor(PantallaJuego pantallaJuego,Juego juego){

        PantallaConstructor pantallaConstructor = new PantallaConstructor(pantallaJuego, juego);

        Scene escenaConstructor = new Scene(pantallaConstructor);

        this.setTitle("Constructor Herramientas");
        this.setScene(escenaConstructor);

        this.show();

    }
}
