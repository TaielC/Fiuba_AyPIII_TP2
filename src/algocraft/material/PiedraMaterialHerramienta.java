package algocraft.material;

public class PiedraMaterialHerramienta implements MaterialHerramienta {

    @Override
    public boolean equals(MaterialHerramienta material) {
        return material instanceof PiedraMaterialHerramienta;
    }

    @Override
    public boolean dania(Madera madera) {
        return true;
    }

    @Override
    public boolean dania(Piedra piedra) {
        return true;
    }

    @Override
    public boolean dania(Metal metal) {
        return true;
    }

    @Override
    public boolean dania(Diamante diamante) {
        return false;
    }
}
