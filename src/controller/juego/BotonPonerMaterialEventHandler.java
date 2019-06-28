package controller.juego;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.inventario.InventarioMateriales;
import algocraft.juego.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.ContenedorConstructorHerramientas;
import view.VentanaConstructor;

public class BotonPonerMaterialEventHandler implements EventHandler<ActionEvent> {
    private Juego juego;
    private int posicion;
    private TableroConstruccionHerramienta tablero;

    public BotonPonerMaterialEventHandler(ContenedorConstructorHerramientas contenedor, InventarioMateriales inventarioMateriales, TableroConstruccionHerramienta tablero, int posicion){

    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
