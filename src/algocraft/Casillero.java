package algocraft;



public class Casillero {
    private int x ;
    private int y;
    private Item obtenido = null;


    public Casillero(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void poner(Item item){
        this.obtenido = item;

    }

    public boolean estaVacio(){
        if(obtenido != null){
            return true;

        }
        else{
            return false;
        }
    }
    public int posicionHorizontal(){
        return x;
    }

    public int posicionVertical(){
        return y;
    }

    public Item obtenido(){
        return obtenido;
    }


}
