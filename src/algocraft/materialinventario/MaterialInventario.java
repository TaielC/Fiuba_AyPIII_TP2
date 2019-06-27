package algocraft.materialinventario;

public interface MaterialInventario {

    boolean equals(MaterialInventario materialInventario);
    boolean equals(MaderaMaterialInventario materialInventario);
    boolean equals(PiedraMaterialInventario materialInventario);
    boolean equals(MetalMaterialInventario materialInventario);
    boolean equals(DiamanteMaterialInventario materialInventario);

    @Override
    int hashCode();
}
