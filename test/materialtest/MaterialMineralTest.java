package materialtest;

import algocraft.herramienta.*;
import algocraft.herramienta.material.MaderaMaterialHerramienta;
import algocraft.herramienta.material.MetalMaterialHerramienta;
import algocraft.herramienta.material.PiedraMaterialHerramienta;
import algocraft.material.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MaterialMineralTest {

	@Test
	public void test01MaderaGolpeadaConHachaDeMaderaSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelHacha(){
		MaterialMineral madera = new MaderaMineral();
		Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());

		int durabilidadMadera = madera.durabilidad();
		int fuerzaHacha = hacha.fuerza();

		hacha.usar(madera);
		assertEquals(durabilidadMadera - fuerzaHacha, madera.durabilidad());
	}

	@Test
	public void test02MaderaGolpeadaConPicoDeMaderaLaDurabilidadNoSeDebeReducir() {
		MaterialMineral madera = new MaderaMineral();
		Herramienta pico = new Pico(new MaderaMaterialHerramienta());
		int durabilidadMadera = madera.durabilidad();

		pico.usar(madera);
		assertEquals(durabilidadMadera, madera.durabilidad());

	}

	@Test
	public void test03PiedraGolpeadaConHachaDeMaderaLaDurabilidadNoSeDebeReducir(){

		Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
		MaterialMineral piedra = new Piedra();
		int durabilidadPiedra = piedra.durabilidad();

		hacha.usar(piedra);
		assertEquals(durabilidadPiedra, piedra.durabilidad());
	}

	@Test
	public void test04PiedraGolpeadaConPicoDeMaderaSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelPico(){

		Herramienta pico = new Pico(new PiedraMaterialHerramienta());
		MaterialMineral piedra = new Piedra();
		int durabilidadPiedra = piedra.durabilidad();
		int fuerzaPico = pico.fuerza();

		pico.usar(piedra);
		assertEquals(durabilidadPiedra - fuerzaPico, piedra.durabilidad());
	}


	@Test
	public void test05MetalGolpeadaConPicoDeMaderaLaDurabilidadNoSeDebeReducir(){

		Herramienta pico = new Pico(new MaderaMaterialHerramienta());
		MaterialMineral metal = new MetalMineral();
		int durabilidadMetal = metal.durabilidad();

		pico.usar(metal);
		assertEquals(durabilidadMetal,metal.durabilidad());

	}

	@Test
	public void test06MetalGolpeadaConPicoDePiedraSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelPico(){

		Herramienta pico = new Pico(new PiedraMaterialHerramienta());
		MaterialMineral metal = new MetalMineral();
		int durabilidadMetal = metal.durabilidad();
		int fuerzaPico = pico.fuerza();

		pico.usar(metal);
		assertEquals(durabilidadMetal - fuerzaPico ,metal.durabilidad());

	}

	@Test
	public void test07MetalGolpeadaConHachaDeMaderaLaDurabilidadNoDebeReducir(){

		Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
		MaterialMineral metal = new MetalMineral();
		int durabilidadMetal = metal.durabilidad();

		hacha.usar(metal);
		assertEquals(durabilidadMetal,metal.durabilidad());
	}

	@Test
	public void test08DiamanteGolpeadaConHachaDeMaderaLaDurabilidadNoDebeReducir() {

		Herramienta hacha = new Hacha(new MaderaMaterialHerramienta());
		MaterialMineral diamante = new DiamanteMineral();
		int durabilidadDiamante=diamante.durabilidad();

		hacha.usar(diamante);
		assertEquals(durabilidadDiamante,diamante.durabilidad());
	}


	@Test
	public void test09DiamanteGolpeadaConPicoDeMaderaLaDurabilidadNoDebeReducir() {

		Herramienta pico = new Pico(new MaderaMaterialHerramienta());
		MaterialMineral diamante = new DiamanteMineral();
		int durabilidadDiamante=diamante.durabilidad();

		pico.usar(diamante);
		assertEquals(durabilidadDiamante,diamante.durabilidad());
	}

	@Test
	public void test10DiamanteGolpeadaConPicoDePiedraSuDurabilidadNoDebeReducir() {

		Herramienta pico = new Pico(new PiedraMaterialHerramienta());
		MaterialMineral diamante = new DiamanteMineral();
		int durabilidadDiamante=diamante.durabilidad();

		pico.usar(diamante);
		assertEquals(durabilidadDiamante,diamante.durabilidad());
	}

	@Test
	public void test11DiamanteGolpeadaConPicoFinoDeMetalyPiedraSuDurabilidadDebeReducirSegunLaFuerza() {

		Herramienta picoFino = new PicoFino();
		MaterialMineral diamante = new DiamanteMineral();


		int durabilidadDiamante=diamante.durabilidad();
		int fuerzaPicoFino=picoFino.fuerza();

		picoFino.usar(diamante);
		assertEquals(durabilidadDiamante-fuerzaPicoFino,diamante.durabilidad());
	}

	@Test
	public void test12MaderaGolpeadaConPicoFinoDeMetalyPiedraSuDurabilidadNoDebeReducir() {

		Herramienta picoFino = new PicoFino();
		MaterialMineral madera = new MaderaMineral();

		int durabilidadMadera = madera.durabilidad();

		picoFino.usar(madera);
		assertEquals(durabilidadMadera,madera.durabilidad());
	}

	@Test
	public void test13PiedraGolpeadaConPicoFinoDeMetalyPiedraSuDurabilidadDebeReducirSegunLaFuerza() {

		Herramienta picoFino = new PicoFino();
		MaterialMineral piedra = new Piedra();

		int durabilidadPiedra=piedra.durabilidad();
		int fuerzaPicoFino=picoFino.fuerza();

		picoFino.usar(piedra);
		assertEquals(durabilidadPiedra-fuerzaPicoFino,piedra.durabilidad());
	}

	@Test
	public void test14MetalGolpeadoConPicoFinoDeMetalyPiedraSuDurabilidadDebeReducirSegunLaFuerza() {

		Herramienta picoFino = new PicoFino();
		MaterialMineral metal = new MetalMineral();

		int durabilidadMetal=metal.durabilidad();
		int fuerzaPicoFino=picoFino.fuerza();

		picoFino.usar(metal);
		assertEquals(durabilidadMetal-fuerzaPicoFino,metal.durabilidad());
	}


	@Test
	public void test15MaderaGolpeadaConHachaDePiedraSuDurabilidadDebeReducirSegunLaFuerza() {

		Herramienta hacha = new Hacha(new PiedraMaterialHerramienta());
		MaterialMineral madera = new MaderaMineral();

		int durabilidadMadera=madera.durabilidad();
		int fuerzaHacha=hacha.fuerza();

		hacha.usar(madera);
		assertEquals(durabilidadMadera-fuerzaHacha,madera.durabilidad());
	}

	@Test
	public void test16MaderaGolpeadaConHachaDeMetalSuDurabilidadDebeReducirSegunLaFuerza() {

		Herramienta hacha = new Hacha(new MetalMaterialHerramienta());
		MaterialMineral madera = new MaderaMineral();

		int durabilidadMadera=madera.durabilidad();
		int fuerzaHacha=hacha.fuerza();

		hacha.usar(madera);
		assertEquals(durabilidadMadera-fuerzaHacha,madera.durabilidad());
	}

	@Test
	public void test17PiedraGolpeadaConPicoDePiedraSuDurabilidadDebeReducirSegunLaFuerza() {

		Herramienta pico = new Pico(new PiedraMaterialHerramienta());
		MaterialMineral piedra = new Piedra();

		int durabilidadPiedra=piedra.durabilidad();
		int fuerzaPico=pico.fuerza();

		pico.usar(piedra);
		assertEquals(durabilidadPiedra-fuerzaPico,piedra.durabilidad());
	}

}




