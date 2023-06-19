package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Acuatico;

public class Submarino extends Vehiculo implements Acuatico {

	private Double profundidad;
	
	public Submarino(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

}
