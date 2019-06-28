package algocraft.constructorherramienta;

import algocraft.excepciones.PosicionDeTableroConstruccionHerramientaInvalidaException;
import algocraft.materialinventario.MaterialInventario;
import algocraft.materialinventario.NingunMaterialInventario;

public class TableroConstruccionHerramienta {

    protected MaterialInventario[] tablero;

    public TableroConstruccionHerramienta() {
        tablero = new MaterialInventario[9];
        for(int i = 0; i < tablero.length; i++){ tablero[i] = new NingunMaterialInventario(); }
    }

    public void putSuperiorIzquierda(MaterialInventario material){ tablero[0] = material; }
    public void putSuperior(MaterialInventario material){ tablero[1] = material; }
    public void putSuperiorDerecha(MaterialInventario material){ tablero[2] = material; }
    public void putIzquierda(MaterialInventario material){ tablero[3] = material; }
    public void putCentro(MaterialInventario material){ tablero[4] = material; }
    public void putDerecha(MaterialInventario material){ tablero[5] = material; }
    public void putInferiorIzquierda(MaterialInventario material){ tablero[6] = material; }
    public void putInferior(MaterialInventario material){ tablero[7] = material; }
    public void putInferiorDerecha(MaterialInventario material){ tablero[8] = material; }

    public MaterialInventario getSuperiorIzquierda(){ return tablero[0]; }
    public MaterialInventario getSuperior(){ return tablero[1]; }
    public MaterialInventario getSuperiorDerecha(){ return tablero[2]; }
    public MaterialInventario getIzquierda(){ return tablero[3]; }
    public MaterialInventario getCentro(){ return tablero[4]; }
    public MaterialInventario getDerecha(){ return tablero[5]; }
    public MaterialInventario getInferiorIzquierda(){ return tablero[6]; }
    public MaterialInventario getInferior(){ return tablero[7]; }
    public MaterialInventario getInferiorDerecha(){ return tablero[8]; }

    public MaterialInventario get(int posicion){
        try {
            return tablero[posicion];
        } catch (IndexOutOfBoundsException e){
            throw new PosicionDeTableroConstruccionHerramientaInvalidaException();
        }
    }

    public void ponerMaterial(int posicion, MaterialInventario materialInventario){
        tablero[posicion]  = materialInventario;
    }

    private boolean equalsEspejado(TableroConstruccionHerramienta otroTablero){
        boolean iguales;
        iguales = (tablero[0].equals(otroTablero.get(2)));
        iguales &= (tablero[1].equals(otroTablero.get(1)));
        iguales &= (tablero[2].equals(otroTablero.get(0)));
        iguales &= (tablero[3].equals(otroTablero.get(5)));
        iguales &= (tablero[4].equals(otroTablero.get(4)));
        iguales &= (tablero[5].equals(otroTablero.get(3)));
        iguales &= (tablero[6].equals(otroTablero.get(8)));
        iguales &= (tablero[7].equals(otroTablero.get(7)));
        iguales &= (tablero[8].equals(otroTablero.get(6)));
        return iguales;
    }

    public boolean equals(TableroConstruccionHerramienta otroTablero){
        for(int i = 0; i < 9; i ++){
            if(!(tablero[i].equals(otroTablero.get(i)))) {
                return equalsEspejado(otroTablero);
            }
        }
        return true;
    }
    public MaterialInventario[] getTablero(){
        return this.tablero;
    }
}
