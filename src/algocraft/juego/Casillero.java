package algocraft.juego;


public class Casillero {

    private Posicion posicion;
    private ObjetoUbicable obtenido = null;


    public Casillero(Posicion posicion){
        this.posicion = posicion;
    }

    public void agregar(ObjetoUbicable item){
        if (this.estaVacio()) {
            this.obtenido = item;
            item.setPosicion(this.posicion);
        }
    }

    public boolean estaVacio(){
        return obtenido == null;
    }

    public ObjetoUbicable obtenido(){
        return obtenido;
    }
}
