package algocraft.constructorherramienta;

import algocraft.juego.Item;
import algocraft.juego.ItemVacio;
import algocraft.herramienta.*;
import algocraft.material.*;

import java.util.Hashtable;
import java.util.function.Supplier;

public class ConstructorHerramienta {

    private static final String StringConstruccionHachaMadera1 =
            "Madera,Madera,Vacio," +
            "Madera,Madera,Vacio," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionHachaMadera2 =
            "Vacio,Madera,Madera," +
            "Vacio,Madera,Madera," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionHachaPiedra1 =
            "Piedra,Piedra,Vacio," +
            "Piedra,Madera,Vacio," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionHachaPiedra2 =
            "Vacio,Piedra,Piedra," +
            "Vacio,Madera,Piedra," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionHachaMetal1 =
            "Metal,Metal,Vacio," +
            "Metal,Madera,Vacio," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionHachaMetal2 =
            "Vacio,Metal,Metal," +
            "Vacio,Madera,Metal," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionPicoMadera =
            "Madera,Madera,Madera," +
            "Vacio,Madera,Vacio," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionPicoPiedra =
            "Piedra,Piedra,Piedra," +
            "Vacio,Madera,Vacio," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionPicoMetal =
            "Metal,Metal,Metal," +
            "Vacio,Madera,Vacio," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionPicoFino1 =
            "Metal,Metal,Metal," +
            "Piedra,Madera,Vacio," +
            "Vacio,Madera,Vacio";
    private static final String StringConstruccionPicoFino2 =
            "Metal,Metal,Metal," +
            "Vacio,Madera,Piedra," +
            "Vacio,Madera,Vacio";

    private TableroConstruccion tablero;
    private Hashtable<String, Supplier<Item>> hashConstructor;
    private Item itemConstruido;

    private static ConstructorHerramienta instanciaConstructor = new ConstructorHerramienta();
    public static ConstructorHerramienta getInstance(){ return instanciaConstructor; }

    public ConstructorHerramienta reset(){
        instanciaConstructor = new ConstructorHerramienta();
        return instanciaConstructor;
    }

    private ConstructorHerramienta() {
        tablero = new TableroConstruccion(9);
        itemConstruido = new ItemVacio();
        hashConstructor = inicializarHash();
    }

    private Hashtable<String, Supplier<Item>> inicializarHash() {
        Hashtable<String, Supplier<Item>> hashConstructor = new Hashtable<>();
        hashConstructor.put(StringConstruccionHachaMadera1, (()-> new Hacha(new Madera())));
        hashConstructor.put(StringConstruccionHachaMadera2, (()-> new Hacha(new Madera())));
        hashConstructor.put(StringConstruccionHachaPiedra1, (()-> new Hacha(new Piedra())));
        hashConstructor.put(StringConstruccionHachaPiedra2, (()-> new Hacha(new Piedra())));
        hashConstructor.put(StringConstruccionHachaMetal1, (()-> new Hacha(new Metal())));
        hashConstructor.put(StringConstruccionHachaMetal2, (()-> new Hacha(new Metal())));
        hashConstructor.put(StringConstruccionPicoMadera, (()-> new Pico(new Madera())));
        hashConstructor.put(StringConstruccionPicoPiedra, (()-> new Pico(new Piedra())));
        hashConstructor.put(StringConstruccionPicoMetal, (()-> new Pico(new Metal())));
        hashConstructor.put(StringConstruccionPicoFino1, PicoFino::new);
        hashConstructor.put(StringConstruccionPicoFino2, PicoFino::new);
        return hashConstructor;
    }

    public void agregar(Item item, int posicion){
        tablero.put(posicion, item);
        String tableroString = tablero.toString();
        itemConstruido = hashConstructor.getOrDefault(tableroString, ItemVacio::new).get();
    }

    public Item obtener(int posicion) {
        Item item = tablero.get(posicion);
        return item;
    }

    public Item obtenerItemConstruido() {
        return itemConstruido;
    }
}
