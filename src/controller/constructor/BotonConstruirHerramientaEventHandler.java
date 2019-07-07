package controller.constructor;

import algocraft.excepciones.InventarioHerramientasEstaLlenoException;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.HerramientaNula;
import algocraft.juego.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import view.constructor.PantallaConstructor;

import java.io.File;

public class BotonConstruirHerramientaEventHandler implements EventHandler<ActionEvent>  {

    private PantallaConstructor pantallaConstructor;
    private Herramienta herramienta;
    private String texto;
    private MediaPlayer sonido;

    public BotonConstruirHerramientaEventHandler(PantallaConstructor pantallaConstructor, Herramienta herramienta) {
        this.pantallaConstructor = pantallaConstructor;
        this.herramienta = herramienta;
        this.texto = ("Se ha agregado una nueva herramienta al inventario!");

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String musicFile = "sonidos/nuevaHerramienta.mp3";
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer sonido = new MediaPlayer(sound);
        this.sonido = sonido;

        if(herramienta instanceof HerramientaNula) return;
        Jugador jugador = pantallaConstructor.getJuego().getJugador();
        try{
            jugador.agregarAInventario(herramienta);
            sonido.play();
        } catch (InventarioHerramientasEstaLlenoException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("");
            alert.setHeaderText("El Inventario de Herramientas está Lleno, no se puede agregar");
            alert.show();
            return;
        }
        jugador.actualizarInventarioMateriales(pantallaConstructor.getInventarioCopiado().copy());
        pantallaConstructor.getPantallaJuego().actualizar(texto);
        pantallaConstructor.reiniciar();
    }
}
