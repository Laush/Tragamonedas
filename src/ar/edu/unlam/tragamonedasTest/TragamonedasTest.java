
package ar.edu.unlam.tragamonedasTest;

import static org.junit.Assert.*;
import org.junit.Test;
import ar.edu.unlam.tragamonedas.RandoNumberGenerator;
import ar.edu.unlam.tragamonedas.Tragamonedas;

public class TragamonedasTest {	
	
	@Test
	public void los3TamboresDelTragamonedasEstanEnLaPosicion1(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		
		assertTrue(miTragamonedas.tamborUno.getPosicion() == 1 &&
				   miTragamonedas.tamborDos.getPosicion() == 1 &&
				   miTragamonedas.tamborTres.getPosicion() == 1
				  );
	}
	
	@Test
	public void queSeCreeUnNumeroAleatorioEntreUnoYDiez() {
		RandoNumberGenerator newGenerator = new RandoNumberGenerator();
		Integer numeroAleatorio = newGenerator.generate();
		assertTrue(numeroAleatorio >0 && numeroAleatorio <= 10);
	}
	
	@Test
	public void queEntreguePremioONo(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		
		if(miTragamonedas.entregaPremio())
			assertTrue(miTragamonedas.entregaPremio());
	}
	
}