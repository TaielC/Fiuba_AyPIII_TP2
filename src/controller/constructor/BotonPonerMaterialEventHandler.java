package controller.constructor;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.inventario.InventarioMateriales;
import algocraft.materialinventario.MaterialInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.constructor.PantallaConstructor;

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
        MaterialInventario material = inventarioMateriales.getMaterial(pantallaConstructor.getMaterialElegido());
        inventarioMateriales.agregar(tablero.get(posicion));
        tablero.ponerMaterial(posicion, material);

        pantallaConstructor.actualizar();
    }
}
