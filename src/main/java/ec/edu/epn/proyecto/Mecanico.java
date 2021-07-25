package ec.edu.epn.proyecto;

public class Mecanico {
	private String nombre;
	private String cedula;
	private String telefono;
	private String direccion;
	private InformacionEmpleado informacionEmpleado;
	
	public Mecanico(String nombre, String cedula, String telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public void setInformacionEmpleado(InformacionEmpleado informacionEmpleado){
		this.informacionEmpleado = informacionEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Mecánico\nNombre: " + nombre + "\nCédula: " + cedula + "\nTeléfono: " + telefono + "\nDirección: "
				+ direccion + "\n" + informacionEmpleado;
	}
}