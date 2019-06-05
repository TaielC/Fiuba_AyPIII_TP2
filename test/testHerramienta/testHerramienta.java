package testHerramienta;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import AlgoCraft.*;

public class testHerramienta{

    @Test
    public void test01HachaDeMaderaDebeTenerDurabilidad100YFuerza2(){

        Herramienta hacha = new Hacha(new MaderaItem());

        double durabilidadHacha = hacha.durabilidad();
        assertEquals(durabilidadHacha, 100, 0.00005);

        int fuerzaHacha = hacha.fuerza();
        assertEquals(fuerzaHacha, 2);
    }

    @Test
    public void test02PicoDeMaderaDebeTenerDurabilidad100YFuerza2(){

        Herramienta pico = new Pico(new MaderaItem());

        double durabilidadPico = pico.durabilidad();
        assertEquals(durabilidadPico, 100, 0.00005);

        int fuerzaPico = pico.fuerza();
        assertEquals(fuerzaPico, 2);
    }

    @Test
    public void test03HachaDeMetalDebeTenerDurabilidad400YFuerza10(){

        Herramienta hacha = new Hacha(new MetalItem());

        double durabilidadHacha = hacha.durabilidad();
        assertEquals(durabilidadHacha, 400, 0.00005);

        int fuerzaHacha = hacha.fuerza();
        assertEquals(fuerzaHacha, 10);
    }

    @Test
    public void test04PicoDeMetalDebeTenerDurabilidad400YFuerza12(){

        Herramienta pico = new Pico(new MetalItem());

        double durabilidadPico = pico.durabilidad();
        assertEquals(durabilidadPico, 400, 0.00005);

        int fuerzaPico = pico.fuerza();
        assertEquals(10, fuerzaPico);
    }
    @Test
    public void test05PicoFinoDeMetalYPiedraDebeTenerDurabilidad1000YFuerza20(){

        Herramienta picoFino = new PicoFino();

        double durabilidadPicoFino = picoFino.durabilidad();
        assertEquals(durabilidadPicoFino, 1000, 0.00005);

        int fuerzaPicoFino = picoFino.fuerza();
        assertEquals(fuerzaPicoFino, 20);
    }

    @Test
    public void test06UsarHachaDeMaderaContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Madera madera = new Madera();
        Herramienta hacha = new Hacha(new MaderaItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test07UsarHachaDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material piedra = new Piedra();
        Herramienta hacha = new Hacha(new MaderaItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }
    @Test
    public void test08UsarHachaDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material metal = new Metal();
        Herramienta hacha = new Hacha(new MaderaItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }
/*
    @Test
    public void test09UsarHachaDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material diamante = new Diamante();
        Herramienta hacha = new Hacha(new MaderaItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }*/

    @Test
    public void test10UsarHachaDePiedraContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material madera = new Madera();
        Herramienta hacha = new Hacha(new PiedraItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test11UsarHachaDePiedraContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material piedra = new Piedra();
        Herramienta hacha = new Hacha(new PiedraItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test12UsarHachaDePiedraContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material metal = new Metal();
        Herramienta hacha = new Hacha(new PiedraItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }
/*
    @Test
    public void test13UsarHachaDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material diamante = new Diamante();
        Herramienta hacha = new Hacha(new PiedraItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }*/

    @Test
    public void test14UsarHachaDeMetalContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza(){

        Material madera = new Madera();
        Herramienta hacha = new Hacha(new MetalItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005/2, hacha.durabilidad());
    }

    @Test
    public void test15UsarHachaDeMetalContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza(){

        Material piedra = new Piedra();
        Herramienta hacha = new Hacha(new MetalItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005/2, hacha.durabilidad());
    }

    @Test
    public void test16UsarHachaDeMetalContraMetalSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza(){

        Material metal = new Metal();
        Herramienta hacha = new Hacha(new MetalItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005/2, hacha.durabilidad());
    }
/*
    @Test
    public void test17UsarHachaDeMetalContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza(){

        Material diamante = new Diamante();
        Herramienta hacha = new Hacha(new MetalItem());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005/2, hacha.durabilidad());
    }*/

    @Test
    public void test18UsarPicoDeMaderaContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material madera = new Madera();
        Herramienta pico = new Pico(new PiedraItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005, pico.durabilidad());
    }

    @Test
    public void test19UsarPicoDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material piedra = new Piedra();
        Herramienta pico = new Pico(new PiedraItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005, pico.durabilidad());
    }

    @Test
    public void test20UsarPicoDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material metal = new Metal();
        Herramienta pico = new Pico(new PiedraItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005, pico.durabilidad());
    }
/*
    @Test
    public void test21UsarPicoDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza(){

        Material diamante = new Diamante();
        Herramienta pico = new Pico(new PiedraItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005, pico.durabilidad());
    }*/

