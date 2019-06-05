package testMaterial;



import org.junit.Test;
import static org.junit.Assert.assertEquals;

import AlgoCraft.*;


public class testMaterial{


    @Test
    public void test01MaderaGolpeadaConHachaDeMaderaSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelHacha(){
        Herramienta hacha = new Hacha(new MaderaItem());

        Madera madera = new Madera();
        int durabilidadMadera = madera.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadMadera - fuerzaHacha, madera.durabilidad());
    }
/*

    @Test
    public void test02MaderaGolpeadaConPicoDeMaderaLaDurabilidadNoSeDebeReducir() {
        Material madera = new Madera();
        Herramienta pico = new Pico(madera);
        int durabilidadMadera = madera.durabilidad();
        int fuerzaPico = pico.fuerza();

        madera.golpear(pico);
        assertEquals(durabilidadMadera - fuerzaPico, madera.durabilidad());

    }

    @Test
    public void test03PiedraGolpeadaConHachaDeMaderaLaDurabilidadNoSeDebeReducir(){
        Material piedra = new Piedra();
        Herramienta hacha = new Hacha(piedra);
        int durabilidadPiedra = piedra.durabilidad();

        piedra.esGolpeada(hacha);
        assertEquals(durabilidadPiedra, piedra.durabilidad());
    }

    @Test
    public void test04PiedraGolpeadaConPicoDeMaderaSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelPico(){
        Material piedra = new Piedra();
        Herramienta pico = new Pico(piedra);
        int durabilidadPiedra = piedra.durabilidad();
        int fuerzaPico = pico.fuerza();

        piedra.esGolpeada(pico);
        assertEquals(durabilidadPiedra - fuerzaPico, piedra.durabilidad());
   }


    @Test
    public void test05MetalGolpeaConPicoDeMaderaLaDurabilidadNoSeDebeReducir(){
        Material madera = new Madera();
        Herramienta pico = new Pico(madera);
        Material metal = new Metal();
        int durabilidadMetal = metal.durabilidad();

        metal.esGolpeada(pico);
        assertEquals(durabilidadMetal,metal.durabilidad());

    }

    @Test
    public void test06MetalGolpeaConPicoDePiedraSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelPico(){
        Material piedra = new Piedra();
        Herramienta pico = new Pico(piedra);
        Material metal = new Metal();
        int durabilidadMetal = metal.durabilidad();
        int fuerzaPico = pico.fuerza();

        metal.esGolpeada(pico);
        assertEquals(durabilidadMetal - fuerzaPico ,metal.durabilidad());

    }

    @Test
    public void test07MetalGolpeaConPicoDeMaderaLaDurabilidadNoDebeReducir(){
        Material madera = new Madera();
        Herramienta pico = new Pico(madera);
        Material metal = new Metal();
        int durabilidadMetal = metal.durabilidad();

        metal.esGolpeada(pico);
        assertEquals(durabilidadMetal,metal.durabilidad());

    }
*/

}