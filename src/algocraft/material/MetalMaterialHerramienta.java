package algocraft.material;

public class MetalMaterialHerramienta implements MaterialHerramienta {
    @Override
    public boolean equals(MaterialHerramienta material) {
        return material instanceof MetalMaterialHerramienta;
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
        return false;
    }

    @Override
    public boolean dania(Diamante diamante) {
        return false;
    }
}
