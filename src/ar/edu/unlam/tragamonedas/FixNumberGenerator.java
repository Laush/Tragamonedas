package ar.edu.unlam.tragamonedas;

public class FixNumberGenerator {
	
	
	private Integer numero;

	public FixNumberGenerator(Integer numero){
		this.numero = numero;
	}

	public Integer generate(){
		return this.numero;
	}


}
