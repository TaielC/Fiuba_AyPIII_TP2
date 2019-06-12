package constructorherramientatest;

import algocraft.constructorherramienta.TableroConstruccion;
import algocraft.Item;
import algocraft.material.*;

import static org.mockito.Mockito.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TableroConstruccionTest {

    @Test
    public void test01SeVerificaQueSePuedePonerUnItemDondeSeQuiera() {
        Item item = new Madera();
        int posicion = 3;
        TableroConstruccion tableroConstruccion = new TableroConstruccion(10);

        tableroConstruccion.put(posicion, item);

        assertEquals(item, tableroConstruccion.get(posicion));
    }

    @Test
    public void test02UnaPosicionDelTableroDondeNoSeAgregoNadaEstaVacia() {
        TableroConstruccion tableroConstruccion = new TableroConstruccion(2);

        assertTrue(tableroConstruccion.estaVacioEn(1));
    }

    @Test
    public void test03SeConvierteCorrectamenteAString() {
        TableroConstruccion tableroConstruccion = new TableroConstruccion(9);

        tableroConstruccion.put(0, new Madera());
        tableroConstruccion.put(1, new Madera());
        tableroConstruccion.put(3, new Madera());
        tableroConstruccion.put(4, new Madera());
        tableroConstruccion.put(7, new Madera());

        assertEquals("Madera,Madera,Vacio,"+"Madera,Madera,Vacio,"+"Vacio,Madera,Vacio", tableroConstruccion.toString());
    }

}