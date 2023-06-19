package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

import ar.edu.unlam.pb2.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.excepciones.BatallaInexistenteException;
import ar.edu.unlam.pb2.excepciones.VehiculoIncompatibleException;
import ar.edu.unlam.pb2.excepciones.VehiculoInexistenteException;

public class FuerzaArmada {
	/*private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;*/
	
	private LinkedHashSet<Vehiculo> convoy;
	private HashMap<String, Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy = new LinkedHashSet<>();
		this.batallas = new HashMap<>();
	}
	
	public FuerzaArmada(LinkedHashSet<Vehiculo> convoy, HashMap<String, Batalla> batallas) {
		super();
		this.convoy = convoy;
		this.batallas = batallas;
	}

	public LinkedHashSet<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(LinkedHashSet<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public HashMap<String, Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(HashMap<String, Batalla> batallas) {
		this.batallas = batallas;
	}

	public void crearBatalla(String nombreDeLaBatalla, TipoDeBatalla tipoDeBatalla, Double latitud, Double longitud) {
		this.batallas.put(nombreDeLaBatalla, new Batalla(latitud, longitud, tipoDeBatalla));	
	}

	public void agregarVehiculo(Vehiculo uno) {
		this.convoy.add(uno);	
	}

	public String presentarBatalla() {
		
		String informacionDeLaBatalla = ""; 
		

		for(Map.Entry<String, Batalla> batalla : this.batallas.entrySet()) {
			String nombreBatallaKey = batalla.getKey();
			Batalla unaBatalla = batalla.getValue();
			
			
			
		}
		
		
		return informacionDeLaBatalla;
	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public Batalla getBatalla(String nombreDeLaBatallaKey) throws BatallaInexistenteException {
		Batalla encontrada = this.batallas.get(nombreDeLaBatallaKey); //si no esta "creo" que devuelve null
		if(encontrada != null) {
			return encontrada;
		}
		
		throw new BatallaInexistenteException("La batalla "+ nombreDeLaBatallaKey + " no existe "); 		
	}

	public void enviarALaBatalla(String nombreDeLaBatallaKey, int codigoDelVehiculo) throws Exception {
		//buscar batalla de mi hashmap
		Batalla unaBatalla = this.getBatalla(nombreDeLaBatallaKey);
		
		//buscar el vehiculo por codigo
		Vehiculo elVehiculo = this.buscarVehiculo(codigoDelVehiculo);
		
		//enviar ese vehiculo a la batalla
		unaBatalla.registrarVehiculoABatalla(elVehiculo);
			
	}

	private Vehiculo buscarVehiculo(int codigoDelVehiculo) throws VehiculoInexistenteException{
		for(Vehiculo uno : this.convoy) {
			if(uno.getCodigo() == codigoDelVehiculo) {
				return uno;
			}
		}
		throw new VehiculoInexistenteException("El código del vehiculo no fue encontrado"); 
	}
	
	
	
	
	
	

}
