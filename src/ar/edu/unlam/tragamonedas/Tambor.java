package ar.edu.unlam.tragamonedas;

import java.util.Random;

public class Tambor {
	private Integer lados;

	public Tambor(Integer lados) {
			this.lados = lados;
		}

	public Integer girar() {
			Random generator = new Random();
			return generator.nextInt(this.lados) + 1;
		}
	}

