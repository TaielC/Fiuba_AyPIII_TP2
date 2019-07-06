package view;

import javafx.scene.image.Image;
import javafx.stage.Screen;

import java.util.Hashtable;

public class Imagenes {

    private static Hashtable<String, Image> imagenes = new Hashtable<>();
    private static final double TAMANIO = Screen.getPrimary().getVisualBounds().getHeight()/17;

    static {
        // Extras
        imagenes.put("FondoCasillero", new Image("file:imagenes/FondoCasillero.png", TAMANIO*1.3, TAMANIO*1.3, false, false));
        imagenes.put("FondoHerramientaEquipada", new Image("file:imagenes/CasilleroHerramientaEquipada.png", TAMANIO*1.3, TAMANIO*1.3, false, false));
        imagenes.put("FondoMenuEmergente", new Image("file:imagenes/FondoMenuEmergente.png"));
        imagenes.put("FondoMenuDerecha", new Image("file:imagenes/FondoMenuDerecha.png", Screen.getPrimary().getVisualBounds().getHeight(), TAMANIO*1.5, false, false));
        imagenes.put("FondoMenuIzquierda", new Image("file:imagenes/FondoMenuIzquierda.png", Screen.getPrimary().getVisualBounds().getHeight(), TAMANIO*1.5, false, false));

        imagenes.put("BotonMenuPausa", new Image("file:imagenes/BotonPausaJuego.png", TAMANIO*1.3, TAMANIO*1.3, false, false));
        imagenes.put("BotonAyuda", new Image("file:imagenes/BotonAyudaJuego.png", TAMANIO*1.3, TAMANIO*1.3, false, false));

        // MenuPrincipal
        imagenes.put("BotonMenuPrincipal", new Image("file:imagenes/Boton.png", TAMANIO*10, TAMANIO*3, true, true));
        imagenes.put("LogoInicio", new Image("file:imagenes/LogoInicio.png"));
        imagenes.put("FondoMenuPrincipal", new Image("file:imagenes/FondoMenuPrincipal.png", 150, 150, false, false));

        // TableroJuego
        imagenes.put("FondoJuego", new Image("file:imagenes/FondoJuego.png", TAMANIO/3, TAMANIO/3, false, false));
        imagenes.put("algocraft.juego.Jugador", new Image("file:imagenes/Jugador.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.materialmineral.MaderaMineral", new Image("file:imagenes/Minerales/Madera.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.materialmineral.PiedraMineral", new Image("file:imagenes/Minerales/Piedra.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.materialmineral.MetalMineral", new Image("file:imagenes/Minerales/Metal.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.materialmineral.DiamanteMineral", new Image("file:imagenes/Minerales/Diamante.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.materialmineral.MaterialMineralNulo", new Image("file:imagenes/Minerales/Ningun.png", TAMANIO, TAMANIO, false, false));

        // Herramientas
        imagenes.put("algocraft.herramienta.Picoalgocraft.materialherramienta.MaderaMaterialHerramienta",
                new Image("file:imagenes/Herramientas/PicoDeMadera.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.herramienta.Picoalgocraft.materialherramienta.PiedraMaterialHerramienta",
                new Image("file:imagenes/Herramientas/PicoDePiedra.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.herramienta.Picoalgocraft.materialherramienta.MetalMaterialHerramienta",
                new Image("file:imagenes/Herramientas/PicoDeMetal.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.herramienta.Hachaalgocraft.materialherramienta.MaderaMaterialHerramienta",
                new Image("file:imagenes/Herramientas/HachaDeMadera.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.herramienta.Hachaalgocraft.materialherramienta.PiedraMaterialHerramienta",
                new Image("file:imagenes/Herramientas/HachaDePiedra.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.herramienta.Hachaalgocraft.materialherramienta.MetalMaterialHerramienta",
                new Image("file:imagenes/Herramientas/HachaDeMeta.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.herramienta.PicoFinoalgocraft.materialherramienta.MaterialHerramientaNulo",
                new Image("file:imagenes/Herramientas/PicoFino.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.herramienta.HerramientaNulaalgocraft.materialherramienta.MaterialHerramientaNulo",
                new Image("file:imagenes/Null.png", TAMANIO, TAMANIO, false, false));

        // Constructor
        imagenes.put("HerramientaFactory", new Image("file:imagenes/Constructor.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("FlechaConstructor", new Image("file:imagenes/FlechaConstructor.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("EliminarMaterial", new Image("file:imagenes/EliminarMaterial.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("ConstruccionCorrecta", new Image("file:imagenes/ConstruccionCorrecta.png", TAMANIO, TAMANIO/1.5, false, true));
        imagenes.put("ConstruccionIncorrecta", new Image("file:imagenes/ConstruccionIncorrecta.png", TAMANIO, TAMANIO/1.5, false, true));

        //inventario
        imagenes.put("MaderaItem", new Image("file:imagenes/Item/MaderaItem.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("MetalItem", new Image("file:imagenes/Item/MetalItem.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("PiedraItem", new Image("file:imagenes/Item/PiedraItem.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("DiamanteItem", new Image("file:imagenes/Item/DiamanteItem.png", TAMANIO, TAMANIO, false, false));

        imagenes.put("algocraft.materialinventario.MaderaMaterialInventario", new Image("file:imagenes/Item/MaderaItem.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.materialinventario.PiedraMaterialInventario", new Image("file:imagenes/Item/PiedraItem.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.materialinventario.MetalMaterialInventario", new Image("file:imagenes/Item/MetalItem.png", TAMANIO, TAMANIO, false, false));
        imagenes.put("algocraft.materialinventario.MaterialInventarioNulo", new Image("file:imagenes/Null.png", TAMANIO, TAMANIO, false, false));
    }


    public static Image get(String string) {
        return imagenes.getOrDefault(string, null);
    }
}
