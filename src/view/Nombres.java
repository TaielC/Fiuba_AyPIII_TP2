package view;

import java.util.Hashtable;

public class Nombres {
    private static Hashtable<String, String> nombres = new Hashtable<>();

    static {
        nombres.put("algocraft.herramienta.Picoalgocraft.materialherramienta.MaderaMaterialHerramienta","pico de madera");
        nombres.put("algocraft.herramienta.Picoalgocraft.materialherramienta.PiedraMaterialHerramienta","pico de piedra.png");
        nombres.put("algocraft.herramienta.Picoalgocraft.materialherramienta.MetalMaterialHerramienta","pico de metal");
        nombres.put("algocraft.herramienta.Hachaalgocraft.materialherramienta.MaderaMaterialHerramienta","hacha de madera");
        nombres.put("algocraft.herramienta.Hachaalgocraft.materialherramienta.PiedraMaterialHerramienta","hacha de piedra");
        nombres.put("algocraft.herramienta.Hachaalgocraft.materialherramienta.MetalMaterialHerramienta","hacha de meta");
        nombres.put("algocraft.herramienta.PicoFinoalgocraft.materialherramienta.MaterialHerramientaNulo","pico fino");
        nombres.put("algocraft.herramienta.HerramientaNulaalgocraft.materialherramienta.MaterialHerramientaNulo","ninguna herramienta");
    }

    public static String get(String string) {
        return nombres.getOrDefault(string, "ninguna herramienta");
    }
}
