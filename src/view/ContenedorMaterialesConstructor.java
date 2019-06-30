package view;

import algocraft.inventario.InventarioMateriales;
import algocraft.materialinventario.*;
import controller.juego.BotonSelecionarMaterialEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ContenedorMaterialesConstructor extends GridPane {

    private PantallaConstructor pantallaConstructor;
    private InventarioMateriales inventarioMateriales;
    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/15;

    public ContenedorMaterialesConstructor(PantallaConstructor pantallaConstructor, InventarioMateriales inventarioMateriales) {

        this.pantallaConstructor = pantallaConstructor;
        this.inventarioMateriales = inventarioMateriales;
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(50, 50, 50, 50));
        this.setPrefSize(3,1);
        this.setHgap(10);
        this.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, new Insets(5, 5, 5, 5))));

        Button botonMaderaItem = botonNuevo("MaderaItem", new MaderaMaterialInventario(), inventarioMateriales.cantidadMadera());
        this.add(botonMaderaItem,0,0);

        Button botonMetalItem = botonNuevo("MetalItem", new MetalMaterialInventario(), inventarioMateriales.cantidadMetal());
        this.add(botonMetalItem,1,0);

        Button botonPiedraItem = botonNuevo("PiedraItem", new PiedraMaterialInventario(), inventarioMateriales.cantidadPiedra());
        this.add(botonPiedraItem,2,0);
    }

    private Button botonNuevo(String stringMaterial, MaterialInventario materialInventario, Integer cantidad){
        ImageView vistaImagen = new ImageView(Imagenes.get(stringMaterial));
        StackPane stackPane = new StackPane();

        String formaLetra = "-fx-font-size: "+TAMANIO/3+";-fx-font-weight: bold; -fx-text-fill: #050505";
        Text stringCantidadMaterial = new Text(cantidad.toString());
        stringCantidadMaterial.setFont(Font.font("monospace"));
        stringCantidadMaterial.setStyle(formaLetra);

        stackPane.getChildren().addAll(vistaImagen, stringCantidadMaterial);
        stackPane.setAlignment(Pos.BOTTOM_LEFT);

        Button botonItem = new Button();
        botonItem.setGraphic(stackPane);
        botonItem.setPadding(new Insets(0,0,0,0));

        BotonSelecionarMaterialEventHandler botonEventHandler = new BotonSelecionarMaterialEventHandler(pantallaConstructor, inventarioMateriales, materialInventario);
        botonItem.setOnAction(botonEventHandler);

        return botonItem;
    }
}
