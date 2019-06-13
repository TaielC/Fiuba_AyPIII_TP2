package constructorherramientatest;

import algocraft.*;
import algocraft.constructorherramienta.ConstructorHerramienta;
import algocraft.herramienta.*;
import algocraft.material.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorHerramientaTest {

    @Test
    public void test01SePuedenAgregarItemsAlConstructorDeHerramientasEnUnaPosicionSeVerificaQueSePuedeEncontrarEnEsaPosicion() {
        int posicion = 3;
        Item item = new Metal();
        ConstructorHerramienta constructorHerramienta = ConstructorHerramienta.getInstance();

        constructorHerramienta.agregar(item, posicion);

        assertEquals(item, constructorHerramienta.obtener(posicion));
    }

    @Test
    public void test02VerificarQueAlHacerResetSeBorranLosElementosQueTeniaElConstructorEstaTodoVacio() {
        ConstructorHerramienta constructorHerramienta = ConstructorHerramienta.getInstance();
        constructorHerramienta.agregar(new Metal(), 3);
        constructorHerramienta = constructorHerramienta.reset();

        assertEquals(ItemVacio.class, constructorHerramienta.obtener(0).getClass());
        assertEquals(ItemVacio.class, constructorHerramienta.obtener(1).getClass());
        assertEquals(ItemVacio.class, constructorHerramienta.obtener(2).getClass());
        assertEquals(ItemVacio.class, constructorHerramienta.obtener(3).getClass());
        assertEquals(ItemVacio.class, constructorHerramienta.obtener(4).getClass());
        assertEquals(ItemVacio.class, constructorHerramienta.obtener(5).getClass());
        assertEquals(ItemVacio.class, constructorHerramienta.obtener(6).getClass());
        assertEquals(ItemVacio.class, constructorHerramienta.obtener(7).getClass());
        assertEquals(ItemVacio.class, constructorHerramienta.obtener(8).getClass());

    }

    @Test
    public void test03SiSeAgreganLosMaterialesEnLasPosicionesCorrectasParaUnHachaDeMaderaSeConstruyeCorrectamente() {
        ConstructorHerramienta constructorHerramienta = ConstructorHerramienta.getInstance();
        constructorHerramienta = constructorHerramienta.reset();

        constructorHerramienta.agregar(new Madera(), 0);
        constructorHerramienta.agregar(new Madera(), 1);
        constructorHerramienta.agregar(new Madera(), 3);
        constructorHerramienta.agregar(new Madera(), 4);
        constructorHerramienta.agregar(new Madera(), 7);
        Item item = constructorHerramienta.obtenerItemConstruido();

        assertEquals(Hacha.class, item.getClass());
        Herramienta herramienta = item.comoHerramienta();
        assertEquals(Madera.class, herramienta.material().getClass());
    }

    @Test
    public void test04SiSeAgreganLosMaterialesEnLasPosicionesCorrectasParaUnHachaDePiedraSeConstruyeCorrectamente() {
        ConstructorHerramienta constructorHerramienta = ConstructorHerramienta.getInstance();
        constructorHerramienta = constructorHerramienta.reset();

        constructorHerramienta.agregar(new Piedra(), 0);
        constructorHerramienta.agregar(new Piedra(), 1);
        constructorHerramienta.agregar(new Piedra(), 3);
        constructorHerramienta.agregar(new Madera(), 4);
        constructorHerramienta.agregar(new Madera(), 7);
        Item item = constructorHerramienta.obtenerItemConstruido();

        assertEquals(Hacha.class, item.getClass());
    }
}