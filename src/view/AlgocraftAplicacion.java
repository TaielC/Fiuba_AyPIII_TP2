package view;

import algocraft.juego.Juego;

import controller.AplicacionOnKeyPressEventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Screen;
import javafx.stage.Stage;
import view.juego.PantallaJuego;
import view.menuprincipal.PantallaMenuPrincipal;

public class AlgocraftAplicacion extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        double height = Screen.getPrimary().getVisualBounds().getHeight() *0.9;
        double width = Screen.getPrimary().getVisualBounds().getWidth() * 0.9;

        stage.setTitle("Algocraft");
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);

        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        PantallaJuego pantallaJuego = new PantallaJuego(juego);
        Scene escenaJuego = new Scene(pantallaJuego);

        AplicacionOnKeyPressEventHandler AplicacionOnKeyPressEventHandler = new AplicacionOnKeyPressEventHandler(pantallaJuego, juego, stage);
        escenaJuego.setOnKeyPressed(AplicacionOnKeyPressEventHandler);

        PantallaMenuPrincipal menuPrincipal = new PantallaMenuPrincipal(stage, escenaJuego);
        Scene escenaMenuPrincipal = new Scene(menuPrincipal, width, height);

        stage.setFullScreen(false);
        stage.setScene(escenaMenuPrincipal);
        stage.show();
    }
}
