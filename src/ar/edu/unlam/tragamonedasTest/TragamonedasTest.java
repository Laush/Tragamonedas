
package ar.edu.unlam.tragamonedasTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.tragamonedas.Tambor;
import ar.edu.unlam.tragamonedas.Tragamonedas;

public class TragamonedasTest {	
	
	@Test
	public void creacionCorrectaDeLosTambores(){
		Tragamonedas t = new Tragamonedas(new Tambor(6),new Tambor(6),new Tambor(6));
		assertTrue(t.getTamborUno()!=null);
		assertTrue(t.getTamborDos()!=null);
		assertTrue(t.getTamborTres()!=null);
	}
	
	
	// El rango es de 1 a 10
	@Test
	public void queGireAleatoriamenteEnUnRango() {
		Tragamonedas t = new Tragamonedas(new Tambor(6),new Tambor(6),new Tambor(6));
		t.activar();
		
		Integer valorMinimo=1;
		Integer valorMaximo=10;
		
		assertTrue(t.getTamborUno()>=valorMinimo && t.getTamborUno()<=valorMaximo);
		assertTrue(t.getTamborDos()>=valorMinimo && t.getTamborDos()<=valorMaximo);
		assertTrue(t.getTamborTres()>=valorMinimo && t.getTamborTres()<=valorMaximo);
		
	}
	
}
	


