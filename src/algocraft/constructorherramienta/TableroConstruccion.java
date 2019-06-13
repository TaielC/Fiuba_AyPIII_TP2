package algocraft.constructorherramienta;

import algocraft.juego.Item;
import algocraft.juego.ItemVacio;

public class TableroConstruccion {

    private Item[] tablero;

    public TableroConstruccion(int tamanio) {
        tablero = new Item[tamanio];
        for(int i = 0; i < tablero.length; i++){ tablero[i] = new ItemVacio(); }
    }

    public Item get(int posicion) {
        Item item = tablero[posicion];
        tablero[posicion] = new ItemVacio();
        return item;
    }

    public void put(int posicion, Item item) {
        if(!estaVacioEn(posicion)) {
            // LanzarExcepcion.
        }
        tablero[posicion] = item;
    }

    public boolean estaVacioEn(int posicion) {
        return (tablero[posicion] instanceof ItemVacio);
    }

    @Override
    public String toString() {
        StringBuilder tableroString = new StringBuilder();
        for(int i = 0; i < tablero.length-1; i++) {
            tableroString.append(tablero[i].toString());
            tableroString.append(",");
        }
        tableroString.append(tablero[tablero.length-1].toString());
        return tableroString.toString();
    }
}
