package view;

import algocraft.juego.Juego;

import javafx.scene.layout.BorderPane;

public class PantallaJuego extends BorderPane {

    private Juego juego;

    public PantallaJuego(Juego juego){
        this.juego = juego;
        String textoInicial = ("Bienvenido a AlgoCraft! \nEn este momento no tienes ninguna herramienta equipada. " +
                "Para equipar una herramienta seleccione una del inventario que se encuentra a la derecha.");
        actualizar(textoInicial);
    }

    public void actualizar(String texto) {
        ContenedorJuego contenedorJuego = new ContenedorJuego(this, juego);
        this.setCenter(contenedorJuego);

        ContenedorInventarioHerramientas contenedorInventarioHerramientas = new ContenedorInventarioHerramientas(this, juego);
        this.setRight(contenedorInventarioHerramientas);

        ContenedorInventarioMateriales contenedorInventarioMateriales = new ContenedorInventarioMateriales(this, juego);
        this.setLeft(contenedorInventarioMateriales);

        ContenedorTexto contenedorTexto = new ContenedorTexto(texto);
        this.setBottom(contenedorTexto);
    }
}
