package view;

import algocraft.juego.Juego;

import javafx.scene.layout.BorderPane;

public class PantallaJuego extends BorderPane {

    private Juego juego;

    public PantallaJuego(Juego juego){
        this.juego = juego;
        actualizar();
    }

    public void actualizar() {
        ContenedorJuego contenedorJuego = new ContenedorJuego(this, juego);
        this.setCenter(contenedorJuego);

        ContenedorHerramientas contenedorHerramientas = new ContenedorHerramientas(this, juego);
        this.setRight(contenedorHerramientas);

        ContenedorMateriales contenedorMateriales = new ContenedorMateriales(this, juego);
        this.setLeft(contenedorMateriales);
    }
}
