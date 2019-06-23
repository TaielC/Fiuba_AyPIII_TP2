package constructorherramientatest;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.constructorherramienta.template.*;
import algocraft.materialinventario.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemplatesConstruccionHerramientaTest {

    @Test
    public void test01SiSeEnviaUnTableroVacioACualquierTemplateNoDevuelveNada() {
        TemplateConstruccionHerramienta templateHachaMadera = new HachaMaderaTemplateConstruccionHerramienta();
        TemplateConstruccionHerramienta templateHachaMetal = new HachaMetalTemplateConstruccionHerramienta();
        TemplateConstruccionHerramienta templateHachaPiedra = new HachaPiedraTemplateConstruccionHerramienta();
        TemplateConstruccionHerramienta templatePicoMadera = new PicoMaderaTemplateConstruccionHerramienta();
        TemplateConstruccionHerramienta PicoMetalTemplate = new PicoMetalTemplateConstruccionHerramienta();
        TemplateConstruccionHerramienta PicoPiedraTemplate = new PicoPiedraTemplateConstruccionHerramienta();
        TemplateConstruccionHerramienta templatePicoFino = new PicoFinoTemplateConstruccionHerramienta();

        TableroConstruccionHerramienta tableroVacio = new TableroConstruccionHerramienta();

        assertNull(templateHachaMadera.construirSiEsIgual(tableroVacio));
        assertNull(templateHachaMetal.construirSiEsIgual(tableroVacio));
        assertNull(templateHachaPiedra.construirSiEsIgual(tableroVacio));
        assertNull(templatePicoMadera.construirSiEsIgual(tableroVacio));
        assertNull(PicoMetalTemplate.construirSiEsIgual(tableroVacio));
        assertNull(PicoPiedraTemplate.construirSiEsIgual(tableroVacio));
        assertNull(templatePicoFino.construirSiEsIgual(tableroVacio));
    }

    @Test
    public void test02SeVerificaQueHachaMaderaTemplateTieneComoTemplateAlTableroDeConstruccionDeUnHachaDeMadera() {
        TemplateConstruccionHerramienta template = new HachaMaderaTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MaderaMaterialInventario());
        tablero.putSuperior(new MaderaMaterialInventario());
        tablero.putIzquierda(new MaderaMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        assertTrue(tablero.equals(template.getTemplate()));
    }

    @Test
    public void test03SeVerificaQuePicoMaderaTemplateTieneComoTemplateAlTableroDeConstruccionDeUnPicoDeMadera() {
        TemplateConstruccionHerramienta template = new PicoMaderaTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MaderaMaterialInventario());
        tablero.putSuperior(new MaderaMaterialInventario());
        tablero.putSuperiorDerecha(new MaderaMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        assertTrue(tablero.equals(template.getTemplate()));
    }

    @Test
    public void test04SeVerificaQueHachaPiedraTemplateTieneComoTemplateAlTableroDeConstruccionDeUnHachaDePiedra() {
        TemplateConstruccionHerramienta template = new HachaPiedraTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialInventario());
        tablero.putSuperior(new PiedraMaterialInventario());
        tablero.putIzquierda(new PiedraMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        assertTrue(tablero.equals(template.getTemplate()));
    }

    @Test
    public void test05SeVerificaQuePicoPiedraTemplateTieneComoTemplateAlTableroDeConstruccionDeUnPicoDePiedra() {
        TemplateConstruccionHerramienta template = new PicoPiedraTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialInventario());
        tablero.putSuperior(new PiedraMaterialInventario());
        tablero.putSuperiorDerecha(new PiedraMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        assertTrue(tablero.equals(template.getTemplate()));
    }

    @Test
    public void test06SeVerificaQueHachaMetalTemplateTieneComoTemplateAlTableroDeConstruccionDeUnHachDeMetal() {
        TemplateConstruccionHerramienta template = new HachaMetalTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialInventario());
        tablero.putSuperior(new MetalMaterialInventario());
        tablero.putIzquierda(new MetalMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        assertTrue(tablero.equals(template.getTemplate()));
    }

    @Test
    public void test07SeVerificaQuePicoMetalTemplateTieneComoTemplateAlTableroDeConstruccionDeUnPicoDeMetal() {
        TemplateConstruccionHerramienta template = new PicoMetalTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialInventario());
        tablero.putSuperior(new MetalMaterialInventario());
        tablero.putSuperiorDerecha(new MetalMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        assertTrue(tablero.equals(template.getTemplate()));
    }

    @Test
    public void test08SeVerificaQuePicoFinoTemplateTieneComoTemplateAlTableroDeConstruccionDeUnPicoFino() {
        TemplateConstruccionHerramienta template = new PicoFinoTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialInventario());
        tablero.putSuperior(new MetalMaterialInventario());
        tablero.putSuperiorDerecha(new MetalMaterialInventario());
        tablero.putIzquierda(new PiedraMaterialInventario());
        tablero.putCentro(new MaderaMaterialInventario());
        tablero.putInferior(new MaderaMaterialInventario());

        assertTrue(tablero.equals(template.getTemplate()));
    }

}