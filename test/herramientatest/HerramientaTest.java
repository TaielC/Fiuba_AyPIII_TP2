package herramientatest;

import algocraft.herramienta.*;
import algocraft.material.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class HerramientaTest {

    @Test
    public void test01HachaDeMaderaDebeTenerDurabilidad100YFuerza2() {

        Herramienta hacha = new Hacha(new Madera());

        double durabilidadHacha = hacha.durabilidad();
        assertEquals(durabilidadHacha, 100, 0.00005);

        int fuerzaHacha = hacha.fuerza();
        assertEquals(fuerzaHacha, 2);
    }

    @Test
    public void test02PicoDeMaderaDebeTenerDurabilidad100YFuerza2() {

        Herramienta pico = new Pico(new Madera());

        double durabilidadPico = pico.durabilidad();
        assertEquals(durabilidadPico, 100, 0.00005);

        int fuerzaPico = pico.fuerza();
        assertEquals(fuerzaPico, 2);
    }

    @Test
    public void test03HachaDeMetalDebeTenerDurabilidad400YFuerza10() {

        Herramienta hacha = new Hacha(new Metal());

        double durabilidadHacha = hacha.durabilidad();
        assertEquals(durabilidadHacha, 400, 0.00005);

        int fuerzaHacha = hacha.fuerza();
        assertEquals(fuerzaHacha, 10);
    }

    @Test
    public void test04PicoDeMetalDebeTenerDurabilidad400YFuerza12() {

        Herramienta pico = new Pico(new Metal());

        double durabilidadPico = pico.durabilidad();
        assertEquals(durabilidadPico, 400, 0.00005);

        int fuerzaPico = pico.fuerza();
        assertEquals(12, fuerzaPico);
    }

    @Test
    public void test05PicoFinoDeMetalYPiedraDebeTenerDurabilidad1000YFuerza20() {

        Herramienta picoFino = new Pico(new MetalYPiedra());

        double durabilidadPicoFino = picoFino.durabilidad();
        assertEquals(durabilidadPicoFino, 1000, 0.00005);

        int fuerzaPicoFino = picoFino.fuerza();
        assertEquals(fuerzaPicoFino, 20);
    }


    @Test
    public void test06UsarHachaDeMaderaContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Madera madera = new Madera();
        Herramienta hacha = new Hacha(new Madera());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test07UsarHachaDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral piedra = new Piedra();
        Herramienta hacha = new Hacha(new Madera());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test08UsarHachaDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral metal = new Metal();
        Herramienta hacha = new Hacha(new Madera());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test09UsarHachaDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral diamante = new Diamante();
        Herramienta hacha = new Hacha(new Madera());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test10UsarHachaDePiedraContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral madera = new Madera();
        Herramienta hacha = new Hacha(new Piedra());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }


    @Test
    public void test11UsarHachaDePiedraContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral piedra = new Piedra();
        Herramienta hacha = new Hacha(new Piedra());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test12UsarHachaDePiedraContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral metal = new Metal();
        Herramienta hacha = new Hacha(new Piedra());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test13UsarHachaDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral diamante = new Diamante();
        Herramienta hacha = new Hacha(new Piedra());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005, hacha.durabilidad());
    }

    @Test
    public void test14UsarHachaDeMetalContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        MaterialMineral madera = new Madera();
        Herramienta hacha = new Hacha(new Metal());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005 / 2, hacha.durabilidad());
    }

    @Test
    public void test15UsarHachaDeMetalContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        MaterialMineral piedra = new Piedra();
        Herramienta hacha = new Hacha(new Metal());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005 / 2, hacha.durabilidad());
    }


    @Test
    public void test16UsarHachaDeMetalContraMetalSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        MaterialMineral metal = new Metal();
        Herramienta hacha = new Hacha(new Metal());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005 / 2, hacha.durabilidad());
    }

    @Test
    public void test17UsarHachaDeMetalContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        MaterialMineral diamante = new Diamante();
        Herramienta hacha = new Hacha(new Metal());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, 0.00005 / 2, hacha.durabilidad());
    }

    @Test
    public void test18UsarPicoDeMaderaContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral madera = new Madera();
        Herramienta pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.golpear(madera);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005, pico.durabilidad());
    }

    @Test
    public void test19UsarPicoDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral piedra = new Piedra();
        Herramienta pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.golpear(piedra);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005, pico.durabilidad());
    }

    @Test
    public void test20UsarPicoDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral metal = new Metal();
        Herramienta pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.golpear(metal);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005, pico.durabilidad());
    }

    @Test
    public void test21UsarPicoDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral diamante = new Diamante();
        Herramienta pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.golpear(diamante);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005, pico.durabilidad());
    }

    @Test
    public void test22UsarPicoDePiedraContraMaderaSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        MaterialMineral madera = new Madera();
        Herramienta pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.golpear(madera);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005 / 1.5, pico.durabilidad());
    }

    @Test
    public void test23UsarPicoDePiedraContraPiedraSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        MaterialMineral piedra = new Piedra();
        Herramienta pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.golpear(piedra);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005 / 1.5, pico.durabilidad());
    }

    @Test
    public void test24UsarPicoDePiedraContraMetalSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        MaterialMineral metal = new Metal();
        Herramienta pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.golpear(metal);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005 / 1.5, pico.durabilidad());
    }

    @Test
    public void test25UsarPicoDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        MaterialMineral diamante = new Diamante();
        Herramienta pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.golpear(diamante);
        assertEquals(durabilidadPico - fuerzaPico, 0.00005 / 1.5, pico.durabilidad());
    }

    @Test
    public void test26UsarPicoDeMetalContraMaderaDebeMantenerLaDurabilidadDelPico() {

        MaterialMineral madera = new Madera();
        Herramienta pico = new Pico(new Metal());
        double durabilidadPico = pico.durabilidad();

        pico.golpear(madera);
        assertEquals(durabilidadPico, pico.durabilidad(), 0.00005);
    }

    @Test
    public void test27UsarPicoDeMetalContraPiedraDebeMantenerLaDurabilidadDelPico() {

        MaterialMineral piedra = new Piedra();
        Herramienta pico = new Pico(new Metal());
        double durabilidadPico = pico.durabilidad();

        pico.golpear(piedra);
        assertEquals(durabilidadPico, pico.durabilidad(), 0.00005);
    }

    @Test
    public void test28UsarPicoDeMetalContraMetalDebeMantenerLaDurabilidadDelPico() {

        MaterialMineral metal = new Metal();
        Herramienta pico = new Pico(new Metal());
        double durabilidadPico = pico.durabilidad();

        pico.golpear(metal);
        assertEquals(durabilidadPico, pico.durabilidad(), 0.00005);
    }


    @Test
    public void test29UsarPicoDeMetalContraDiamanteDebeMantenerLaDurabilidadDelPico() {

        MaterialMineral diamante = new Diamante();
        Herramienta pico = new Pico(new Metal());
        double durabilidadPico = pico.durabilidad();

        pico.golpear(diamante);
        assertEquals(durabilidadPico, pico.durabilidad(), 0.00005);
    }

    @Test
    public void test30UsarPicoFinoDePiedraYMetalContraDiamanteDebeReducirUnDecimaDeLaDurabilidadDelPico() {

        MaterialMineral diamante = new Diamante();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.golpear(diamante);
        assertEquals(durabilidadPicoFino - (durabilidadPicoFino * 0.1), picoFino.durabilidad(), 0.00005);
    }


    @Test
    public void test31UsarPicoFinoDePiedraYMetalContraMaderaNoDebeReducirLaDurabilidadDelPico() {

        MaterialMineral madera = new Madera();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.golpear(madera);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0.00005);
    }

    @Test
    public void test32UsarPicoFinoDePiedraYMetalContraPiedraNoDebeReducirLaDurabilidadDelPico() {

        MaterialMineral piedra = new Piedra();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.golpear(piedra);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0.00005);
    }

    @Test
    public void test33UsarPicoFinoDePiedraYMetalContraMetalNoDebeReducirLaDurabilidadDelPico() {

        MaterialMineral metal = new Metal();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.golpear(metal);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0.00005);
    }

    @Test
    public void test34ElPicoDeberiaRomperseAlDecimoUso() {

        MaterialMineral piedra = new Piedra();

        Herramienta pico = new Pico(new Metal());

        double durabilidadPico = pico.durabilidad();

        for (int i = 0; i < 9; i++) {
            pico.golpear(piedra);
        }

        assertEquals(durabilidadPico, pico.durabilidad(), 0.0005);

        pico.golpear(piedra);

        assertEquals(0, pico.durabilidad(), 0.00005);
    }
}