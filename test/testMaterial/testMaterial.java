package testHerramienta;


import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TP2TestsMaterial{

    @Test
    public void test01MaderaGolpeaConHachaDeMaderaLaDurabilidadDebeReducirLaFuerzaDeHacha{
        Material madera = new Matera();
        Herramienta hacha = new Hacha(madera);
        int durabilidadMadera = madera.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        madera.golpear(hacha);
        assertEquals(durabilidadMadera - fuerzaHacha, madera.durabilidad())
    }

    @Test
    public void test01PiedraGolpeaConHachaDeMaderaLaDurabilidadNoDebeReducir{
        Material piedra = new Piedra();
        Herramienta hacha = new Hacha(piedra);
        int durabilidadPiedra = piedra.durabilidad();

        piedra.golpear(hacha);
        assertEquals(durabilidadPiedra, piedra.durabilidad())
    }

    @Test
    public void test03MetalGolpeaConPicoDeMaderaLaDurabilidadNoDebeReducir{
        Material madera = new Matera();
        Herramienta pico = new Pico(madera);
        Material metal = new Metal();
        int durabilidadMetal = metal.durabilidad();

        metal.golpear(pico);
        assertEquals(durabilidadMetal,metal.durabilidad());



    }

}