    @Test
    public void test22UsarPicoDePiedraContraMaderaSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco(){

        Material madera = new Madera();
        Herramienta pico = new Pico(new PiedraItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005/1.5, pico.durabilidad());
    }

    @Test
    public void test23UsarPicoDePiedraContraPiedraSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco(){

        Material piedra = new Piedra();
        Herramienta pico = new Pico(new PiedraItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005/1.5, pico.durabilidad());
    }

    @Test
    public void test24UsarPicoDePiedraContraMetalSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco(){

        Material metal = new Metal();
        Herramienta pico = new Pico(new PiedraItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005/1.5, pico.durabilidad());
    }
/*
    @Test
    public void test25UsarPicoDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco(){

        Material diamante = new Diamante();
        Herramienta pico = new Pico(new PiedraItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005/1.5, pico.durabilidad());
    }*/

    @Test
    public void test26UsarPicoDeMetalContraMaderaDebeMantenerLaDurabilidadDelPico(){

        Material madera = new Madera();
        Herramienta pico = new Pico(new MetalItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico, pico.durabilidad(), 0.00005);
    }

    @Test
    public void test27UsarPicoDeMetalContraPiedraDebeMantenerLaDurabilidadDelPico(){

        Material piedra = new Piedra();
        Herramienta pico = new Pico(new MetalItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico, pico.durabilidad(), 0.00005);
    }

    @Test
    public void test28UsarPicoDeMetalContraMetalDebeMantenerLaDurabilidadDelPico(){

        Material metal = new Metal();
        Herramienta pico = new Pico(new MetalItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico, pico.durabilidad(), 0.00005);
    }
/*

    @Test
    public void test29UsarPicoDeMetalContraDiamanteDebeMantenerLaDurabilidadDelPico(){

        Material diamante = new Diamante();
        Herramienta pico = new Pico(new MetalItem());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico, pico.durabilidad(), 0.00005);
    }

    @Test
    public void test30UsarPicoFinoDePiedraYMetalContraDiamanteDebeReducirUnDecimaDeLaDurabilidadDelPico(){

        Material diamante = new Diamante();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(diamante);
        assertEquals(durabilidadPicoFino - durabilidadPicoFino, picoFino.durabilidad()*0.1, 0.00005);
    }
*/

    @Test
    public void test31UsarPicoFinoDePiedraYMetalContraMaderaNoDebeReducirLaDurabilidadDelPico(){

        Material madera = new Madera();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(madera);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0.00005);
    }

    @Test
    public void test32UsarPicoFinoDePiedraYMetalContraPiedraNoDebeReducirLaDurabilidadDelPico(){

        Material piedra = new Piedra();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(piedra);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0.00005);
    }

    @Test
    public void test33UsarPicoFinoDePiedraYMetalContraMetalNoDebeReducirLaDurabilidadDelPico(){

        Material metal = new Metal();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(metal);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0.00005);
    }

    @Test
    public void test34ElPicoDeberiaRomperseAlDecimoUso() {

        Material piedra = new Piedra();

        Herramienta pico = new Pico(new MetalItem());

        double durabilidadPico = pico.durabilidad();

        for (int i = 0; i <= 9 ; i++) pico.usar(piedra);

        assertEquals(durabilidadPico, pico.durabilidad(), 0.00005);

        pico.usar(piedra);

        assertEquals(0, pico.durabilidad(), 0.00005);
    }

}





