package algocraft.materialinventario;


public class MetalMaterialInventario implements MaterialInventario {

    @Override
    public boolean equals(MaterialInventario material) {
        return material.equals(this);
    }

    @Override
    public boolean equals(MaderaMaterialInventario material) {
        return false;
    }

    @Override
    public boolean equals(PiedraMaterialInventario material) {
        return false;
    }

    @Override
    public boolean equals(MetalMaterialInventario material) {
        return true;
    }

    @Override
    public boolean equals(DiamanteMaterialInventario material) {
        return false;
    }
}