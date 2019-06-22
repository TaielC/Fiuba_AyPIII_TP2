package View;
import javafx.scene.control.TextField;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javax.swing.text.Element;

import Controller.BotonSalirEventHandler;
import javafx.scene.image.ImageView;


public class ConstructorDeHerramientas {
	
	public ConstructorDeHerramientas(GridPane PanelConstructorHerramientas) {
		this.graficar(PanelConstructorHerramientas);
	}
	
	private void graficar(GridPane PanelConstructorHerramientas) {
		
		
		for(int filas=0;filas<3;filas++) {
			for(int columnas=0;columnas<3;columnas++) {
				PanelConstructorHerramientas.add(new TextField(),filas,columnas);
				
			}
		}
		
		Button boton = new Button("Obtener");
		Button botonSalir = new Button("Salir");
	

		PanelConstructorHerramientas.add(botonSalir,1,3);
		PanelConstructorHerramientas.add(boton,2,3);
        PanelConstructorHerramientas.setVgap(1);
        PanelConstructorHerramientas.setHgap(4);
	
		
	}

}
