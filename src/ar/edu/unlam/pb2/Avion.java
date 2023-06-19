package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Volador;

public class Avion extends Vehiculo implements Volador {
	private Double altura;

	public Avion(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.altura  = 0.0;
	}

	@Override
	public Double getAltura() {
		return altura;
	}
	
	

	

}
