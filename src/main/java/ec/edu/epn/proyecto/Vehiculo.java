package ec.edu.epn.proyecto;

public class Vehiculo {
	private String tipo;
	private String modelo;
	private String marca;
	private String matricula;
	private Propietario propietario;

	public Vehiculo(){

	}
	public Vehiculo(Propietario propietario, String tipo, String modelo, String marca, String matricula) {
		/*registrarVehiculo(propietario);*/
		registrarVehiculo(propietario,tipo, modelo, marca, matricula);
	}
	
	public void registrarVehiculo(Propietario propietario, String tipo, String modelo, String marca, String matricula) {
		this.tipo= tipo;
		this.modelo= modelo;
		this.marca= marca;
		this.matricula= matricula;
		this.propietario= propietario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "\nVehículo \nTipo: " + tipo + "\nModelo: " + modelo + "\nMatrícula: " + matricula + "\n"
				+ propietario;
	}
}