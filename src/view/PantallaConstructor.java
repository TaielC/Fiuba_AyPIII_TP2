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
    private TableroConstruccionHerramienta tablero;
    private InventarioMateriales inventarioCopiado;
    private PantallaJuego pantallaJuego;

    public PantallaConstructor(PantallaJuego pantallaJuego, Juego juego){
        this.tablero = new TableroConstruccionHerramienta();
        this.juego = juego;
        this.materialElegido = new MaterialInventarioNulo();
        this.inventarioCopiado = juego.getJugador().getInventarioMateriales().copy();
        this.pantallaJuego = pantallaJuego;

        this.actualizar();
    }

    public MaterialInventario materialElegido(){
        return materialElegido;
    }


    public void setMaterialElegido(MaterialInventario materialElegido) {
        this.materialElegido = materialElegido;
    }

    public void actualizar(){
        try {
            InventarioMateriales inventario = juego.getJugador().getInventarioMateriales();
            inventario.agregar(inventario.getMaterial(materialElegido));
        } catch (NoHaySuficienteMaterialExeption e) {
            materialElegido = new MaterialInventarioNulo();
        }
        ContenedorConstructorHerramientas constructorHerramientas = new ContenedorConstructorHerramientas(this, juego, tablero);
        this.setCenter(constructorHerramientas);

        ContenedorMaterialesConstructor contenedorMaterialesConstructor = new ContenedorMaterialesConstructor(this, juego.getJugador().getInventarioMateriales());
        this.setBottom(contenedorMaterialesConstructor);
    }

    public Juego getJuego() { return juego; }

    public InventarioMateriales getInventarioCopiado() {
        return inventarioCopiado;
    }

    public PantallaJuego getPantallaJuego() { return pantallaJuego; }
}
