package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico{
	private Double profundidad;
	private Double velocidad;

	public Anfibio(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad = 0.0;
		this.velocidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	

}
