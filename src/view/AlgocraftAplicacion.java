package view;

import algocraft.juego.Juego;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class AlgocraftAplicacion extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        double height = Screen.getPrimary().getVisualBounds().getHeight() *0.9;
        double width = Screen.getPrimary().getVisualBounds().getWidth() * 0.9;

        stage.setTitle("Algocraft");

        Juego.resetJuego();
        Juego juego = Juego.getInstance();
        PantallaJuego pantallaJuego = new PantallaJuego(juego);
        Scene escenaJuego = new Scene(pantallaJuego);

        MenuPrincipal menuPrincipal = new MenuPrincipal(stage, escenaJuego);
        Scene escenaMenuPrincipal = new Scene(menuPrincipal, width, height);

        stage.setScene(escenaMenuPrincipal);
        stage.setFullScreen(false);
        stage.show();
    }
}
