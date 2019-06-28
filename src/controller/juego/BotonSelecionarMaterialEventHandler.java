package controller.juego;

import algocraft.materialinventario.MaterialInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.PantallaConstructor;

public class BotonSelecionarMaterialEventHandler implements EventHandler<ActionEvent>{
    private MaterialInventario materialInventario;
    private PantallaConstructor pantallaConstructor;


    public BotonSelecionarMaterialEventHandler(PantallaConstructor pantallaConstructor, MaterialInventario materialInventario){
        this.materialInventario = materialInventario;
        this.pantallaConstructor = pantallaConstructor;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        pantallaConstructor.setMaterialInventario(this.materialInventario);

    }

}
