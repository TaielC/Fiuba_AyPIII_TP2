package materialtest;

import algocraft.juego.Posicion;
import algocraft.materialherramienta.*;
import algocraft.materialmineral.DiamanteMineral;
import algocraft.materialmineral.MaderaMineral;
import algocraft.materialmineral.MetalMineral;
import algocraft.materialmineral.PiedraMineral;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaterialHerramientaTest {

    @Test
    public void test01NingunMaterialHerramientaNoDesgastaNingunMaterialMineral() {
        MaterialHerramienta ningunMaterial = new NingunMaterialHerramienta();
        assertFalse(ningunMaterial.daniaA(new MaderaMineral(new Posicion(0,0))));
        assertFalse(ningunMaterial.daniaA(new PiedraMineral(new Posicion(0,0))));
        assertFalse(ningunMaterial.daniaA(new MetalMineral(new Posicion(0,0))));
        assertFalse(ningunMaterial.daniaA(new DiamanteMineral(new Posicion(0,0))));
    }

    @Test
    public void test02MaderaMaterialHerramientaSoloDesgastaMaderaYPiedra() {
        MaterialHerramienta maderaMaterial = new MaderaMaterialHerramienta();
        assertTrue(maderaMaterial.daniaA(new MaderaMineral(new Posicion(0,0))));
        assertTrue(maderaMaterial.daniaA(new PiedraMineral(new Posicion(0,0))));
        assertFalse(maderaMaterial.daniaA(new MetalMineral(new Posicion(0,0))));
        assertFalse(maderaMaterial.daniaA(new DiamanteMineral(new Posicion(0,0))));
    }
    @Test
    public void test03PiedraMaterialHerramientaNoDesgastaDiamante() {
        MaterialHerramienta piedraMaterial = new PiedraMaterialHerramienta();
        assertTrue(piedraMaterial.daniaA(new MaderaMineral(new Posicion(0,0))));
        assertTrue(piedraMaterial.daniaA(new PiedraMineral(new Posicion(0,0))));
        assertTrue(piedraMaterial.daniaA(new MetalMineral(new Posicion(0,0))));
        assertFalse(piedraMaterial.daniaA(new DiamanteMineral(new Posicion(0,0))));
    }
    @Test
    public void test04MetalMaterialHerramientaNoDesgastaDiamanteNiMetal() {
        MaterialHerramienta metalMaterial = new MetalMaterialHerramienta();
        assertTrue(metalMaterial.daniaA(new MaderaMineral(new Posicion(0,0))));
        assertTrue(metalMaterial.daniaA(new PiedraMineral(new Posicion(0,0))));
        assertFalse(metalMaterial.daniaA(new MetalMineral(new Posicion(0,0))));
        assertFalse(metalMaterial.daniaA(new DiamanteMineral(new Posicion(0,0))));
    }
}
