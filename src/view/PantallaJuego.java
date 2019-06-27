package view;

import algocraft.juego.Juego;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class PantallaJuego extends BorderPane {

    private ContenedorJuego contenedorJuego;
    private Juego juego;
    private ContenedorMateriales contenedorMateriales;

    public PantallaJuego(Juego juego){
        this.juego = juego;
        this.contenedorJuego = new ContenedorJuego(juego);

        this.setCenter(contenedorJuego);

        this.setLeft(new ContenedorHerramientas(juego.getJugador()));

        this.contenedorMateriales =  new ContenedorMateriales(juego);
        this.setRight(contenedorMateriales);
    }

    public void actualizar() {
        this.contenedorJuego = new ContenedorJuego(juego);
        this.setCenter(contenedorJuego);
        this.contenedorMateriales =  new ContenedorMateriales(this.juego);
        this.setRight(contenedorMateriales);

    }

    public ContenedorJuego getContenedorJuego() {
        return contenedorJuego;
    }
}
