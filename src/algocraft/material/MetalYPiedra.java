package algocraft.material;

public class MetalYPiedra implements MaterialDaniable, MaterialItem {

    @Override
    public boolean esDaniadoPor(MaterialDaniable material) {
        return material.dania(this);
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
    public boolean dania(MetalYPiedra metalYPiedra) {
        return true;
    }

    @Override
    public boolean dania(Diamante diamante) {
        return true;
    }

    @Override
    public MaterialDaniable getComoDaniable() {
        return this;
    }
}
