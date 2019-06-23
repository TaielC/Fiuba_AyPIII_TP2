package algocraft.materialinventario;


public class MaderaMaterialInventario implements MaterialInventario {

    @Override
    public boolean equals(MaterialInventario material) {
        return material.equals(this);
    }

    @Override
    public boolean equals(MaderaMaterialInventario material) {
        return true;
    }

    @Override
    public boolean equals(PiedraMaterialInventario material) {
        return false;
    }

    @Override
    public boolean equals(MetalMaterialInventario material) {
        return false;
    }

    @Override
    public boolean equals(DiamanteMaterialInventario material) {
        return false;
    }
}