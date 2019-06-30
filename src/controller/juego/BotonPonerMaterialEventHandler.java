package controller.juego;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.excepciones.NoHaySuficienteMaterialExeption;
import algocraft.inventario.InventarioMateriales;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.stage.StageStyle;
import view.PantallaConstructor;

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
        try {
            tablero.ponerMaterial(posicion, inventarioMateriales.getMaterial(pantallaConstructor.materialElegido()));
        } catch (NoHaySuficienteMaterialExeption e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("");
            alert.setHeaderText("No se pudo Insertar el material");
            alert.setContentText("No hay suficiente material seleccionado");
            alert.show();
        }

        pantallaConstructor.actualizar();
    }
}
