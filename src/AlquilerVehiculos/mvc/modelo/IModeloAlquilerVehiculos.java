package AlquilerVehiculos.mvc.modelo;

import java.util.List;

import AlquilerVehiculos.mvc.modelo.dominio.Alquiler;
import AlquilerVehiculos.mvc.modelo.dominio.Cliente;
import AlquilerVehiculos.mvc.modelo.dominio.vehiculo.TipoVehiculo;
import AlquilerVehiculos.mvc.modelo.dominio.vehiculo.Vehiculo;

public interface IModeloAlquilerVehiculos {

	void anadirCliente(Cliente cliente);

	void borrarCliente(String dni);

	Cliente buscarCliente(String dni);
	
	List <Cliente> obtenerClientes();

	void anadirVehiculo(Vehiculo vehiculo, TipoVehiculo tipoVehiculo);

	void borrarVehiculo(String matricula);

	Vehiculo buscarVehiculo(String matricula);
	
	List <Vehiculo> obtenerVehiculos();

	void abrirAlquiler(Cliente cliente, Vehiculo vehiculo);

	void cerrarAlquiler(Cliente cliente, Vehiculo vehiculo);
	
	//List <Alquiler> obtenerAlquileres();

	Alquiler[] obtenerAlquileres();

	//void anadirDatosPrueba();
	
	void leerVehiculos();
	
	void escribirVehiculos();
	
	void leerClientes();
	
	void escribirClientes();
	
	void leerAlquileres();
	
	void escribirAlquileres();

}