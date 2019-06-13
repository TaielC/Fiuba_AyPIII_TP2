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

		hacha.usar(madera);
		assertEquals(durabilidadMadera - fuerzaHacha, madera.durabilidad());
	}

	@Test
	public void test02MaderaGolpeadaConPicoDeMaderaLaDurabilidadNoSeDebeReducir() {
		MaterialMineral madera = new Madera();
		Herramienta pico = new Pico(new Madera());
		int durabilidadMadera = madera.durabilidad();
		int fuerzaPico = pico.fuerza();

		pico.usar(madera);
		assertEquals(durabilidadMadera, madera.durabilidad());

	}

	@Test
	public void test03PiedraGolpeadaConHachaDeMaderaLaDurabilidadNoSeDebeReducir(){

		Herramienta hacha = new Hacha(new Piedra());
		MaterialMineral piedra = new Piedra();
		int durabilidadPiedra = piedra.durabilidad();

		hacha.usar(piedra);
		assertEquals(durabilidadPiedra, piedra.durabilidad());
	}

	@Test
	public void test04PiedraGolpeadaConPicoDeMaderaSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelPico(){

		Herramienta pico = new Pico(new Piedra());
		MaterialMineral piedra = new Piedra();
		int durabilidadPiedra = piedra.durabilidad();
		int fuerzaPico = pico.fuerza();

		pico.usar(piedra);
		assertEquals(durabilidadPiedra - fuerzaPico, piedra.durabilidad());
	}


	@Test
	public void test05MetalGolpeaConPicoDeMaderaLaDurabilidadNoSeDebeReducir(){

		Herramienta pico = new Pico(new Madera());
		MaterialMineral metal = new Metal();
		int durabilidadMetal = metal.durabilidad();

		pico.usar(metal);
		assertEquals(durabilidadMetal,metal.durabilidad());

	}

	@Test
	public void test06MetalGolpeaConPicoDePiedraSeDebeReducirLaDurabilidadDelMaterialSegunLaFuerzaDelPico(){

		Herramienta pico = new Pico(new Piedra());
		MaterialMineral metal = new Metal();
		int durabilidadMetal = metal.durabilidad();
		int fuerzaPico = pico.fuerza();

		pico.usar(metal);
		assertEquals(durabilidadMetal - fuerzaPico ,metal.durabilidad());

	}

	@Test
	public void test07MetalGolpeaConPicoDeMaderaLaDurabilidadNoDebeReducir(){

		Herramienta pico = new Pico(new Madera());
		MaterialMineral metal = new Metal();
		int durabilidadMetal = metal.durabilidad();

		pico.usar(metal);
		assertEquals(durabilidadMetal,metal.durabilidad());
	}
}