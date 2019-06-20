package algocraft.herramienta.constructor;


import algocraft.excepciones.PosicionDeTableroConstruccionHerramientaInvalidaException;
import algocraft.herramienta.material.MaterialHerramienta;
import algocraft.herramienta.material.NingunMaterialHerramienta;

public class TableroConstruccionHerramienta {

    protected MaterialHerramienta[] tablero;

    public TableroConstruccionHerramienta() {
        tablero = new MaterialHerramienta[9];
        for(int i = 0; i < tablero.length; i++){ tablero[i] = new NingunMaterialHerramienta(); }
    }

    public void putSuperiorIzquierda(MaterialHerramienta material){ tablero[0] = material; }
    public void putSuperior(MaterialHerramienta material){ tablero[1] = material; }
    public void putSuperiorDerecha(MaterialHerramienta material){ tablero[2] = material; }
    public void putIzquierda(MaterialHerramienta material){ tablero[3] = material; }
    public void putCentro(MaterialHerramienta material){ tablero[4] = material; }
    public void putDerecha(MaterialHerramienta material){ tablero[5] = material; }
    public void putInferiorIzquierda(MaterialHerramienta material){ tablero[6] = material; }
    public void putInferior(MaterialHerramienta material){ tablero[7] = material; }
    public void putInferiorDerecha(MaterialHerramienta material){ tablero[8] = material; }

    public MaterialHerramienta getSuperiorIzquierda(){ return tablero[0]; }
    public MaterialHerramienta getSuperior(){ return tablero[1]; }
    public MaterialHerramienta getSuperiorDerecha(){ return tablero[2]; }
    public MaterialHerramienta getIzquierda(){ return tablero[3]; }
    public MaterialHerramienta getCentro(){ return tablero[4]; }
    public MaterialHerramienta getDerecha(){ return tablero[5]; }
    public MaterialHerramienta getInferiorIzquierda(){ return tablero[6]; }
    public MaterialHerramienta getInferior(){ return tablero[7]; }
    public MaterialHerramienta getInferiorDerecha(){ return tablero[8]; }

    protected MaterialHerramienta get(int posicion){
        try {
            return tablero[posicion];
        } catch (IndexOutOfBoundsException e){
            throw new PosicionDeTableroConstruccionHerramientaInvalidaException();
        }
    }

    public boolean equals(TableroConstruccionHerramienta otroTablero){
        for(int i = 0; i < 9; i ++){
            if(!(tablero[i].equals(otroTablero.get(i)))) {
                return false;
            }
        }
        return true;
    }
}
