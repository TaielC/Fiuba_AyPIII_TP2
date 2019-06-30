package controller.juego;

import algocraft.excepciones.NoHaySuficienteMaterialExeption;
import algocraft.inventario.InventarioMateriales;
import algocraft.materialinventario.MaterialInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import view.PantallaConstructor;

public class BotonSelecionarMaterialEventHandler implements EventHandler<ActionEvent>{
    private MaterialInventario materialInventario;
    private PantallaConstructor pantallaConstructor;
    private InventarioMateriales inventarioMateriales;

    public BotonSelecionarMaterialEventHandler(PantallaConstructor pantallaConstructor, InventarioMateriales inventarioMateriales, MaterialInventario materialInventario){
        this.materialInventario = materialInventario;
        this.pantallaConstructor = pantallaConstructor;
        this.inventarioMateriales = inventarioMateriales;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        try {
            inventarioMateriales.agregar(inventarioMateriales.getMaterial(materialInventario));
        } catch (NoHaySuficienteMaterialExeption e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("");
            alert.setHeaderText("No se pudo Insertar el material");
            alert.setContentText("No hay suficiente material seleccionado");
            alert.show();
            return;
        }
        pantallaConstructor.setMaterialElegido(materialInventario);
    }
}
