package view.constructor;

import algocraft.herramientafactory.HerramientaFactory;
import algocraft.herramientafactory.TableroConstruccionHerramienta;
import algocraft.herramienta.Herramienta;

import algocraft.herramienta.HerramientaNula;
import controller.constructor.BotonConstruirHerramientaEventHandler;
import controller.constructor.BotonPonerMaterialEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Screen;
import view.Imagenes;
import java.awt.font.ImageGraphicAttribute;
import java.io.File;


public class ContenedorConstructorHerramientas extends GridPane {


    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/17;

    public ContenedorConstructorHerramientas(PantallaConstructor pantallaConstructor) {

        TableroConstruccionHerramienta tablero = pantallaConstructor.getTablero();

        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(50, 50, 50, 50));
        this.setPrefSize(3,1);
        this.setVgap(20);
        this.setHgap(20);

        GridPane gridTablero = new GridPane();

        gridTablero.setAlignment(Pos.CENTER);
        gridTablero.setPrefSize(3,3);
        gridTablero.setGridLinesVisible(true);
        for(int x=0 ;x<3 ;x++) {
            for(int y=0; y<3; y++) {
                Button button = new Button();
                button.setMinSize(TAMANIO*1.2, TAMANIO*1.2);
                int posicion = y*3+x;
                Image imagen = Imagenes.get(tablero.get(posicion).getClass().getName());
                StackPane stackPane = new StackPane();
                stackPane.getChildren().addAll(new ImageView(Imagenes.get("FondoCasillero")), new ImageView(imagen));
                stackPane.setAlignment(Pos.CENTER);
                button.setGraphic(stackPane);
                BotonPonerMaterialEventHandler botonEventHandler = new BotonPonerMaterialEventHandler(pantallaConstructor,pantallaConstructor.getInventarioCopiado(),tablero,posicion);
                button.setOnAction(botonEventHandler);
                gridTablero.add(button,x,y);
            }
        }
        this.add(gridTablero,0, 0);

        this.add(new ImageView(Imagenes.get("FlechaConstructor")), 1, 0);

        VBox seccionConstruir = new VBox();
        seccionConstruir.setAlignment(Pos.CENTER);
        seccionConstruir.setSpacing(10);

        Button botonConstruir = new Button();
        botonConstruir.setPadding(new Insets(0,0,0,0));
        botonConstruir.setMinSize(TAMANIO*1.2, TAMANIO*1.2);
        Herramienta herramienta = HerramientaFactory.obtenerHerramienta(tablero);
        if(herramienta.getClass().getName()+herramienta.material().getClass().getName() == "algocraft.herramienta.Picoalgocraft.materialherramienta.MetalMaterialHerramienta"){
            throw new RuntimeException();
        }
        Image imagenHerramienta = Imagenes.get(herramienta.getClass().getName()+herramienta.material().getClass().getName());

        String musicFile = "sonidos/nuevaHerramienta.mp3";
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer sonido = new MediaPlayer(sound);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(new ImageView(Imagenes.get("FondoCasillero")), new ImageView(imagenHerramienta));
        stackPane.setAlignment(Pos.CENTER);
        botonConstruir.setGraphic(stackPane);
        botonConstruir.setOnAction(new BotonConstruirHerramientaEventHandler(pantallaConstructor, herramienta, sonido));

        Image construccionCorrecta = Imagenes.get("ConstruccionCorrecta");
        if(herramienta instanceof HerramientaNula){
            botonConstruir.setDisable(true);
            construccionCorrecta = Imagenes.get("ConstruccionIncorrecta");
        }
        botonConstruir.setOnAction(new BotonConstruirHerramientaEventHandler(pantallaConstructor, herramienta, sonido));
        seccionConstruir.getChildren().addAll(botonConstruir, new ImageView(construccionCorrecta));

        this.add(seccionConstruir, 2, 0);
    }
}
