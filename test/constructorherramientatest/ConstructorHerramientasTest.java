package constructorherramientatest;

import algocraft.constructorherramienta.ConstructorHerramientas;
import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.herramienta.*;
import algocraft.material.MaderaMaterialHerramienta;
import algocraft.material.MetalMaterialHerramienta;

import algocraft.material.PiedraMaterialHerramienta;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConstructorHerramientasTest {

    @Test
    public void test01ElConstructorDevuelveNullAlPasarUnTableroQueNoConstruyeNingunaHerramienta() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialHerramienta());
        tablero.putInferiorDerecha(new MaderaMaterialHerramienta());

        assertNull(ConstructorHerramientas.obtenerHerramienta(tablero));
    }

    @Test
    public void test02ConstructorHerramientasConstruyeUnHachaDeMaderaSiSeLeEnviaUnTableroConLaConfiguracionParaLaMisma() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        tablero.putSuperior(new MaderaMaterialHerramienta());
        tablero.putIzquierda(new MaderaMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        Herramienta hacha = ConstructorHerramientas.obtenerHerramienta(tablero);
        assertNotNull(hacha);
        assertEquals(Hacha.class, hacha.getClass());
        assertEquals(MaderaMaterialHerramienta.class, hacha.material().getClass());
    }

    @Test
    public void test03ConstructorHerramientasConstruyeUnPicoDeMaderaSiSeLeEnviaUnTableroConLaConfiguracionParaElMismo() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        tablero.putSuperior(new MaderaMaterialHerramienta());
        tablero.putSuperiorDerecha(new MaderaMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        Herramienta pico = ConstructorHerramientas.obtenerHerramienta(tablero);
        assertNotNull(pico);
        assertEquals(Pico.class, pico.getClass());
        assertEquals(MaderaMaterialHerramienta.class, pico.material().getClass());
    }

    @Test
    public void test04ConstructorHerramientasConstruyeUnHachaDePiedraSiSeLeEnviaUnTableroConLaConfiguracionParaLaMisma() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialHerramienta());
        tablero.putSuperior(new PiedraMaterialHerramienta());
        tablero.putIzquierda(new PiedraMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        Herramienta hacha = ConstructorHerramientas.obtenerHerramienta(tablero);
        assertNotNull(hacha);
        assertEquals(Hacha.class, hacha.getClass());
        assertEquals(PiedraMaterialHerramienta.class, hacha.material().getClass());
    }

    @Test
    public void test05ConstructorHerramientasConstruyeUnPicoDePiedraSiSeLeEnviaUnTableroConLaConfiguracionParaElMismo() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialHerramienta());
        tablero.putSuperior(new PiedraMaterialHerramienta());
        tablero.putSuperiorDerecha(new PiedraMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        Herramienta pico = ConstructorHerramientas.obtenerHerramienta(tablero);
        assertNotNull(pico);
        assertEquals(Pico.class, pico.getClass());
        assertEquals(PiedraMaterialHerramienta.class, pico.material().getClass());
    }

    @Test
    public void test06ConstructorHerramientasConstruyeUnHachaDeMetalSiSeLeEnviaUnTableroConLaConfiguracionParaLaMisma() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialHerramienta());
        tablero.putSuperior(new MetalMaterialHerramienta());
        tablero.putIzquierda(new MetalMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        Herramienta hacha = ConstructorHerramientas.obtenerHerramienta(tablero);
        assertNotNull(hacha);
        assertEquals(Hacha.class, hacha.getClass());
        assertEquals(MetalMaterialHerramienta.class, hacha.material().getClass());
    }

    @Test
    public void test07ConstructorHerramientasConstruyeUnPicoDeMetalSiSeLeEnviaUnTableroConLaConfiguracionParaElMismo() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialHerramienta());
        tablero.putSuperior(new MetalMaterialHerramienta());
        tablero.putSuperiorDerecha(new MetalMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        Herramienta pico = ConstructorHerramientas.obtenerHerramienta(tablero);
        assertNotNull(pico);
        assertEquals(Pico.class, pico.getClass());
        assertEquals(MetalMaterialHerramienta.class, pico.material().getClass());
    }

    @Test
    public void test08ConstructorHerramientasConstruyeUnPicoFinoSiSeLeEnviaUnTableroConLaConfiguracionParaElMismo() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialHerramienta());
        tablero.putSuperior(new MetalMaterialHerramienta());
        tablero.putSuperiorDerecha(new MetalMaterialHerramienta());
        tablero.putIzquierda(new PiedraMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        Herramienta picoFino = ConstructorHerramientas.obtenerHerramienta(tablero);
        assertNotNull(picoFino);
        assertEquals(PicoFino.class, picoFino.getClass());
    }
}