package view;

import algocraft.constructorherramienta.ConstructorHerramientas;
import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.constructorherramienta.template.PicoMaderaTemplateConstruccionHerramienta;
import algocraft.herramienta.Herramienta;
import algocraft.inventario.InventarioMateriales;
import algocraft.juego.Juego;
import algocraft.juego.Jugador;

import controller.juego.BotonPonerMaterialEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;

import javafx.scene.paint.Color;
import javafx.stage.Screen;


public class ContenedorConstructorHerramientas extends GridPane {


    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/17;

    public ContenedorConstructorHerramientas(PantallaConstructor pantallaConstructor,Juego juego, TableroConstruccionHerramienta tablero) {
        Jugador jugador = juego.getJugador();
        InventarioMateriales inventarioMateriales = jugador.getInventarioMateriales();

        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(50, 50, 50, 50));
        this.setPrefSize(3,1);
        this.setVgap(20);
        this.setHgap(20);
        this.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        GridPane paneTablero = new GridPane();

        paneTablero.setAlignment(Pos.CENTER);
        paneTablero.setPrefSize(3,3);
        paneTablero.setGridLinesVisible(true);
        for(int x=0 ;x<3 ;x++) {
            for(int y=0; y<3; y++) {
                Button button = new Button();
                button.setMinSize(TAMANIO, TAMANIO);
                int posicion = x*3+y;
                Image imagen = Imagenes.get(tablero.get(posicion).getClass().getName());
                button.setGraphic(new ImageView(imagen));
                BotonPonerMaterialEventHandler botonEventHandler = new BotonPonerMaterialEventHandler(pantallaConstructor,inventarioMateriales,tablero,posicion);
                button.setOnAction(botonEventHandler);
                paneTablero.add(button,x,y);
            }
        }
        this.add(paneTablero,0, 0);

        this.add(new ImageView(Imagenes.get("FlechaConstructor")), 1, 0);

        Button botonConstruir = new Button();
        botonConstruir.setMinSize(TAMANIO, TAMANIO);
        Herramienta herramienta = ConstructorHerramientas.obtenerHerramienta(tablero);
        if(tablero.equals((new PicoMaderaTemplateConstruccionHerramienta()).getTemplate())){
            throw new RuntimeException("hello");
        }
        Image imagenHerramienta = Imagenes.get(herramienta.getClass().getName());
        botonConstruir.setGraphic(new ImageView(imagenHerramienta));
        this.add(botonConstruir, 2, 0);
    }
}
