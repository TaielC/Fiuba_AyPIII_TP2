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

        ContenedorInventarioHerramientas contenedorInventarioHerramientas = new ContenedorInventarioHerramientas(this, juego);
        this.setRight(contenedorInventarioHerramientas);

        ContenedorInventarioMateriales contenedorInventarioMateriales = new ContenedorInventarioMateriales(this, juego);
        this.setLeft(contenedorInventarioMateriales);
    }
}
