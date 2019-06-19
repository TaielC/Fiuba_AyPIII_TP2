package algocraft.juego;

public class ObjetoAire implements ObjetoUbicable {
    private Posicion posicion;
    @Override
    public Posicion getPosicion() {
        return posicion;
    }

    @Override
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
