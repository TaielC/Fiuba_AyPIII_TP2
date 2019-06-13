package algocraft;

import algocraft.material.*;


public class Casillero {
    private int x ;
    private int y;
    private ObjetoUbicable obtenido = null;
    


    public Casillero(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void poner(ObjetoUbicable item){
    	if (this.estaVacio()==true) {
    		this.obtenido = item;
       }
    	
    }

    public boolean estaVacio(){
        if(obtenido != null){
            return false;

        }
        else{
            return true;
        }
    }
    public int posicionHorizontal(){
        return x;
    }

    public int posicionVertical(){
        return y;
    }

    public ObjetoUbicable obtenido(){
        return obtenido;
    }


}

