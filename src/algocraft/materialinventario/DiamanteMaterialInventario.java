package algocraft.materialinventario;


public class DiamanteMaterialInventario implements MaterialInventario {

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
        return false;
    }

    @Override
    public boolean equals(DiamanteMaterialInventario material) {
        return true;
    }

    @Override
    public int hashCode(){ return "diamante".hashCode(); }
}