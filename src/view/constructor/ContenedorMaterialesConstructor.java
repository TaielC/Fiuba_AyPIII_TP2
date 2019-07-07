package view.constructor;

import algocraft.inventario.InventarioMateriales;
import algocraft.materialinventario.*;
import controller.constructor.BotonSelecionarMaterialEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import media.Imagenes;

public class ContenedorMaterialesConstructor extends GridPane {

    private PantallaConstructor pantallaConstructor;
    private InventarioMateriales inventarioMateriales;
    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/15;

    public ContenedorMaterialesConstructor(PantallaConstructor pantallaConstructor) {

        this.pantallaConstructor = pantallaConstructor;
        this.inventarioMateriales = pantallaConstructor.getInventarioCopiado();
        this.setAlignment(Pos.CENTER);
        this.setPrefSize(4,1);
        this.setHgap(10);

        Button botonMaderaItem = botonNuevo("MaderaItem", new MaderaMaterialInventario(), inventarioMateriales.cantidadMadera());
        this.add(botonMaderaItem,0,0);

        Button botonPiedraItem = botonNuevo("PiedraItem", new PiedraMaterialInventario(), inventarioMateriales.cantidadPiedra());
        this.add(botonPiedraItem,2,0);

        Button botonMetalItem = botonNuevo("MetalItem", new MetalMaterialInventario(), inventarioMateriales.cantidadMetal());
        this.add(botonMetalItem,1,0);
    }

    private Button botonNuevo(String stringMaterial, MaterialInventario materialInventario, Integer cantidad){
        ImageView vistaImagen = new ImageView(Imagenes.get(stringMaterial));

        String formaLetra = "-fx-font-size: "+TAMANIO/2.3+";-fx-font-weight: bold; -fx-text-fill: #F0F0F0";
        Text stringCantidadMaterial = new Text(cantidad.toString());
        stringCantidadMaterial.setFont(Font.font("monospace"));
        stringCantidadMaterial.setStyle(formaLetra);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(new ImageView(Imagenes.get("FondoCasillero")), vistaImagen, stringCantidadMaterial);
        stackPane.setAlignment(Pos.CENTER);
        StackPane.setAlignment(stringCantidadMaterial, Pos.BOTTOM_RIGHT);

        Button botonItem = new Button();
        botonItem.setGraphic(stackPane);
        botonItem.setPadding(new Insets(0,0,0,0));

        BotonSelecionarMaterialEventHandler botonEventHandler = new BotonSelecionarMaterialEventHandler(pantallaConstructor, inventarioMateriales, materialInventario);
        botonItem.setOnAction(botonEventHandler);

        return botonItem;
    }
}
