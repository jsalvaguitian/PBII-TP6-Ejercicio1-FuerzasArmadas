package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Volador, Acuatico {

	private Double altura;
	private Double profundidad;

	
	public HidroAvion(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.altura = 0.0;
		this.profundidad = 0.0;
	}

	/*public Object getAltitud() {
		return this.altura;
	}*/

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}

}
