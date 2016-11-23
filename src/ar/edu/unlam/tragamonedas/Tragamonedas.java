package ar.edu.unlam.tragamonedas;

public class Tragamonedas {
	public Tambor tamborUno;
	public Tambor tamborDos;
	public Tambor tamborTres;
	
	private Integer valor1;
	private Integer valor2;
	private Integer valor3;
	
	
	public Tragamonedas(Tambor tambor1, Tambor tambor2, Tambor tambor3){
		this.tamborUno = tambor1;
		this.tamborDos = tambor2;
		this.tamborTres = tambor3;
	}

	public void activar(){
		this.tamborUno.girar();
		this.tamborDos.girar();
		this.tamborTres.girar();
	}
	

	public Integer getTamborUno() {
		return valor1;
	}

	public Integer getTamborDos() {
		return valor2;
	}

	public Integer getTamborTres() {
		return valor3;
	}
	
	
	
	public void setTamborUno(Integer valor1) {
		this.valor1=valor1;
	}

	public void setTamborDos(Integer valor2)  {
		this.valor2=valor2;
	}

	public void setTamborTres(Integer valor3)  {
		this.valor3=valor3;
	}
	
	


	
	
}

