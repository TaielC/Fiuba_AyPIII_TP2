package materialtest;

import algocraft.materialinventario.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaterialInventarioTest {

    @Test
    public void test01NingunMaterialInventarioEsDiferenteAlRestoDeLosMaterialesInventarioExceptoSiMismo() {
        MaterialInventario ningunMaterial = new NingunMaterialInventario();
        MaterialInventario madera = new MaderaMaterialInventario();
        MaterialInventario piedra = new PiedraMaterialInventario();
        MaterialInventario metal = new MetalMaterialInventario();
        MaterialInventario diamante = new DiamanteMaterialInventario();

        assertFalse(ningunMaterial.equals(madera));
        assertFalse(ningunMaterial.equals(piedra));
        assertFalse(ningunMaterial.equals(metal));
        assertFalse(ningunMaterial.equals(diamante));
        assertTrue(ningunMaterial.equals(new NingunMaterialInventario()));
    }

    @Test
    public void test02MaderaMaterialInventarioEsSolamenteIgualAOtraMaderaMaterialInventario() {
        MaterialInventario ningunMaterial = new NingunMaterialInventario();
        MaterialInventario madera = new MaderaMaterialInventario();
        MaterialInventario piedra = new PiedraMaterialInventario();
        MaterialInventario metal = new MetalMaterialInventario();
        MaterialInventario diamante = new DiamanteMaterialInventario();

        assertFalse(madera.equals(ningunMaterial));
        assertTrue(madera.equals(new MaderaMaterialInventario()));
        assertFalse(madera.equals(piedra));
        assertFalse(madera.equals(metal));
        assertFalse(madera.equals(diamante));
    }

    @Test
    public void test02PiedraMaterialInventarioEsSolamenteIgualAOtraPiedraMaterialInventario() {
        MaterialInventario ningunMaterial = new NingunMaterialInventario();
        MaterialInventario madera = new MaderaMaterialInventario();
        MaterialInventario piedra = new PiedraMaterialInventario();
        MaterialInventario metal = new MetalMaterialInventario();
        MaterialInventario diamante = new DiamanteMaterialInventario();

        assertTrue(piedra.equals(new PiedraMaterialInventario()));
        assertFalse(piedra.equals(ningunMaterial));
        assertFalse(piedra.equals(madera));
        assertFalse(piedra.equals(metal));
        assertFalse(piedra.equals(diamante));
    }

    @Test
    public void test02MetalMaterialInventarioEsSolamenteIgualAOtraMetalMaterialInventario() {
        MaterialInventario ningunMaterial = new NingunMaterialInventario();
        MaterialInventario madera = new MaderaMaterialInventario();
        MaterialInventario piedra = new PiedraMaterialInventario();
        MaterialInventario metal = new MetalMaterialInventario();
        MaterialInventario diamante = new DiamanteMaterialInventario();

        assertTrue(metal.equals(new MetalMaterialInventario()));
        assertFalse(metal.equals(ningunMaterial));
        assertFalse(metal.equals(madera));
        assertFalse(metal.equals(piedra));
        assertFalse(metal.equals(diamante));
    }

    @Test
    public void test02DiamanteMaterialInventarioEsSolamenteIgualAOtraDiamanteMaterialInventario() {
        MaterialInventario ningunMaterial = new NingunMaterialInventario();
        MaterialInventario madera = new MaderaMaterialInventario();
        MaterialInventario piedra = new PiedraMaterialInventario();
        MaterialInventario metal = new MetalMaterialInventario();
        MaterialInventario diamante = new DiamanteMaterialInventario();

        assertTrue(diamante.equals(new DiamanteMaterialInventario()));
        assertFalse(diamante.equals(ningunMaterial));
        assertFalse(diamante.equals(madera));
        assertFalse(diamante.equals(piedra));
        assertFalse(diamante.equals(metal));
    }
}
