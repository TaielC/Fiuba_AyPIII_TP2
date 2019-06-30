package controller.juego;

import algocraft.juego.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.Nombres;
import view.PantallaJuego;

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
        jugador.equiparDeInventario(posicion);
        String nombreHerramienta = Nombres.get(jugador.getHerramientaEquipada().getClass().getName() + jugador.getHerramientaEquipada().material().getClass().getName());
        texto = ("Ahora tu herramienta equipada es un "+ nombreHerramienta);
        if(nombreHerramienta.compareTo("ninguna herramienta") == 0){texto = ("Ninguna herramienta equipada");}
        pantallaJuego.actualizar(texto);
    }
}
