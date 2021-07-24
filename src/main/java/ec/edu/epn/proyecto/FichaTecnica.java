package ec.edu.epn.proyecto;

public class FichaTecnica {
	private static int numFicha=0;
	private Vehiculo vehiculo;
	private ListaServicio servicios;
	private Mecanico mecanico;
	
	public FichaTecnica(Vehiculo vehiculo, Mecanico mecanico) {
		this.numFicha++;
		this.vehiculo = vehiculo;
		this.servicios = new ListaServicio();
		this.mecanico = mecanico;
	}

	public int getNumFicha() {
		return numFicha;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public ListaServicio getServicios() {
		return servicios;
	}
	public void setServicios(ListaServicio servicios) {
		this.servicios = servicios;
	}
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public void registrarServicioRealizado(Servicio servicio) {
		this.servicios.aniadir(servicio);
	}
	
	public String solicitarFactura( String metodoPago) {
		GestorFactura gestor = new GestorFactura();
		return gestor.realizarFactura(this, metodoPago);
	}
	
	@Override
	public String toString() {
		return "Ficha Técnica\nNúmero Ficha: " + numFicha  +"\n"+vehiculo +"\n"+servicios.toString()
		+"\n"+ mecanico + "\n";
	}
}