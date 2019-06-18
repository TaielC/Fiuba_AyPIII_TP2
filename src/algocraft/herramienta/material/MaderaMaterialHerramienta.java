package algocraft.material;

public class MaderaMaterialHerramienta implements MaterialHerramienta {

    @Override
    public boolean equals(MaterialHerramienta material) {
        return material instanceof MaderaMaterialHerramienta;
    }

    @Override
    public boolean daniaA(Madera madera) {
        return true;
    }

    @Override
    public boolean daniaA(Piedra piedra) {
        return true;
    }

    @Override
    public boolean daniaA(Metal metal) {
        return false;
    }

    @Override
    public boolean daniaA(Diamante diamante) {
        return false;
    }
}
