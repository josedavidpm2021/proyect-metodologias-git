package ec.edu.epn.proyecto;

public class Servicio {
	private String tipo;
	private String detalle;
	private double costo;
	
	public Servicio() {
	}
	
	public Servicio(String tipo, String detalle, double costo) {
		registrarServicio(tipo, detalle, costo);
	}

	public void registrarServicio(String tipo, String detalle, double costo) {
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el tipo del servicio: (Se recomienda ingresar ABC de Motor)");
		String aux= sc.nextLine();
		this.tipo= aux;
		System.out.println("Ingrese el detalle del servicio: (Se recomienda ingresar ABC de Motor + Lavado Profundo)");
		aux= sc.nextLine();
		this.detalle= aux;
		System.out.println("Ingrese el costo del servicio: (Se recomienda ingresar 45.60)");
		aux= sc.nextLine();
		this.costo= Double.parseDouble(aux);
		System.out.println("Registro exitoso.\n");

		 */
		this.tipo= tipo;
		this.detalle= detalle;
		this.costo= costo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Servicio \nTipo: " + tipo + "\nDetalle: " + detalle + "\nCosto: $" + costo;
	}
}