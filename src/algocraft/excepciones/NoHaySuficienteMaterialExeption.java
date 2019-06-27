package algocraft.excepciones;

import algocraft.materialinventario.MaterialInventario;

public class NoHaySuficienteMaterialExeption extends RuntimeException {
    public NoHaySuficienteMaterialExeption(MaterialInventario material) {
        super(material.getClass().getName());
    }
}
