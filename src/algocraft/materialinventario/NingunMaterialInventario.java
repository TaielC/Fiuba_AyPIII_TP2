package algocraft.materialinventario;

public class NingunMaterialInventario implements MaterialInventario{

    @Override
    public boolean equals(MaterialInventario materialInventario) {
        return materialInventario instanceof NingunMaterialInventario;
    }

    @Override
    public boolean equals(MaderaMaterialInventario materialInventario) {
        return false;
    }

    @Override
    public boolean equals(PiedraMaterialInventario materialInventario) {
        return false;
    }

    @Override
    public boolean equals(MetalMaterialInventario materialInventario) {
        return false;
    }

    @Override
    public boolean equals(DiamanteMaterialInventario materialInventario) {
        return false;
    }
}
