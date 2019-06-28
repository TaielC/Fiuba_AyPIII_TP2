package controller.juego;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.juego.Juego;
import algocraft.juego.Posicion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.ContenedorConstructorHerramientas;
import view.ContenedorJuego;
import view.PantallaJuego;
import view.VentanaConstructor;

public class BotonConstructorHerramientaEventHandler implements EventHandler<ActionEvent> {
    private Stage stage;
    private Juego juego;
    private PantallaJuego pantallaJuego;

    public BotonConstructorHerramientaEventHandler(PantallaJuego pantallaJuego, Juego juego) {
        //this.pantallaCompleta = true;
        this.juego = juego;
        this.pantallaJuego = pantallaJuego;


    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.stage = new VentanaConstructor(this.pantallaJuego, this.juego);


    }

}