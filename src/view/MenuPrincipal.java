package view;

import controller.BotonAyudaEventHandler;
import controller.BotonJugarEventHandler;
import controller.BotonSalirEventHandler;
import controller.CheckBoxEventHandler;
import javafx.geometry.Pos;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MenuPrincipal extends VBox {

    private Stage stage;

    private static final Font FUENTE_BOTONES = Font.font("Monospace", FontWeight.EXTRA_BOLD, 30);

    public MenuPrincipal(Stage stage, Scene escenaJuego) {
        super();
        this.stage = stage;

        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);

        Image imagenTitulo = new Image("file:imagenes/LogoInicio1.png");
        ImageView vistaImagenTitulo = new ImageView(imagenTitulo);

        Label subTitulo = new Label("Algoritmos y Programación III");
        subTitulo.setFont(Font.font("Monospace", FontWeight.EXTRA_LIGHT, 25));
        subTitulo.setTextFill(Color.LIGHTGRAY);

        Button botonJugar = nuevoBoton("Jugar");
        BotonJugarEventHandler botonJugarEventHandler = new BotonJugarEventHandler(stage, escenaJuego);
        botonJugar.setOnAction(botonJugarEventHandler);

        Button botonAyuda = nuevoBoton("Ayuda");
        botonAyuda.setOnAction(new BotonAyudaEventHandler());

        Button botonSalir = nuevoBoton("Salir");
        botonSalir.setOnAction(new BotonSalirEventHandler());

        CheckBox pantallaCompleta = new CheckBox("Pantalla Completa [s/n]");
        pantallaCompleta.setFont(FUENTE_BOTONES);
        pantallaCompleta.setTextFill(Color.LIGHTGRAY);
        pantallaCompleta.setSelected(true);
        pantallaCompleta.setOnAction(new CheckBoxEventHandler(pantallaCompleta, botonJugarEventHandler));

        Image imagen = new Image("file:imagenes/TierraMenu.png", 100, 100, false, false);
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));

        this.getChildren().addAll(vistaImagenTitulo, subTitulo, botonJugar, botonAyuda, botonSalir, pantallaCompleta);
    }

    private Button nuevoBoton(String texto) {
        Button boton = new Button();
        boton.setText(texto);
        boton.setFont(FUENTE_BOTONES);
        boton.setMinSize(400, 50);
        return boton;
    }
}
