package controller.juego;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.inventario.InventarioMateriales;
import algocraft.juego.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.ContenedorConstructorHerramientas;
import view.PantallaConstructor;
import view.VentanaConstructor;

public class BotonPonerMaterialEventHandler implements EventHandler<ActionEvent> {
    private PantallaConstructor pantallaConstructor;
    private int posicion;
    private TableroConstruccionHerramienta tablero;
    private InventarioMateriales inventarioMateriales;

    public BotonPonerMaterialEventHandler(PantallaConstructor pantallaConstructor, InventarioMateriales inventarioMateriales, TableroConstruccionHerramienta tablero, int posicion){
        this.pantallaConstructor = pantallaConstructor;
        this.posicion = posicion;
        this.tablero = tablero;
        this.inventarioMateriales = inventarioMateriales;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        tablero.ponerMaterial(posicion,pantallaConstructor.materialActual());
        pantallaConstructor.actualizar();



    }
}
