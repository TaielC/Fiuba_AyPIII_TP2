package constructorherramientatest;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.material.*;
import algocraft.tableroconstruccionherramientatemplates.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class TableroConstruccionHerramientaTest {

    @Test
    public void test01ElTableroIniciaConTodasLasPosicionesConUnMaterialHerramientaNada() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta materialNada = new MaterialHerramientaNada();

        assertTrue(materialNada.equals(tablero.getSuperiorIzquierda()));
        assertTrue(materialNada.equals(tablero.getSuperior()));
        assertTrue(materialNada.equals(tablero.getSuperiorDerecha()));
        assertTrue(materialNada.equals(tablero.getIzquierda()));
        assertTrue(materialNada.equals(tablero.getCentro()));
        assertTrue(materialNada.equals(tablero.getDerecha()));
        assertTrue(materialNada.equals(tablero.getInferiorIzquierda()));
        assertTrue(materialNada.equals(tablero.getInferior()));
        assertTrue(materialNada.equals(tablero.getInferiorDerecha()));
    }

    @Test
    public void test02AlPonerUnMaterialHerramientaEnLaPosicionSuperiorIzquierdaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();

        tablero.putSuperiorIzquierda(material);

        assertTrue(material.equals(tablero.getSuperiorIzquierda()));
    }

    @Test
    public void test03AlPonerUnMaterialHerramientaEnLaPosicionSuperiorSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();

        tablero.putSuperior(material);

        assertTrue(material.equals(tablero.getSuperior()));
    }

    @Test
    public void test04AlPonerUnMaterialHerramientaEnLaPosicionSuperiorDerechaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();

        tablero.putSuperiorDerecha(material);

        assertTrue(material.equals(tablero.getSuperiorDerecha()));
    }

    @Test
    public void test05AlPonerUnMaterialHerramientaEnLaPosicionIzquierdaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();

        tablero.putIzquierda(material);

        assertTrue(material.equals(tablero.getIzquierda()));
    }

    @Test
    public void test06AlPonerUnMaterialHerramientaEnLaPosicionCentroSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();

        tablero.putCentro(material);

        assertTrue(material.equals(tablero.getCentro()));
    }

    @Test
    public void test07AlPonerUnMaterialHerramientaEnLaPosicionDerechaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();

        tablero.putDerecha(material);

        assertTrue(material.equals(tablero.getDerecha()));
    }

    @Test
    public void test08AlPonerUnMaterialHerramientaEnLaPosicionInferiorIzquierdaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();

        tablero.putInferiorIzquierda(material);

        assertTrue(material.equals(tablero.getInferiorIzquierda()));
    }

    @Test
    public void test09AlPonerUnMaterialHerramientaEnLaPosicionInferiorSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();

        tablero.putInferior(material);

        assertTrue(material.equals(tablero.getInferior()));
    }

    @Test
    public void test10AlPonerUnMaterialHerramientaEnLaPosicionInferiorDerechaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();

        tablero.putInferiorDerecha(material);

        assertTrue(material.equals(tablero.getInferiorDerecha()));
    }

    @Test
    public void test11PonerLosMismosMaterialesEnDosTablerosSeVerificanIguales() {
        TableroConstruccionHerramienta tablero1 = new TableroConstruccionHerramienta();
        MaterialHerramienta material = new MaderaMaterialHerramienta();
        tablero1.putCentro(material);
        TableroConstruccionHerramienta tablero2 = new TableroConstruccionHerramienta();
        material = new MaderaMaterialHerramienta();
        tablero2.putCentro(material);

        assertTrue(tablero1.equals(tablero2));
    }

    @Test
    public void test12SiSeAgreganLosMaterialesParaUnHachaDeMaderaAUnTableroNuevoEsIgualAlTemplate() {
        TableroConstruccionHerramienta template = new TableroHachaMaderaTemplate();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        tablero.putSuperior(new MaderaMaterialHerramienta());
        tablero.putIzquierda(new MaderaMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero.equals(template));
    }
    @Test
    public void test13SiSeAgreganLosMaterialesParaUnHachaDeMaderaEspejadosAUnTableroNuevoEsIgualAlTemplate() {
        TableroConstruccionHerramienta template = new TableroHachaMaderaEspejadoTemplate();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperior(new MaderaMaterialHerramienta());
        tablero.putSuperiorDerecha(new MaderaMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putDerecha(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero.equals(template));
    }

    @Test
    public void test14SiSeAgreganLosMaterialesParaUnPicoDeMaderaAUnTableroNuevoEsIgualAlTemplate() {
        TableroConstruccionHerramienta template = new TableroPicoMaderaTemplate();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        tablero.putSuperior(new MaderaMaterialHerramienta());
        tablero.putSuperiorDerecha(new MaderaMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero.equals(template));
    }

    @Test
    public void test15SiSeAgreganLosMaterialesParaUnHachaDePiedraAUnTableroNuevoEsIgualAlTemplate() {
        TableroConstruccionHerramienta template = new TableroHachaPiedraTemplate();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialHerramienta());
        tablero.putSuperior(new PiedraMaterialHerramienta());
        tablero.putIzquierda(new PiedraMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero.equals(template));
    }
    @Test
    public void test16SiSeAgreganLosMaterialesParaUnHachaDePiedraEspejadosAUnTableroNuevoEsIgualAlTemplate() {
        TableroConstruccionHerramienta template = new TableroHachaPiedraEspejadoTemplate();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperior(new PiedraMaterialHerramienta());
        tablero.putSuperiorDerecha(new PiedraMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putDerecha(new PiedraMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero.equals(template));
    }

    @Test
    public void test17SiSeAgreganLosMaterialesParaUnPicoDePiedraAUnTableroNuevoEsIgualAlTemplate() {
        TableroConstruccionHerramienta template = new TableroPicoPiedraTemplate();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new PiedraMaterialHerramienta());
        tablero.putSuperior(new PiedraMaterialHerramienta());
        tablero.putSuperiorDerecha(new PiedraMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero.equals(template));
    }

    @Test
    public void test18SiSeAgreganLosMaterialesParaUnHachaDeMetalAUnTableroNuevoEsIgualAlTemplate() {
        TableroConstruccionHerramienta template = new TableroHachaMetalTemplate();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialHerramienta());
        tablero.putSuperior(new MetalMaterialHerramienta());
        tablero.putIzquierda(new MetalMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero.equals(template));
    }

    @Test
    public void test19SiSeAgreganLosMaterialesParaUnHachaDeMetalEspejadosAUnTableroNuevoEsIgualAlTemplate() {
        TableroConstruccionHerramienta template = new TableroHachaMetalEspejadoTemplate();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperior(new MetalMaterialHerramienta());
        tablero.putSuperiorDerecha(new MetalMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putDerecha(new MetalMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero.equals(template));
    }

    @Test
    public void test20SiSeAgreganLosMaterialesParaUnPicoDeMetalAUnTableroNuevoEsIgualAlTemplate() {
        TableroConstruccionHerramienta template = new TableroPicoMetalTemplate();
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();

        tablero.putSuperiorIzquierda(new MetalMaterialHerramienta());
        tablero.putSuperior(new MetalMaterialHerramienta());
        tablero.putSuperiorDerecha(new MetalMaterialHerramienta());
        tablero.putCentro(new MaderaMaterialHerramienta());
        tablero.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero.equals(template));
    }
}