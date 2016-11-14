package ar.edu.unlam.tragamonedas;

public class Tambor {
	
	private Integer numero;
	
	public Tambor(FixNumberGenerator newGenerator){
		this.numero = newGenerator.generate();
	}

	public Integer getPosicion(){
		return this.numero;
	}
	
	public void girar(){
		RandoNumberGenerator nuevaPosicion = new RandoNumberGenerator();
		this.numero = nuevaPosicion.generate();
	}
	
}
