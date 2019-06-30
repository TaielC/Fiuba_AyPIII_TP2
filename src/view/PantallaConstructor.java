package view;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.juego.Juego;
import algocraft.materialinventario.MaterialInventario;
import algocraft.materialinventario.NingunMaterialInventario;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PantallaConstructor extends BorderPane{
    private MaterialInventario materialInventario;
    private Juego juego;
    private ContenedorConstructorHerramientas constructorHerramientas;
    private MaterialesConstructor materialesConstructor;
    private TableroConstruccionHerramienta tablero;

    public PantallaConstructor(PantallaJuego pantallaJuego, Juego juego){
        this.tablero = new TableroConstruccionHerramienta();
        this.juego = juego;
        this.materialInventario = new NingunMaterialInventario();

        this.actualizar();
    }

    public MaterialInventario materialActual(){
        return materialInventario;
    }

    public void setMaterialInventario(MaterialInventario materialInventario) {
        this.materialInventario = materialInventario;
        this.actualizar();
    }

    public void actualizar(){
        this.constructorHerramientas = new ContenedorConstructorHerramientas(this, juego, tablero);
        this.setCenter(constructorHerramientas);

        this.materialesConstructor = new MaterialesConstructor(this,juego.getJugador().getInventarioMateriales());
        this.setBottom(materialesConstructor);
    }
}
