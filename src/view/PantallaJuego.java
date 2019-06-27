package view;

import algocraft.juego.Juego;

import javafx.scene.layout.BorderPane;

public class PantallaJuego extends BorderPane {

    private ContenedorJuego contenedorJuego;
    private Juego juego;
    private ContenedorMateriales contenedorMateriales;
    private ContenedorHerramientas contenedorHerramientas;

    public PantallaJuego(Juego juego){
        this.juego = juego;

        actualizar();
    }

    public void actualizar() {
        this.contenedorJuego = new ContenedorJuego(this, juego);
        this.setCenter(contenedorJuego);

        this.contenedorHerramientas = new ContenedorHerramientas(this, juego);
        this.setRight(contenedorHerramientas);

        this.contenedorMateriales = new ContenedorMateriales(this, juego);
        this.setLeft(contenedorMateriales);
    }
}
