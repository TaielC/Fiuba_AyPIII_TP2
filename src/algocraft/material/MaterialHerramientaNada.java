package algocraft.material;

public class MaterialHerramientaNada implements MaterialHerramienta {

    @Override
    public boolean equals(MaterialHerramienta material) {
        return material instanceof MaterialHerramientaNada;
    }

    @Override
    public boolean daniaA(Madera madera) {
        return false;
    }

    @Override
    public boolean daniaA(Piedra piedra) {
        return false;
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
