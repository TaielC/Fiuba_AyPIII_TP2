package constructorherramientatest;

import algocraft.herramienta.constructor.TableroConstruccionHerramienta;
import algocraft.herramienta.constructor.template.*;
import algocraft.material.*;

import org.junit.Test;

import java.util.LinkedList;

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

        tablero.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        tablero.putSuperior(new MaderaMaterialHerramienta());
        tablero.putIzquierda(new MaderaMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        boolean verificacion = false;
        LinkedList<TableroConstruccionHerramienta> listaTemplates = template.templatesPosibles();
        for(TableroConstruccionHerramienta tableroTemplate : listaTemplates){
            verificacion |= tablero.equals(tableroTemplate);
        }
        assertTrue(verificacion);
    }

    @Test
    public void test03SeVerificaQuePicoMaderaTemplateTieneComoTemplateAlTableroDeConstruccionDeUnPicoDeMadera() {
        TemplateConstruccionHerramienta template = new PicoMaderaTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        tablero.putSuperior(new MaderaMaterialHerramienta());
        tablero.putSuperiorDerecha(new MaderaMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        boolean verificacion = false;
        LinkedList<TableroConstruccionHerramienta> listaTemplates = template.templatesPosibles();
        for(TableroConstruccionHerramienta tableroTemplate : listaTemplates){
            verificacion |= tablero.equals(tableroTemplate);
        }
        assertTrue(verificacion);
    }

    @Test
    public void test04SeVerificaQueHachaPiedraTemplateTieneComoTemplateAlTableroDeConstruccionDeUnHachaDePiedra() {
        TemplateConstruccionHerramienta template = new HachaPiedraTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialHerramienta());
        tablero.putSuperior(new PiedraMaterialHerramienta());
        tablero.putIzquierda(new PiedraMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        boolean verificacion = false;
        LinkedList<TableroConstruccionHerramienta> listaTemplates = template.templatesPosibles();
        for(TableroConstruccionHerramienta tableroTemplate : listaTemplates){
            verificacion |= tablero.equals(tableroTemplate);
        }
        assertTrue(verificacion);
    }

    @Test
    public void test05SeVerificaQuePicoPiedraTemplateTieneComoTemplateAlTableroDeConstruccionDeUnPicoDePiedra() {
        TemplateConstruccionHerramienta template = new PicoPiedraTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialHerramienta());
        tablero.putSuperior(new PiedraMaterialHerramienta());
        tablero.putSuperiorDerecha(new PiedraMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        boolean verificacion = false;
        LinkedList<TableroConstruccionHerramienta> listaTemplates = template.templatesPosibles();
        for(TableroConstruccionHerramienta tableroTemplate : listaTemplates){
            verificacion |= tablero.equals(tableroTemplate);
        }
        assertTrue(verificacion);
    }

    @Test
    public void test06SeVerificaQueHachaMetalTemplateTieneComoTemplateAlTableroDeConstruccionDeUnHachDeMetal() {
        TemplateConstruccionHerramienta template = new HachaMetalTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialHerramienta());
        tablero.putSuperior(new MetalMaterialHerramienta());
        tablero.putIzquierda(new MetalMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        boolean verificacion = false;
        LinkedList<TableroConstruccionHerramienta> listaTemplates = template.templatesPosibles();
        for(TableroConstruccionHerramienta tableroTemplate : listaTemplates){
            verificacion |= tablero.equals(tableroTemplate);
        }
        assertTrue(verificacion);
    }

    @Test
    public void test07SeVerificaQuePicoMetalTemplateTieneComoTemplateAlTableroDeConstruccionDeUnPicoDeMetal() {
        TemplateConstruccionHerramienta template = new PicoMetalTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialHerramienta());
        tablero.putSuperior(new MetalMaterialHerramienta());
        tablero.putSuperiorDerecha(new MetalMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        boolean verificacion = false;
        LinkedList<TableroConstruccionHerramienta> listaTemplates = template.templatesPosibles();
        for(TableroConstruccionHerramienta tableroTemplate : listaTemplates){
            verificacion |= tablero.equals(tableroTemplate);
        }
        assertTrue(verificacion);
    }

    @Test
    public void test08SeVerificaQuePicoFinoTemplateTieneComoTemplateAlTableroDeConstruccionDeUnPicoFino() {
        TemplateConstruccionHerramienta template = new PicoFinoTemplateConstruccionHerramienta();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialHerramienta());
        tablero.putSuperior(new MetalMaterialHerramienta());
        tablero.putSuperiorDerecha(new MetalMaterialHerramienta());
        tablero.putIzquierda(new PiedraMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        boolean verificacion = false;
        LinkedList<TableroConstruccionHerramienta> listaTemplates = template.templatesPosibles();
        for(TableroConstruccionHerramienta tableroTemplate : listaTemplates){
            verificacion |= tablero.equals(tableroTemplate);
        }
        assertTrue(verificacion);
    }

}