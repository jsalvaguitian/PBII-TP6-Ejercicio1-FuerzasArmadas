package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.excepciones.VehiculoIncompatibleException;
import ar.edu.unlam.pb2.excepciones.VehiculoInexistenteException;
import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfaces.Terrestre;
import ar.edu.unlam.pb2.interfaces.Volador;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	//Set<Vehiculo> vehiculosEnLaBatalla;
	private HashSet<Vehiculo> vehiculosEnBatalla;
	
	public Batalla(Double latitud, Double longitud, TipoDeBatalla tipo) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnBatalla = new HashSet<>();
	}
	
	public Batalla() {
		
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public HashSet<Vehiculo> getVehiculosEnBatalla() {
		return vehiculosEnBatalla;
	}

	public void setVehiculosEnBatalla(HashSet<Vehiculo> vehiculosEnBatalla) {
		this.vehiculosEnBatalla = vehiculosEnBatalla;
	}
	
	public void registrarVehiculoABatalla(Vehiculo vehiculo) throws VehiculoIncompatibleException, VehiculoInexistenteException{
		if(vehiculo != null) {
			if((this.tipo.equals(TipoDeBatalla.AIRE) && vehiculo instanceof Volador) || (this.tipo.equals(TipoDeBatalla.NAVAL) && vehiculo instanceof Acuatico) || (this.tipo.equals(TipoDeBatalla.TERRESTRE) && vehiculo instanceof Terrestre)) {
				
				this.vehiculosEnBatalla.add(vehiculo);
			}else {
				throw new VehiculoIncompatibleException("El vehiculo es incompatible con el tipo de batalla");
			}
				
		}else {
			throw new VehiculoInexistenteException("El vehiculo no existe");
		}
		
		//return false;
		
	}
	
	
	

}
