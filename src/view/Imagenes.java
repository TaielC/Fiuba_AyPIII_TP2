package view;

import javafx.scene.image.Image;
import javafx.stage.Screen;

import java.util.Hashtable;

public class Imagenes {

    private static Hashtable<String, Image> imagenes = new Hashtable<>();
    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/17;

    static{
        imagenes.put("LogoInicio", new Image("file:imagenes/LogoInicio.png"));
        imagenes.put("FondoMenu", new Image("file:imagenes/FondoMenu.png", 150, 150, false, false));
        imagenes.put("FondoJuego", new Image("file:imagenes/FondoJuego.png"));
        imagenes.put("algocraft.juego.Jugador", new Image("file:imagenes/Jugador.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.materialmineral.MaderaMineral", new Image("file:imagenes/Minerales/Madera.png",TAMANIO,TAMANIO,false,false));
        imagenes.put("algocraft.materialmineral.PiedraMineral", new Image("file:imagenes/Minerales/Piedra.png",TAMANIO,TAMANIO,false,false));
        imagenes.put("algocraft.materialmineral.MetalMineral", new Image("file:imagenes/Minerales/Metal.png",TAMANIO,TAMANIO,false,false));
        imagenes.put("algocraft.materialmineral.DiamanteMineral", new Image("file:imagenes/Minerales/Diamante.png",TAMANIO,TAMANIO,false,false));
        imagenes.put("algocraft.materialmineral.NingunMaterialMineral", new Image("file:imagenes/Minerales/Ningun.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("MaderaItem", new Image("file:imagenes/Item/MaderaItem.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("MetalItem", new Image("file:imagenes/Item/MetalItem.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("PiedraItem", new Image("file:imagenes/Item/PiedraItem.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("DiamanteItem", new Image("file:imagenes/Item/DiamanteItem.png", TAMANIO, TAMANIO, false, false));
    }

    public static Image get(String string) {
        return imagenes.getOrDefault(string, null);
    }
}
