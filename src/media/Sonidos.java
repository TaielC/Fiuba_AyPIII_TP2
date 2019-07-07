package media;

import javafx.scene.media.Media;

import java.io.File;
import java.util.Hashtable;

public class Sonidos {

    private static Hashtable<String, File> sonidos = new Hashtable<>();

    static {
        sonidos.put("golpeNoMadera", new File("src/media/sonidos/golpeNoMadera.mp3"));
        sonidos.put("golpeMadera", new File("src/media/sonidos/golpeMadera.mp3"));
        sonidos.put("nuevaHerramienta", new File("src/media/sonidos/nuevaHerramienta.mp3"));
        sonidos.put("boton", new File("src/media/sonidos/botonClick.mp3"));
        sonidos.put("materialObtenido", new File("src/media/sonidos/materialObtenido.mp3"));
    }


    public static Media get(String string){ return new Media(sonidos.get(string).toURI().toString()); }

}
