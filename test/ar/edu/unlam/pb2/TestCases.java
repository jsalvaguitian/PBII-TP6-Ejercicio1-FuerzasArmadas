package ar.edu.unlam.pb2;
/*Intentar adaptarme a la estructura del proyecto que me dio el profe y seguir codeando
 */

import static org.junit.Assert.*;

import org.junit.Test;
import ar.edu.unlam.pb2.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.excepciones.BatallaInexistenteException;
import ar.edu.unlam.pb2.excepciones.VehiculoIncompatibleException;
import ar.edu.unlam.pb2.excepciones.VehiculoInexistenteException;
import ar.edu.unlam.pb2.interfaces.Acuatico;
import ar.edu.unlam.pb2.interfaces.Terrestre;
import ar.edu.unlam.pb2.interfaces.Volador;

public class TestCases {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		//Vehiculo avion = new Volador();
		
		Volador avion = new Avion(1, "A-10");

		assertEquals(0.0, avion.getAltura(), 0.01);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		//Vehiculo tanque = new Terrestre();
		
		Terrestre tanque = new Tanque(5, "Renault FT");

		assertEquals(0.0, tanque.getVelocidad(), 0.1);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		//Vehiculo submarino = new Acuatico();
		Acuatico submarino = new Submarino(8, "ARA - San Juan");

		assertEquals(0.0, submarino.getProfundidad(), 0.01);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		//Vehiculo var = new Anfibio();
		Anfibio var = new Anfibio(12, "LARC-5");

		assertEquals(0.0, var.getVelocidad(), 0.01);
		assertEquals(0.0, var.getProfundidad(), 0.01);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void queSePuedaCrearUnHidroavion() {
		//Vehiculo ag600 = new HidroAvion();
		HidroAvion ag600 = new HidroAvion(12, "AG600");

		assertEquals(0.0, ag600.getAltura(), 0.01);
		assertEquals(0.0, ag600.getProfundidad(), 0.01);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(1001, "A-10"));
		argentina.agregarVehiculo(new Avion(1002, "A-10"));
		argentina.agregarVehiculo(new Avion(1003, "F-102"));
		argentina.agregarVehiculo(new Avion(1004, "F-15"));
		argentina.agregarVehiculo(new Tanque(1005, "Renault FT"));
		argentina.agregarVehiculo(new Camion(1006, "T-72"));
		argentina.agregarVehiculo(new Camion(1007, "T-72"));
		argentina.agregarVehiculo(new Submarino(1008, "A-10"));
		argentina.agregarVehiculo(new Portaviones(1009, "A-10"));
		argentina.agregarVehiculo(new Destructor(1010, "A-10"));
		argentina.agregarVehiculo(new Destructor(1011, "A-10"));
		argentina.agregarVehiculo(new Hidroavion(1012, "A-10"));
	//	argentina.agregarVehiculo(new Anfibio(0012, "A-10"));
		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
	//	argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));

		//assertEquals(12, argentina.getCapacidadDeDefensa()); 
		assertEquals((Integer)24, argentina.getCapacidadDeDefensa());
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void queSePuedaCrearUnaBatalla() throws BatallaInexistenteException {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud(),0.01);
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud(),0.01);
	}	
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	//public void queSePuedaPlanearLaBatallaSobreElOceano() {
	public void queSePuedaPresentarBatallaTerrestre() throws Exception {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(1001, "A-10"));
		argentina.agregarVehiculo(new Avion(1002, "A-10"));
		argentina.agregarVehiculo(new Avion(1003, "F-102"));
		argentina.agregarVehiculo(new Avion(1004, "F-15"));
		argentina.agregarVehiculo(new Tanque(1005, "Renault FT"));
		argentina.agregarVehiculo(new Camion(1006, "T-72"));
		argentina.agregarVehiculo(new Camion(1007, "T-72"));
		argentina.agregarVehiculo(new Submarino(1008, "A-10"));
		argentina.agregarVehiculo(new Portaviones(1009, "A-10"));
		argentina.agregarVehiculo(new Destructor(1010, "A-10"));
		argentina.agregarVehiculo(new Destructor(1011, "A-10"));
		argentina.agregarVehiculo(new Hidroavion(1012, "A-10"));
		argentina.agregarVehiculo(new Anfibio(1012, "A-10"));

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		
		argentina.crearBatalla("San Lorenzo",TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		argentina.enviarALaBatalla("San Lorenzo", 5);
		argentina.enviarALaBatalla("San Lorenzo", 6);
		argentina.enviarALaBatalla("San Lorenzo", 7);

		argentina.presentarBatalla(); //Presentar ordenado los vehiculos por tipo de vehiculo
		
		

		/*assertTrue(argentina.enviarALaBatalla("San Lorenzo", 5));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 6));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 7));*/	
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	public void queSePuedaPresentarBatallaNaval() throws Exception {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10")); 
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));
		
		argentina.agregarVehiculo(new Submarino(14, "A-10"));
		argentina.agregarVehiculo(new Portaviones(15, "A-10"));
		argentina.agregarVehiculo(new Destructor(16, "A-10"));
		argentina.agregarVehiculo(new Destructor(17, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(18, "A-10"));
		argentina.agregarVehiculo(new Anfibio(19, "A-10"));
		
		argentina.crearBatalla("Pacifico", TipoDeBatalla.NAVAL, 200.5, 45.8);


		assertEquals((Integer)12, argentina.getCapacidadDeDefensa()); //total de vehiculos que tiene argentina para la guerra
		
		argentina.enviarALaBatalla("Pacifico", 8);
		argentina.enviarALaBatalla("Pacifico", 9);
		argentina.enviarALaBatalla("Pacifico", 10);		
		argentina.enviarALaBatalla("Pacifico", 11);		//Duda: es terrestre o acuatico -> Tomemos 
		argentina.enviarALaBatalla("Pacifico", 12);		
		argentina.enviarALaBatalla("Pacifico", 13);
		argentina.enviarALaBatalla("Pacifico", 14);
		argentina.enviarALaBatalla("Pacifico", 15);
		argentina.enviarALaBatalla("Pacifico", 18);
		argentina.enviarALaBatalla("Pacifico", 19);

		/*
		assertTrue(argentina.enviarALaBatalla("Pacifico", 8));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 9));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 10));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 11));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 12));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 13));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 14));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 15));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 18));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 19));*/
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test (expected = VehiculoIncompatibleException.class)
	public void queNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws Exception {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		
		argentina.enviarALaBatalla("San Lorenzo", 11);

		//assertFalse(argentina.enviarALaBatalla("San Lorenzo", 11));

	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test (expected = VehiculoInexistenteException.class)
	public void queNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws Exception {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		
		argentina.enviarALaBatalla("San Lorenzo", 4);
		
		argentina.enviarALaBatalla("San Lorenzo", 4);

		//assertFalse(argentina.enviarALaBatalla("San Lorenzo", 4));
	}

}
