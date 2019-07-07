package controller.juego;

import algocraft.juego.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import media.Sonidos;
import view.Nombres;
import view.juego.PantallaJuego;

public class BotonInventarioHerramientasEventHandler implements EventHandler<ActionEvent> {

    private Jugador jugador;
    private int posicion;
    private PantallaJuego pantallaJuego;
    private String texto;

    public BotonInventarioHerramientasEventHandler(PantallaJuego pantallaJuego, Jugador jugador, int posicion) {
        this.jugador = jugador;
        this.posicion = posicion;
        this.pantallaJuego = pantallaJuego;
        this.texto = (" ");
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Media sound = Sonidos.get("boton");
        MediaPlayer sonido = new MediaPlayer(sound);
        sonido.play();

        jugador.equiparDeInventario(posicion);
        String nombreHerramienta = Nombres.get(jugador.getHerramientaEquipada().getClass().getName() + jugador.getHerramientaEquipada().material().getClass().getName());
        texto = ("Ahora tu herramienta equipada es un "+ nombreHerramienta);
        if(nombreHerramienta.equals("ninguna herramienta")){texto = ("Ninguna herramienta equipada.");}
        pantallaJuego.actualizar(texto);
    }
}
