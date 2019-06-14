package algocraft.material;

public class MaterialHerramientaNada implements MaterialHerramienta {

    @Override
    public boolean equals(MaterialHerramienta material) {
        return material instanceof MaterialHerramientaNada;
    }

    @Override
    public boolean dania(Madera madera) {
        return false;
    }

    @Override
    public boolean dania(Piedra piedra) {
        return false;
    }

    @Override
    public boolean dania(Metal metal) {
        return false;
    }

    @Override
    public boolean dania(Diamante diamante) {
        return false;
    }
}
