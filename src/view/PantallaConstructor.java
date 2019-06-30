package view;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.excepciones.NoHaySuficienteMaterialExeption;
import algocraft.inventario.InventarioMateriales;
import algocraft.juego.Juego;
import algocraft.materialinventario.MaterialInventario;
import algocraft.materialinventario.MaterialInventarioNulo;
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
        this.materialElegido = new MaterialInventarioNulo();

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
        try {
            InventarioMateriales inventario = juego.getJugador().getInventarioMateriales();
            inventario.agregar(inventario.getMaterial(materialElegido));
        } catch (NoHaySuficienteMaterialExeption e) {
            materialElegido = new MaterialInventarioNulo();
        }
        this.constructorHerramientas = new ContenedorConstructorHerramientas(this, juego, tablero);
        this.setCenter(constructorHerramientas);

        this.contenedorMaterialesConstructor = new ContenedorMaterialesConstructor(this,juego.getJugador().getInventarioMateriales());
        this.setBottom(contenedorMaterialesConstructor);
    }
}
