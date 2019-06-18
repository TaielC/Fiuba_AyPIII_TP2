package constructorherramientatest;

import algocraft.herramienta.constructor.TableroConstruccionHerramienta;
import algocraft.herramienta.material.MaderaMaterialHerramienta;
import algocraft.herramienta.material.MaterialHerramienta;
import algocraft.herramienta.material.MaterialHerramientaNada;

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
    public void test12PonerLosMaterialesParaUnHachaDeMaderaEnDosTablerosVerifiCanIguales() {
        TableroConstruccionHerramienta tablero1 = new TableroConstruccionHerramienta();
        TableroConstruccionHerramienta tablero2 = new TableroConstruccionHerramienta();

        tablero1.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        tablero1.putSuperior(new MaderaMaterialHerramienta());
        tablero1.putIzquierda(new MaderaMaterialHerramienta());
        tablero1.putCentro(new MaderaMaterialHerramienta());
        tablero1.putInferior(new MaderaMaterialHerramienta());
        tablero2.putSuperiorIzquierda(new MaderaMaterialHerramienta());
        tablero2.putSuperior(new MaderaMaterialHerramienta());
        tablero2.putIzquierda(new MaderaMaterialHerramienta());
        tablero2.putCentro(new MaderaMaterialHerramienta());
        tablero2.putInferior(new MaderaMaterialHerramienta());

        assertTrue(tablero1.equals(tablero2));
    }
}