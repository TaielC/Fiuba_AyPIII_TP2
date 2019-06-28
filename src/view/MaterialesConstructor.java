package view;

import algocraft.inventario.InventarioMateriales;
import algocraft.materialinventario.*;
import controller.juego.BotonPonerMaterialEventHandler;
import controller.juego.BotonSelecionarMaterialEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class MaterialesConstructor extends GridPane {

    

    public MaterialesConstructor(PantallaConstructor pantallaConstructor,InventarioMateriales inventarioMateriales) {

        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(50, 50, 50, 50));
        this.setPrefSize(3,1);
        this.setHgap(10);
        this.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));


        Button botonMaderaItem = new Button();
        botonMaderaItem.setGraphic(new ImageView(Imagenes.get("MaderaItem")));
        botonMaderaItem.setPadding(new Insets(0,0,0,0));
        BotonSelecionarMaterialEventHandler botonEventHandler1 = new BotonSelecionarMaterialEventHandler(pantallaConstructor, new MaderaMaterialInventario());
        botonMaderaItem.setOnAction(botonEventHandler1);
        this.add(botonMaderaItem,0,0);

        Button botonMetalItem = new Button();
        botonMetalItem.setGraphic(new ImageView(Imagenes.get("MetalItem")));
        botonMetalItem.setPadding(new Insets(0,0,0,0));
        BotonSelecionarMaterialEventHandler botonEventHandler2 = new BotonSelecionarMaterialEventHandler(pantallaConstructor, new MetalMaterialInventario());
        botonMaderaItem.setOnAction(botonEventHandler2);
        this.add(botonMetalItem,1,0);

        Button botonPiedraItem = new Button();
        botonPiedraItem.setGraphic(new ImageView(Imagenes.get("PiedraItem")));
        botonPiedraItem.setPadding(new Insets(0,0,0,0));
        BotonSelecionarMaterialEventHandler botonEventHandler3 = new BotonSelecionarMaterialEventHandler(pantallaConstructor, new PiedraMaterialInventario());
        botonMaderaItem.setOnAction(botonEventHandler3);
        this.add(botonPiedraItem,2,0);
    }
}
