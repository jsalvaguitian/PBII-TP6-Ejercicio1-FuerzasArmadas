package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Terrestre;

public class Camion extends Vehiculo implements Terrestre{

	public Camion(Integer codigo, String modelo) {
		super(codigo, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getVelocidad() {
		return null;
	}

}
