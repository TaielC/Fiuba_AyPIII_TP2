package constructorherramientatest;

import algocraft.herramientafactory.HerramientaFactory;
import algocraft.herramientafactory.TableroConstruccionHerramienta;
import algocraft.herramienta.*;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.materialherramienta.MetalMaterialHerramienta;
import algocraft.materialherramienta.PiedraMaterialHerramienta;
import algocraft.materialinventario.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class HerramientaFactoryTest {

    @Test
    public void test01ElConstructorDevuelveNullAlPasarUnTableroQueNoConstruyeNingunaHerramienta() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialInventario());
        tablero.putInferiorDerecha(new MaderaMaterialInventario());

        assertTrue(HerramientaFactory.obtenerHerramienta(tablero) instanceof HerramientaNula);
    }

    @Test
    public void test02ConstructorHerramientasConstruyeUnHachaDeMaderaSiSeLeEnviaUnTableroConLaConfiguracionParaLaMisma() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MaderaMaterialInventario());
        tablero.putSuperior(new MaderaMaterialInventario());
        tablero.putIzquierda(new MaderaMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        Herramienta hacha = HerramientaFactory.obtenerHerramienta(tablero);
        assertNotNull(hacha);
        assertEquals(Hacha.class, hacha.getClass());
        assertEquals(MaderaMaterialHerramienta.class, hacha.material().getClass());
    }

    @Test
    public void test03ConstructorHerramientasConstruyeUnPicoDeMaderaSiSeLeEnviaUnTableroConLaConfiguracionParaElMismo() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MaderaMaterialInventario());
        tablero.putSuperior(new MaderaMaterialInventario());
        tablero.putSuperiorDerecha(new MaderaMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        Herramienta pico = HerramientaFactory.obtenerHerramienta(tablero);
        assertNotNull(pico);
        assertEquals(Pico.class, pico.getClass());
        assertEquals(MaderaMaterialHerramienta.class, pico.material().getClass());
    }

    @Test
    public void test04ConstructorHerramientasConstruyeUnHachaDePiedraSiSeLeEnviaUnTableroConLaConfiguracionParaLaMisma() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialInventario());
        tablero.putSuperior(new PiedraMaterialInventario());
        tablero.putIzquierda(new PiedraMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        Herramienta hacha = HerramientaFactory.obtenerHerramienta(tablero);
        assertNotNull(hacha);
        assertEquals(Hacha.class, hacha.getClass());
        assertEquals(PiedraMaterialHerramienta.class, hacha.material().getClass());
    }

    @Test
    public void test05ConstructorHerramientasConstruyeUnPicoDePiedraSiSeLeEnviaUnTableroConLaConfiguracionParaElMismo() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialInventario());
        tablero.putSuperior(new PiedraMaterialInventario());
        tablero.putSuperiorDerecha(new PiedraMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        Herramienta pico = HerramientaFactory.obtenerHerramienta(tablero);
        assertNotNull(pico);
        assertEquals(Pico.class, pico.getClass());
        assertEquals(PiedraMaterialHerramienta.class, pico.material().getClass());
    }

    @Test
    public void test06ConstructorHerramientasConstruyeUnHachaDeMetalSiSeLeEnviaUnTableroConLaConfiguracionParaLaMisma() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialInventario());
        tablero.putSuperior(new MetalMaterialInventario());
        tablero.putIzquierda(new MetalMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        Herramienta hacha = HerramientaFactory.obtenerHerramienta(tablero);
        assertNotNull(hacha);
        assertEquals(Hacha.class, hacha.getClass());
        assertEquals(MetalMaterialHerramienta.class, hacha.material().getClass());
    }

    @Test
    public void test07ConstructorHerramientasConstruyeUnPicoDeMetalSiSeLeEnviaUnTableroConLaConfiguracionParaElMismo() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialInventario());
        tablero.putSuperior(new MetalMaterialInventario());
        tablero.putSuperiorDerecha(new MetalMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        Herramienta pico = HerramientaFactory.obtenerHerramienta(tablero);
        assertNotNull(pico);
        assertEquals(Pico.class, pico.getClass());
        assertEquals(MetalMaterialHerramienta.class, pico.material().getClass());
    }

    @Test
    public void test08ConstructorHerramientasConstruyeUnPicoFinoSiSeLeEnviaUnTableroConLaConfiguracionParaElMismo() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialInventario());
        tablero.putSuperior(new MetalMaterialInventario());
        tablero.putSuperiorDerecha(new MetalMaterialInventario());
        tablero.putIzquierda(new PiedraMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        Herramienta picoFino = HerramientaFactory.obtenerHerramienta(tablero);
        assertNotNull(picoFino);
        assertEquals(PicoFino.class, picoFino.getClass());
    }
}