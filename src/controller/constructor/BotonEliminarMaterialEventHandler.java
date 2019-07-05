package controller.constructor;

import algocraft.materialinventario.MaterialInventarioNulo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.constructor.PantallaConstructor;

public class BotonEliminarMaterialEventHandler implements EventHandler<ActionEvent> {

    private PantallaConstructor pantallaConstructor;

    public BotonEliminarMaterialEventHandler(PantallaConstructor pantallaConstructor){
        this.pantallaConstructor = pantallaConstructor;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        pantallaConstructor.setMaterialElegido(new MaterialInventarioNulo());
    }
}
