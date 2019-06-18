package herramientatest;

import algocraft.herramienta.*;
import algocraft.juego.Posicion;
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

        Posicion posicionMaterialMineral = new Posicion(0,1);
        Madera madera = new Madera(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.golpear(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test07UsarHachaDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral piedra = new Piedra(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test08UsarHachaDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral metal = new Metal(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test09UsarHachaDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral diamante = new Diamante(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test10UsarHachaDePiedraContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral madera = new Madera(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }


    @Test
    public void test11UsarHachaDePiedraContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral piedra = new Piedra(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test12UsarHachaDePiedraContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral metal = new Metal(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test13UsarHachaDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral diamante = new Diamante(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        int fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha, hacha.durabilidad(), 0);
    }

    @Test
    public void test14UsarHachaDeMetalContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral madera = new Madera(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new MetalMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        double fuerzaHacha = hacha.fuerza();

        hacha.usar(madera);
        assertEquals(durabilidadHacha - fuerzaHacha / 2, hacha.durabilidad(), 0);
    }

    @Test
    public void test15UsarHachaDeMetalContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral piedra = new Piedra(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new MetalMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        double fuerzaHacha = hacha.fuerza();

        hacha.usar(piedra);
        assertEquals(durabilidadHacha - fuerzaHacha / 2, hacha.durabilidad(), 0);
    }


    @Test
    public void test16UsarHachaDeMetalContraMetalSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral metal = new Metal(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new MetalMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        double fuerzaHacha = hacha.fuerza();

        hacha.usar(metal);
        assertEquals(durabilidadHacha - fuerzaHacha / 2, hacha.durabilidad(), 0);
    }

    @Test
    public void test17UsarHachaDeMetalContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunLaMitadDeSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral diamante = new Diamante(posicionMaterialMineral);
        Herramienta hacha = new Hacha(new MetalMaterialHerramienta());
        double durabilidadHacha = hacha.durabilidad();
        double fuerzaHacha = hacha.fuerza();

        hacha.usar(diamante);
        assertEquals(durabilidadHacha - fuerzaHacha/2, hacha.durabilidad(), 0);
    }

    @Test
    public void test18UsarPicoDeMaderaContraMaderaSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral madera = new Madera(posicionMaterialMineral);
        Herramienta pico = new Pico(new MaderaMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad(), 0);
    }

    @Test
    public void test19UsarPicoDeMaderaContraPiedraSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral piedra = new Piedra(posicionMaterialMineral);
        Herramienta pico = new Pico(new MaderaMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad(), 0);
    }

    @Test
    public void test20UsarPicoDeMaderaContraMetalSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral metal = new Metal(posicionMaterialMineral);
        Herramienta pico = new Pico(new MaderaMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad(), 0);
    }

    @Test
    public void test21UsarPicoDeMaderaContraDiamanteSeDebeReducirLaDurabilidadDelHachaSegunSuFuerza() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral diamante = new Diamante(posicionMaterialMineral);
        Herramienta pico = new Pico(new MaderaMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        int fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico - fuerzaPico, pico.durabilidad(), 0);
    }

    @Test
    public void test22UsarPicoDePiedraContraMaderaSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral madera = new Madera(posicionMaterialMineral);
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        double fuerzaPico = pico.fuerza();

        pico.usar(madera);
        assertEquals(durabilidadPico - fuerzaPico / 1.5, pico.durabilidad(), 0);
    }

    @Test
    public void test23UsarPicoDePiedraContraPiedraSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral piedra = new Piedra(posicionMaterialMineral);
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        double fuerzaPico = pico.fuerza();

        pico.usar(piedra);
        assertEquals(durabilidadPico - fuerzaPico / 1.5, pico.durabilidad(), 0);
    }

    @Test
    public void test24UsarPicoDePiedraContraMetalSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral metal = new Metal(posicionMaterialMineral);
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        double fuerzaPico = pico.fuerza();

        pico.usar(metal);
        assertEquals(durabilidadPico - fuerzaPico / 1.5, pico.durabilidad(), 0);
    }

    @Test
    public void test25UsarPicoDePiedraContraDiamanteSeDebeReducirLaDurabilidadDelPicoSegunSuFuerzaSobreUnoComaCinco() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral diamante = new Diamante(posicionMaterialMineral);
        Herramienta pico = new Pico(new PiedraMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();
        double fuerzaPico = pico.fuerza();

        pico.usar(diamante);
        assertEquals(durabilidadPico - fuerzaPico / 1.5, pico.durabilidad(), 0);
    }

    @Test
    public void test26UsarPicoDeMetalContraMaderaDebeMantenerLaDurabilidadDelPico() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral madera = new Madera(posicionMaterialMineral);
        Herramienta pico = new Pico(new MetalMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();

        pico.usar(madera);
        assertEquals(durabilidadPico, pico.durabilidad(), 0);
    }

    @Test
    public void test27UsarPicoDeMetalContraPiedraDebeMantenerLaDurabilidadDelPico() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral piedra = new Piedra(posicionMaterialMineral);
        Herramienta pico = new Pico(new MetalMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();

        pico.usar(piedra);
        assertEquals(durabilidadPico, pico.durabilidad(), 0);
    }

    @Test
    public void test28UsarPicoDeMetalContraMetalDebeMantenerLaDurabilidadDelPico() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral metal = new Metal(posicionMaterialMineral);
        Herramienta pico = new Pico(new MetalMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();

        pico.usar(metal);
        assertEquals(durabilidadPico, pico.durabilidad(), 0);
    }


    @Test
    public void test29UsarPicoDeMetalContraDiamanteDebeMantenerLaDurabilidadDelPico() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral diamante = new Diamante(posicionMaterialMineral);
        Herramienta pico = new Pico(new MetalMaterialHerramienta());
        double durabilidadPico = pico.durabilidad();

        pico.usar(diamante);
        assertEquals(durabilidadPico, pico.durabilidad(), 0);
    }

    @Test
    public void test30UsarPicoFinoDePiedraYMetalContraDiamanteDebeReducirUnDecimaDeLaDurabilidadDelPico() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral diamante = new Diamante(posicionMaterialMineral);
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(diamante);
        assertEquals(durabilidadPicoFino - (durabilidadPicoFino * 0.1), picoFino.durabilidad(), 0);
    }


    @Test
    public void test31UsarPicoFinoDePiedraYMetalContraMaderaNoDebeReducirLaDurabilidadDelPico() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral madera = new Madera(posicionMaterialMineral);
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(madera);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0);
    }

    @Test
    public void test32UsarPicoFinoDePiedraYMetalContraPiedraNoDebeReducirLaDurabilidadDelPico() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral piedra = new Piedra(posicionMaterialMineral);
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(piedra);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0);
    }

    @Test
    public void test33UsarPicoFinoDePiedraYMetalContraMetalNoDebeReducirLaDurabilidadDelPico() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral metal = new Metal(posicionMaterialMineral);
        Herramienta picoFino = new PicoFino();
        double durabilidadPicoFino = picoFino.durabilidad();

        picoFino.usar(metal);
        assertEquals(durabilidadPicoFino, picoFino.durabilidad(), 0);
    }

    @Test
    public void test34ElPicoDeberiaTenerDurabilidadCeroAlDecimoUso() {

        Posicion posicionMaterialMineral = new Posicion(0,1);
        MaterialMineral piedra = new Piedra(posicionMaterialMineral);

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