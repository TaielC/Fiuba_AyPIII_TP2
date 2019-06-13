package materialtest;

import algocraft.herramienta.*;
import algocraft.material.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MaterialMineralTest {
	
	@Test
	public void test01MaderaGolpeadaConHachaDeMaderaSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelHacha(){
		MaterialMineral madera = new Madera();
		Herramienta hacha = new Hacha(new Madera());

		int durabilidadMadera = madera.durabilidad();
		int fuerzaHacha = hacha.fuerza();

		hacha.golpear(madera);
		assertEquals(durabilidadMadera - fuerzaHacha, madera.durabilidad());
	}

	@Test
	public void test02MaderaGolpeadaConPicoDeMaderaLaDurabilidadNoSeDebeReducir() {
		MaterialMineral madera = new Madera();
		Herramienta pico = new Pico(new Madera());
		int durabilidadMadera = madera.durabilidad();
		int fuerzaPico = pico.fuerza();

		pico.golpear(madera);
		assertEquals(durabilidadMadera, madera.durabilidad());

	}

	@Test
	public void test03PiedraGolpeadaConHachaDeMaderaLaDurabilidadNoSeDebeReducir(){

		Herramienta hacha = new Hacha(new Piedra());
		MaterialMineral piedra = new Piedra();
		int durabilidadPiedra = piedra.durabilidad();

		hacha.golpear(piedra);
		assertEquals(durabilidadPiedra, piedra.durabilidad());
	}

	@Test
	public void test04PiedraGolpeadaConPicoDeMaderaSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelPico(){

		Herramienta pico = new Pico(new Piedra());
		MaterialMineral piedra = new Piedra();
		int durabilidadPiedra = piedra.durabilidad();
		int fuerzaPico = pico.fuerza();

		pico.golpear(piedra);
		assertEquals(durabilidadPiedra - fuerzaPico, piedra.durabilidad());
	}


	@Test
	public void test05MetalGolpeadaConPicoDeMaderaLaDurabilidadNoSeDebeReducir(){

		Herramienta pico = new Pico(new Madera());
		MaterialMineral metal = new Metal();
		int durabilidadMetal = metal.durabilidad();

		pico.golpear(metal);
		assertEquals(durabilidadMetal,metal.durabilidad());

	}

	@Test
	public void test06MetalGolpeadaConPicoDePiedraSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelPico(){

		Herramienta pico = new Pico(new Piedra());
		MaterialMineral metal = new Metal();
		int durabilidadMetal = metal.durabilidad();
		int fuerzaPico = pico.fuerza();

		pico.golpear(metal);
		assertEquals(durabilidadMetal - fuerzaPico ,metal.durabilidad());

	}

	@Test
	public void test07MetalGolpeadaConHachaDeMaderaLaDurabilidadNoDebeReducir(){

		Herramienta hacha = new Hacha(new Madera());
		MaterialMineral metal = new Metal();
		int durabilidadMetal = metal.durabilidad();

		hacha.golpear(metal);
		assertEquals(durabilidadMetal,metal.durabilidad());
	}
	
	@Test
	public void test08DiamanteGolpeadaConHachaDeMaderaLaDurabilidadNoDebeReducir() {
	
		Herramienta hacha = new Hacha(new Madera());
		MaterialMineral diamante = new Diamante();
		int durabilidadDiamante=diamante.durabilidad();
		
		hacha.golpear(diamante);
		assertEquals(durabilidadDiamante,diamante.durabilidad());
	}
	
	
	@Test
	public void test09DiamanteGolpeadaConPicoDeMaderaLaDurabilidadNoDebeReducir() {
		
		Herramienta pico = new Pico(new Madera());
		MaterialMineral diamante = new Diamante();
		int durabilidadDiamante=diamante.durabilidad();
		
		pico.golpear(diamante);
		assertEquals(durabilidadDiamante,diamante.durabilidad());
	}
	
	@Test
	public void test10DiamanteGolpeadaConPicoDePiedraSuDurabilidadNoDebeReducir() {
		
		Herramienta pico = new Pico(new Piedra());
		MaterialMineral diamante = new Diamante();
		int durabilidadDiamante=diamante.durabilidad();
		
		pico.golpear(diamante);
		assertEquals(durabilidadDiamante,diamante.durabilidad());
	}
	
	@Test
	public void test11DiamanteGolpeadaConPicoFinoDeMetalyPiedraSuDurabilidadDebeReducirSegunLaFuerza() {
		
		Herramienta picoFino = new PicoFino();
		MaterialMineral diamante = new Diamante();
		
		
		int durabilidadDiamante=diamante.durabilidad();
		int fuerzaPicoFino=picoFino.fuerza();
		
		picoFino.golpear(diamante);
		assertEquals(durabilidadDiamante-fuerzaPicoFino,diamante.durabilidad());
	}
	
	@Test
	public void test12MaderaGolpeadaConPicoFinoDeMetalyPiedraSuDurabilidadNoDebeReducir() {
		
		Herramienta picoFino = new PicoFino();
		MaterialMineral madera = new Madera();
		
		int durabilidadMadera = madera.durabilidad();
		
		picoFino.golpear(madera);
		assertEquals(durabilidadMadera,madera.durabilidad());
	}
	
	@Test
	public void test13PiedraGolpeadaConPicoFinoDeMetalyPiedraSuDurabilidadDebeReducirSegunLaFuerza() {
		
		Herramienta picoFino = new PicoFino();
		MaterialMineral piedra = new Piedra();
		
		int durabilidadPiedra=piedra.durabilidad();
		int fuerzaPicoFino=picoFino.fuerza();
		
		picoFino.golpear(piedra);
		assertEquals(durabilidadPiedra-fuerzaPicoFino,piedra.durabilidad());
	}
	
	@Test
	public void test14MetalGolpeadoConPicoFinoDeMetalyPiedraSuDurabilidadDebeReducirSegunLaFuerza() {
		
		Herramienta picoFino = new PicoFino();
		MaterialMineral metal = new Metal();
		
		int durabilidadMetal=metal.durabilidad();
		int fuerzaPicoFino=picoFino.fuerza();
		
		picoFino.golpear(metal);
		assertEquals(durabilidadMetal-fuerzaPicoFino,metal.durabilidad());
	}
	
	
	@Test
	public void test15MaderaGolpeadaConHachaDePiedraSuDurabilidadDebeReducirSegunLaFuerza() {
		
		Herramienta hacha = new Hacha(new Piedra());
		MaterialMineral madera = new Madera();
		
		int durabilidadMadera=madera.durabilidad();
		int fuerzaHacha=hacha.fuerza();
		
		hacha.golpear(madera);
		assertEquals(durabilidadMadera-fuerzaHacha,madera.durabilidad());
	}
	
	@Test
	public void test16MaderaGolpeadaConHachaDeMetalSuDurabilidadDebeReducirSegunLaFuerza() {
		
		Herramienta hacha = new Hacha(new Metal());
		MaterialMineral madera = new Madera();
		
		int durabilidadMadera=madera.durabilidad();
		int fuerzaHacha=hacha.fuerza();
		
		hacha.golpear(madera);
		assertEquals(durabilidadMadera-fuerzaHacha,madera.durabilidad());
	}
	
	@Test
	public void test17PiedraGolpeadaConPicoDePiedraSuDurabilidadDebeReducirSegunLaFuerza() {
		
		Herramienta pico = new Pico(new Piedra());
		MaterialMineral piedra = new Piedra();
		
		int durabilidadPiedra=piedra.durabilidad();
		int fuerzaPico=pico.fuerza();
		
		pico.golpear(piedra);
		assertEquals(durabilidadPiedra-fuerzaPico,piedra.durabilidad());
	}

}




