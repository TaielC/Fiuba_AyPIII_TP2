package algocraft;

import algocraft.herramienta.*;
import algocraft.material.Madera;
import com.sun.jdi.Method;

import java.util.Hashtable;
import java.util.function.Supplier;

public class ConstructorHerramientas {

    private String[] tablero;
    private Hashtable<String, Supplier<Herramienta>> hashConstructor;

    private static ConstructorHerramientas instanciaConstructor = new ConstructorHerramientas();
    public static ConstructorHerramientas getInstance(){ return instanciaConstructor; }

    private ConstructorHerramientas() {
        tablero = new String[9];
        for(int i = 0; i < 9; i++){ tablero[i] = "Vacio"; }
        hashConstructor = inicializarHash();
    }

    private static Hashtable<String, Supplier<Herramienta>> inicializarHash(){
        Hashtable<String, Supplier<Herramienta>> hashConstructor = new Hashtable<>();
        hashConstructor.put("Madera,Madera,Madera,Vacio,Madera,Vacio,Vacio,Madera,Vacio", (()-> new Hacha(new Madera())));
        return hashConstructor;
    }

    public Supplier<Herramienta> agregar(Item item, int posicion){
        if(tablero[posicion] != "Vacio"){
            // Lanzar excepcion
        }
        tablero[posicion] = item.toString();
        return hashConstructor.get(String.join(",", tablero));
    }
}
