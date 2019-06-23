package constructorherramientatest;

import algocraft.constructorherramienta.TableroConstruccionHerramienta;
import algocraft.materialinventario.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class MapaConstruccionHerramientaTest {

    @Test
    public void test01ElTableroIniciaConTodasLasPosicionesConUnMaterialInventarioNada() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario materialNada = new NingunMaterialInventario();

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
    public void test02AlPonerUnMaterialInventarioEnLaPosicionSuperiorIzquierdaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();

        tablero.putSuperiorIzquierda(material);

        assertTrue(material.equals(tablero.getSuperiorIzquierda()));
    }

    @Test
    public void test03AlPonerUnMaterialInventarioEnLaPosicionSuperiorSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();

        tablero.putSuperior(material);

        assertTrue(material.equals(tablero.getSuperior()));
    }

    @Test
    public void test04AlPonerUnMaterialInventarioEnLaPosicionSuperiorDerechaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();

        tablero.putSuperiorDerecha(material);

        assertTrue(material.equals(tablero.getSuperiorDerecha()));
    }

    @Test
    public void test05AlPonerUnMaterialInventarioEnLaPosicionIzquierdaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();

        tablero.putIzquierda(material);

        assertTrue(material.equals(tablero.getIzquierda()));
    }

    @Test
    public void test06AlPonerUnMaterialInventarioEnLaPosicionCentroSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();

        tablero.putCentro(material);

        assertTrue(material.equals(tablero.getCentro()));
    }

    @Test
    public void test07AlPonerUnMaterialInventarioEnLaPosicionDerechaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();

        tablero.putDerecha(material);

        assertTrue(material.equals(tablero.getDerecha()));
    }

    @Test
    public void test08AlPonerUnMaterialInventarioEnLaPosicionInferiorIzquierdaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();

        tablero.putInferiorIzquierda(material);

        assertTrue(material.equals(tablero.getInferiorIzquierda()));
    }

    @Test
    public void test09AlPonerUnMaterialInventarioEnLaPosicionInferiorSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();

        tablero.putInferior(material);

        assertTrue(material.equals(tablero.getInferior()));
    }

    @Test
    public void test10AlPonerUnMaterialInventarioEnLaPosicionInferiorDerechaSeVerificaQueSePuedeObtenerDeLaMismaPosicion() {
        TableroConstruccionHerramienta tablero = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();

        tablero.putInferiorDerecha(material);

        assertTrue(material.equals(tablero.getInferiorDerecha()));
    }

    @Test
    public void test11PonerLosMismosMaterialesEnDosTablerosSeVerificanIguales() {
        TableroConstruccionHerramienta tablero1 = new TableroConstruccionHerramienta();
        MaterialInventario material = new MaderaMaterialInventario();
        tablero1.putCentro(material);
        TableroConstruccionHerramienta tablero2 = new TableroConstruccionHerramienta();
        material = new MaderaMaterialInventario();
        tablero2.putCentro(material);

        assertTrue(tablero1.equals(tablero2));
    }

    @Test
    public void test12PonerLosMaterialesParaUnHachaDeMaderaEnDosTablerosVerifiCanIguales() {
        TableroConstruccionHerramienta tablero1 = new TableroConstruccionHerramienta();
        TableroConstruccionHerramienta tablero2 = new TableroConstruccionHerramienta();

        tablero1.putSuperiorIzquierda(new MaderaMaterialInventario());
        tablero1.putSuperior(new MaderaMaterialInventario());
        tablero1.putIzquierda(new MaderaMaterialInventario());
        tablero1.putCentro(new MaderaMaterialInventario());
        tablero1.putInferior(new MaderaMaterialInventario());
        tablero2.putSuperiorIzquierda(new MaderaMaterialInventario());
        tablero2.putSuperior(new MaderaMaterialInventario());
        tablero2.putIzquierda(new MaderaMaterialInventario());
        tablero2.putCentro(new MaderaMaterialInventario());
        tablero2.putInferior(new MaderaMaterialInventario());

        assertTrue(tablero1.equals(tablero2));
    }
}