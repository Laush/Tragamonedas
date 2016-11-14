package ar.edu.unlam.tragamonedas;

public class Tragamonedas {
	public Tambor tamborUno;
	public Tambor tamborDos;
	public Tambor tamborTres;
FixNumberGenerator newGenerator = new FixNumberGenerator(1);
	
	public Tragamonedas(){
		this.tamborUno = new Tambor(newGenerator);
		this.tamborDos = new Tambor(newGenerator);
		this.tamborTres = new Tambor(newGenerator);
	}

	public void activar(){
		this.tamborUno.girar();
		this.tamborDos.girar();
		this.tamborTres.girar();
	}

	public Boolean entregaPremio(){

		return this.tamborUno.getPosicion() == this.tamborDos.getPosicion() &&
			   this.tamborDos.getPosicion() == this.tamborTres.getPosicion();
			
	}
	
}

