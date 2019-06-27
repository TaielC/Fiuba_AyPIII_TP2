package inventariotest;

import algocraft.excepciones.NoHaySuficienteMaterialExeption;
import algocraft.inventario.InventarioMateriales;
import algocraft.materialinventario.DiamanteMaterialInventario;
import algocraft.materialinventario.MaderaMaterialInventario;
import algocraft.materialinventario.MetalMaterialInventario;
import algocraft.materialinventario.PiedraMaterialInventario;

import org.junit.Test;

import static org.junit.Assert.*;

public class InventarioMaterialesTest {

    @Test
    public void test01ElInventarioMaterialesComienzaConTodoEnCero() {
        InventarioMateriales inventarioMateriales = new InventarioMateriales();
        assertEquals((Integer) 0, inventarioMateriales.cantidadMadera());
        assertEquals(0,(long) inventarioMateriales.cantidadPiedra());
        assertEquals(0,(long) inventarioMateriales.cantidadMetal());
        assertEquals(0,(long) inventarioMateriales.cantidadDiamante());
    }

    @Test
    public void test02SiSeQuiereObtenerCualquierMaterialConElInventarioVacioLanzaExcepcion() {
        InventarioMateriales inventarioMateriales = new InventarioMateriales();

        try {
            inventarioMateriales.getDiamante();
        } catch (NoHaySuficienteMaterialExeption e1) {
            try {
                inventarioMateriales.getMadera();
            } catch (NoHaySuficienteMaterialExeption e2) {
                try {
                    inventarioMateriales.getPiedra();
                } catch (NoHaySuficienteMaterialExeption e3) {
                    try {
                        inventarioMateriales.getMetal();
                    } catch (NoHaySuficienteMaterialExeption e4) {
                        return;
                    }
                }
            }
        }
        fail();
    }

    @Test
    public void test03SePuedePonerMaderaYLuegoSacarLaMismaCantidad() {
        InventarioMateriales inventarioMateriales = new InventarioMateriales();
        int cantidad = 12;

        for(int i = 0; i < cantidad; i++) {
            inventarioMateriales.agregar(new MaderaMaterialInventario());
        }
        for(int i = 0; i < cantidad; i++) {
            assertTrue(inventarioMateriales.getMadera().equals(new MaderaMaterialInventario()));
        }
    }

    @Test
    public void test04SePuedePonerDiamanteYLuegoSacarLaMismaCantidad() {
        InventarioMateriales inventarioMateriales = new InventarioMateriales();
        int cantidad = 46;

        for(int i = 0; i < cantidad; i++) {
            inventarioMateriales.agregar(new DiamanteMaterialInventario());
        }
        for(int i = 0; i < cantidad; i++) {
            assertTrue(inventarioMateriales.getDiamante().equals(new DiamanteMaterialInventario()));
        }
    }

    @Test
    public void test05SePuedePonerMetalYLuegoSacarLaMismaCantidad() {
        InventarioMateriales inventarioMateriales = new InventarioMateriales();
        int cantidad = 26;

        for(int i = 0; i < cantidad; i++) {
            inventarioMateriales.agregar(new MetalMaterialInventario());
        }
        for(int i = 0; i < cantidad; i++) {
            assertTrue(inventarioMateriales.getMetal().equals(new MetalMaterialInventario()));
        }
    }

    @Test
    public void test06SePuedePonerPiedraYLuegoSacarLaMismaCantidad() {
        InventarioMateriales inventarioMateriales = new InventarioMateriales();
        int cantidad = 62;

        for(int i = 0; i < cantidad; i++) {
            inventarioMateriales.agregar(new PiedraMaterialInventario());
        }
        for(int i = 0; i < cantidad; i++) {
            assertTrue(inventarioMateriales.getPiedra().equals(new PiedraMaterialInventario()));
        }
    }
}
