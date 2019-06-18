package herramientatest;

import algocraft.herramienta.*;
import algocraft.herramienta.material.MaderaMaterialHerramienta;
import algocraft.herramienta.material.MetalMaterialHerramienta;
import algocraft.herramienta.material.PiedraMaterialHerramienta;
import algocraft.material.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class HerramientaTest {

    @Test
    public void test01HachaDeMaderaDebeTenerDurabilidad100YFuerza2() {

        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());

        double durabilidadHacha = hacha.durabilidad();
        assertEquals(durabilidadHacha, 100, 0);

        int fuerzaHacha = hacha.fuerza();
        assertEquals(2, fuerzaHacha);
    }

    @Test
    public void test02PicoDeMaderaDebeTenerDurabilidad100YFuerza2() {

        Herramienta pico = new Pico(new MaderaMaterialHerramienta());

        double durabilidadPico = pico.durabilidad();
        assertEquals(durabilidadPico, 100, 0);

        int fuerzaPico = pico.fuerza();
        assertEquals(2, fuerzaPico);
    }

    @Test
    public void test03HachaDeMetalDebeTenerDurabilidad400YFuerza10() {

        Herramienta hacha = new Hacha(new MetalMaterialHerramienta());

        double durabilidadHacha = hacha.durabilidad();
        assertEquals(durabilidadHacha, 400, 0);

        int fuerzaHacha = hacha.fuerza();
        assertEquals(10,fuerzaHacha);
    }

    @Test
    public void test04PicoDeMetalDebeTenerDurabilidad400YFuerza12() {

        Herramienta pico = new Pico(new MetalMaterialHerramienta());

        double durabilidadPico = pico.durabilidad();
        assertEquals(durabilidadPico, 400, 0);

        int fuerzaPico = pico.fuerza();
        assertEquals(12, fuerzaPico);
    }

    @Test
    public void test05PicoFinoDeMetalYPiedraDebeTenerDurabilidad1000YFuerza20() {

        Herramienta picoFino = new PicoFino();

        double durabilidadPicoFino = picoFino.durabilidad();
        assertEquals(1000, durabilidadPicoFino, 0);

        int fuerzaPicoFino = picoFino.fuerza();
        assertEquals(20, fuerzaPicoFino);
    }


    @Test
    public void test06UsarHachaDeMaderaContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaderaMineral maderaMineral = new MaderaMineral();
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(maderaMineral);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test07UsarHachaDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral piedra = new Piedra();
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test08UsarHachaDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral metal = new MetalMineral();
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test09UsarHachaDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral diamante = new DiamanteMineral();
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test10UsarHachaDePiedraContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral madera = new MaderaMineral();
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }


    @Test
    public void test11UsarHachaDePiedraContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral piedra = new Piedra();
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test12UsarHachaDePiedraContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral metal = new MetalMineral();
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test13UsarHachaDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral diamante = new DiamanteMineral();
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test14UsarHachaDeMetalContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        MaterialMineral madera = new MaderaMineral();
        Herramienta hacha = new Hacha(new MetalMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        double fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha / 2, hacha.durabilidad(), 0);
    }

    @Test
    public void test15UsarHachaDeMetalContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        MaterialMineral piedra = new Piedra();
        Herramienta hacha = new Hacha(new MetalMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        double fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha / 2, hacha.durabilidad(), 0);
    }


    @Test
    public void test16UsarHachaDeMetalContraMetalSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        MaterialMineral metal = new MetalMineral();
        Herramienta hacha = new Hacha(new MetalMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        double fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha / 2, hacha.durabilidad(), 0);
    }

    @Test
    public void test17UsarHachaDeMetalContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        MaterialMineral diamante = new DiamanteMineral();
        Herramienta hacha = new Hacha(new MetalMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        double fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha/2, hacha.durabilidad(), 0);
    }

    @Test
    public void test18UsarPicoDeMaderaContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral madera = new MaderaMineral();
        Herramienta pico = new Pico(new MaderaMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad(), 0);
    }

    @Test
    public void test19UsarPicoDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral piedra = new Piedra();
        Herramienta pico = new Pico(new MaderaMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad(), 0);
    }

    @Test
    public void test20UsarPicoDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral metal = new MetalMineral();
        Herramienta pico = new Pico(new MaderaMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad(), 0);
    }

    @Test
    public void test21UsarPicoDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        MaterialMineral diamante = new DiamanteMineral();
        Herramienta pico = new Pico(new MaderaMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad(), 0);
    }

    @Test
    public void test22UsarPicoDePiedraContraMaderaSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        MaterialMineral madera = new MaderaMineral();
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        double fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico - fuerzaPico / 1.5, pico.durabilidad(), 0);
    }

    @Test
    public void test23UsarPicoDePiedraContraPiedraSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        MaterialMineral piedra = new Piedra();
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        double fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico - fuerzaPico / 1.5, pico.durabilidad(), 0);
    }

    @Test
    public void test24UsarPicoDePiedraContraMetalSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        MaterialMineral metal = new MetalMineral();
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        double fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico - fuerzaPico / 1.5, pico.durabilidad(), 0);
    }

    @Test
    public void test25UsarPicoDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        MaterialMineral diamante = new DiamanteMineral();
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        double fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico - fuerzaPico / 1.5, pico.durabilidad(), 0);
    }

    @Test
    public void test26UsarPicoDeMetalContraMaderaDebeMantenerLaDurabilidadDelPico() {

        MaterialMineral madera = new MaderaMineral();
        Herramienta pico = new Pico(new MetalMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();

        pico.usar(madera);
        assertEquals(durabilidadPico, pico.durabilidad(), 0);
    }

    @Test
    public void test27UsarPicoDeMetalContraPiedraDebeMantenerLaDurabilidadDelPico() {

        MaterialMineral piedra = new Piedra();
        Herramienta pico = new Pico(new MetalMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();

        pico.usar(piedra);
        assertEquals(durabilidadPico, pico.durabilidad(), 0);
    }

    @Test
    public void test28UsarPicoDeMetalContraMetalDebeMantenerLaDurabilidadDelPico() {

        MaterialMineral metal = new MetalMineral();
        Herramienta pico = new Pico(new MetalMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();

        pico.usar(metal);
        assertEquals(durabilidadPico, pico.durabilidad(), 0);
    }


    @Test
    public void test29UsarPicoDeMetalContraDiamanteDebeMantenerLaDurabilidadDelPico() {

        MaterialMineral diamante = new DiamanteMineral();
        Herramienta pico = new Pico(new MetalMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();

        pico.usar(diamante);
        assertEquals(durabilidadPico, pico.durabilidad(), 0);
    }

    @Test
    public void test30UsarPicoFinoDePiedraYMetalContraDiamanteDebeReducirUnDecimaDeLaDurabilidadDelPico() {

        MaterialMineral diamante = new DiamanteMineral();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(diamante);
        assertEquals(durabilidadPicoFino - (durabilidadPicoFino * 0.1), picoFino.durabilidad(), 0);
    }


    @Test
    public void test31UsarPicoFinoDePiedraYMetalContraMaderaNoDebeReducirLaDurabilidadDelPico() {

        MaterialMineral madera = new MaderaMineral();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(madera);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0);
    }

    @Test
    public void test32UsarPicoFinoDePiedraYMetalContraPiedraNoDebeReducirLaDurabilidadDelPico() {

        MaterialMineral piedra = new Piedra();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(piedra);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0);
    }

    @Test
    public void test33UsarPicoFinoDePiedraYMetalContraMetalNoDebeReducirLaDurabilidadDelPico() {

        MaterialMineral metal = new MetalMineral();
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(metal);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0);
    }

    @Test
    public void test34ElPicoDeberiaTenerDurabilidadCeroAlDecimoUso() {

        MaterialMineral piedra = new Piedra();

        Herramienta pico = new Pico(new MetalMaterialHerramienta());

        double durabilidadPico = pico.durabilidad();

        for (int i = 0; i < 9; i++) {
            pico.usar(piedra);
        }

        assertEquals(durabilidadPico, pico.durabilidad(), 0);

        pico.usar(piedra);

        assertEquals(0, pico.durabilidad(), 0);
    }
}