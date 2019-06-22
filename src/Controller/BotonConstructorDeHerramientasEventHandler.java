package Controller;

import javafx.event.ActionEvent;
import javafx.scene.layout.*;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import com.sun.javafx.scene.SceneEventDispatcher;

import View.ConstructorDeHerramientas;
import javafx.scene.*;
import javafx.stage.*;

public class BotonConstructorDeHerramientasEventHandler implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent actionEvent) {
		
		Stage stage = new Stage();
		
		stage.setTitle("Mesa de Crafteo");
		
		GridPane PanelConstructorDeHerramientas = new GridPane();
		ConstructorDeHerramientas constructorHerramientas = new ConstructorDeHerramientas(PanelConstructorDeHerramientas);
		
		Scene scene = new Scene(PanelConstructorDeHerramientas,200,200);
		
		stage.setScene(scene);
		
		stage.getIcons().add(new Image("file:imagenes/MesaDeCrafteo.png"));
		
		
		stage.show();

		
		
	}

}
