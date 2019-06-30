package view;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;
import algocraft.herramienta.NingunaHerramienta;
import algocraft.juego.Juego;
import algocraft.materialinventario.MaterialInventario;
import algocraft.materialinventario.NingunMaterialInventario;
import javafx.scene.layout.BorderPane;

public class PantallaConstructor extends BorderPane{
    private MaterialInventario materialElegido;
    private Juego juego;
    private ContenedorConstructorHerramientas constructorHerramientas;
    private ContenedorMaterialesConstructor contenedorMaterialesConstructor;
    private TableroConstruccionHerramienta tablero;

    public PantallaConstructor(PantallaJuego pantallaJuego, Juego juego){
        this.tablero = new TableroConstruccionHerramienta();
        this.juego = juego;
        this.materialElegido = new NingunMaterialInventario();

        this.actualizar();
    }

    public MaterialInventario materialElegido(){
        return materialElegido;
    }


    public void setMaterialElegido(MaterialInventario materialElegido) {
        this.materialElegido = materialElegido;
        this.actualizar();
    }

    public void actualizar(){
        this.constructorHerramientas = new ContenedorConstructorHerramientas(this, juego, tablero);
        this.setCenter(constructorHerramientas);

        this.contenedorMaterialesConstructor = new ContenedorMaterialesConstructor(this,juego.getJugador().getInventarioMateriales());
        this.setBottom(contenedorMaterialesConstructor);
    }
}
