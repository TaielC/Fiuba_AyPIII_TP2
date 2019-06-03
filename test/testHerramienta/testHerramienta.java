package testHerramienta;


import org.junit.Test;
import org.junit.jupiter.api.Test;

import AlgoCraft.Hacha;
import AlgoCraft.Herramienta;
import AlgoCraft.Madera;
import AlgoCraft.Material;
import AlgoCraft.Metal;
import AlgoCraft.Pico;
import AlgoCraft.PicoFino;
import AlgoCraft.Piedra;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TP2TestsHerramienta{

	@Test
    public void test01HachaDeMaderaDebeTenerDurabilidad100YFuerza2(){

        Material madera = new Madera();
        Herramienta hacha = new Hacha(madera);

        int durabilidadHacha = hacha.durabilidad();
        assertEquals(durabilidadHacha, 100);

        int fuerzaHacha = hacha.fuerza();
        assertEquals(fuerzaHacha, 2);


    }
    
    

    @Test
    public void test02PicoDeMaderaDebeTenerDurabilidad100YFuerza2(){

        Material madera = new Madera();
        Herramienta pico = new Pico(madera);

        int durabilidadPico = pico.durabilidad();
        assertEquals(durabilidadPico, 100);

        int fuerzaPico = pico.fuerza();
        assertEquals(fuerzaPico, 2);


    }

    @Test
    public void test03HachaDeMetalDebeTenerDurabilidad400YFuerza10(){

        Material metal = new Metal();
        Herramienta hacha = new Hacha(metal);

        int durabilidadHacha = hacha.durabilidad();
        assertEquals(durabilidadHacha, 400);

        int fuerzaHacha = hacha.fuerza();
        assertEquals(fuerzaHacha, 10);


    }

    @Test
    public void test04PicoDeMetalDebeTenerDurabilidad400YFuerza12(){

        Material metal = new Metal();
        Herramienta pico = new Pico(metal);

        int durabilidadPico = pico.durabilidad();
        assertEquals(durabilidadPico, 400);

        int fuerzaPico = pico.fuerza();
        assertEquals(fuerzaPico, 12);


    }

    @Test
    public void test05PicoFinoDeMetalYPiedraDebeTenerDurabilidad1000YFuerza20(){

        Material metal = new Metal();
        Material piedra = new Piedra();
        Herramienta picoFino = new PicoFino(metal, piedra);

        int durabilidadPicoFino = picoFino.durabilidad();
        assertEquals(durabilidadPicoFino, 1000);

        int fuerzaPicoFino = picoFino.fuerza();
        assertEquals(fuerzaPicoFino, 20);

    }

    @Test
    public void test06UsarHachaDeMaderaContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material madera = new Madera();
        Herramienta hacha = new Hacha(madera);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad());


    }

    @Test
    public void test07UsarHachaDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material piedra = new Piedra();
        Material madera = new Madera();
        Herramienta hacha = new Hacha(madera);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad());


    }
    @Test
    public void test08UsarHachaDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material metal = new Metal();
        Material madera = new Madera();
        Herramienta hacha = new Hacha(madera);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad());


    }

    @Test
    public void test09UsarHachaDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material diamante = new Diamante();
        Material madera = new Madera();
        Herramienta hacha = new Hacha(madera);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad());


    }

    @Test
    public void test10UsarHachaDePiedraContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material madera = new Madera();
        Material piedra = new Piedra();
        Herramienta hacha = new Hacha(piedra);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad());


    }

    @Test
    public void test11UsarHachaDePiedraContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material piedra = new Piedra();
        Herramienta hacha = new Hacha(piedra);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad());


    }

    @Test
    public void test12UsarHachaDePiedraContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material metal = new Metal();
        Material piedra = new Piedra();
        Herramienta hacha = new Hacha(piedra);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad());


    }

    @Test
    public void test13UsarHachaDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material diamante = new Diamante();
        Material piedra = new Piedra();
        Herramienta hacha = new Hacha(piedra);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad());


    }

    @Test
    public void test14UsarHachaDeMetalContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza(){

        Material madera = new Madera();
        Material metal = new Metal();
        Herramienta hacha = new Hacha(metal);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha/2, hacha.durabilidad());


    }

    @Test
    public void test15UsarHachaDeMetalContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza(){

        Material piedra = new Piedra();
        Material metal = new Metal();
        Herramienta hacha = new Hacha(metal);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha/2, hacha.durabilidad());


    }

    @Test
    public void test16UsarHachaDeMetalContraMetalSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza(){

        Material metal = new Metal();
        Herramienta hacha = new Hacha(metal);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha/2, hacha.durabilidad());


    }

    @Test
    public void test17UsarHachaDeMetalContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza(){

        Material diamante = new Diamante();
        Material metal = new Metal();
        Herramienta hacha = new Hacha(metal);
        int durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha/2, hacha.durabilidad());


    }

    @Test
    public void test18UsarPicoDeMaderaContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material madera = new Madera();
        Herramienta pico = new Pico(madera);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad());
    }

    @Test
    public void test19UsarPicoDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        material piedra = new Piedra();
        Material madera = new Madera();
        Herramienta pico = new Pico(madera);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad());
    }

    @Test
    public void test20UsarPicoDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material metal = new Metal();
        Material madera = new Madera();
        Herramienta pico = new Pico(madera);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad());
    }

    @Test
    public void test21UsarPicoDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material diamante = new Diamante();
        Material madera = new Madera();
        Herramienta pico = new Pico(madera);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad());
    }

    @Test
    public void test22UsarPicoDePiedraContraMaderaSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco(){

        Material madera = new Madera();
        Material piedra = new Piedra();
        Herramienta pico = new Pico(piedra);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico - fuerzaPico/1.5, pico.durabilidad());
    }

    @Test
    public void test23UsarPicoDePiedraContraPiedraSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco(){

        Material piedra = new Piedra();
        Herramienta pico = new Pico(piedra);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico - fuerzaPico/1.5, pico.durabilidad());
    }

    @Test
    public void test24UsarPicoDePiedraContraMetalSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco(){

        Material metal = new Metal();
        Material piedra = new Piedra();
        Herramienta pico = new Pico(piedra);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico - fuerzaPico/1.5, pico.durabilidad());
    }

    @Test
    public void test25UsarPicoDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco(){

        Material diamante = new Diamante();
        Material piedra = new Piedra();
        Herramienta pico = new Pico(piedra);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico - fuerzaPico/1.5, pico.durabilidad());
    }

    @Test
    public void test26UsarPicoDeMetalContraMaderaDebeMantenerLaDurabilidadDelPico(){

        Material madera = new Madera();
        Material metal = new Metal();
        Herramienta pico = new Pico(metal);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico, pico.durabilidad());

    }

    @Test
    public void test27UsarPicoDeMetalContraPiedraDebeMantenerLaDurabilidadDelPico(){

        Material piedra = new Piedra();
        Material metal = new Metal();
        Herramienta pico = new Pico(metal);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico, pico.durabilidad());

    }

    @Test
    public void test28UsarPicoDeMetalContraMetalDebeMantenerLaDurabilidadDelPico(){

        Material metal = new Metal();
        Herramienta pico = new Pico(metal);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico, pico.durabilidad());

    }

    @Test
    public void test29UsarPicoDeMetalContraDiamanteDebeMantenerLaDurabilidadDelPico(){

        Material diamante = new Diamante();
        Material metal = new Metal();
        Herramienta pico = new Pico(metal);
        int durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico, pico.durabilidad());

    }

    @Test
    public void test30UsarPicoFinoDePiedraYMetalContraDiamanteDebeReducirUnDecimaDeLaDurabilidadDelPico(){

        Material diamante = new Diamante();
        Material metal = new Metal();
        Material piedra = new Piedra();
        Herramienta picoFino = new PicoFino(metal, piedra);
        int durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(diamante);
        assertEquals(durabilidadPicoFino - durabilidadPicoFino*0.1, picoFino.durabilidad());


    }

    @Test
    public void test31UsarPicoFinoDePiedraYMetalContraMaderaNoDebeReducirLaDurabilidadDelPico(){

        Material madera = new Madera();
        Material metal = new Metal();
        Material piedra = new Piedra();
        Herramienta picoFino = new PicoFino(metal, piedra);
        int durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(madera);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad());

    }

    @Test
    public void test32UsarPicoFinoDePiedraYMetalContraPiedraNoDebeReducirLaDurabilidadDelPico(){

        Material metal = new Metal();
        Material piedra = new Piedra();
        Herramienta picoFino = new PicoFino(metal, piedra);
        int durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(piedra);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad());

    }

    @Test
    public void test33UsarPicoFinoDePiedraYMetalContraMetalNoDebeReducirLaDurabilidadDelPico(){

        Material metal = new Metal();
        Material piedra = new Piedra();
        Herramienta picoFino = new PicoFino(metal, piedra);
        int durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(metal);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad());

    }

}





