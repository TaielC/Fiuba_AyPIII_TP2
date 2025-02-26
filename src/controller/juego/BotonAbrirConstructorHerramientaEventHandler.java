package controller.juego;

import algocraft.juego.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import media.Sonidos;
import view.juego.PantallaJuego;
import view.constructor.VentanaConstructor;

public class BotonAbrirConstructorHerramientaEventHandler implements EventHandler<ActionEvent> {
    private Juego juego;
    private PantallaJuego pantallaJuego;


    public BotonAbrirConstructorHerramientaEventHandler(PantallaJuego pantallaJuego, Juego juego) {
        this.juego = juego;
        this.pantallaJuego = pantallaJuego;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Media sound = Sonidos.get("boton");
        MediaPlayer sonido = new MediaPlayer(sound);

        Button boton = (Button) actionEvent.getSource();
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(-0.5);
        boton.setEffect(colorAdjust);
        sonido.play();
        new VentanaConstructor(this.pantallaJuego, this.juego, boton);
    }
}