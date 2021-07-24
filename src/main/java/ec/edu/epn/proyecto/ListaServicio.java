package ec.edu.epn.proyecto;

import java.util.ArrayList;

public class ListaServicio {
	private ArrayList<Servicio> servicios;


	public ListaServicio() {
		this.servicios = new ArrayList<Servicio>();
	}
	
	public ArrayList<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<Servicio> servicios) {
		this.servicios = servicios;
	}

	public void aniadir(Servicio servicio) {
		servicios.add(servicio);
	}
	
	public void quitar(Servicio servicio) {
		servicios.remove(servicio);
	}
	
	public double valoresServicios() {
		return obtenerSubtotal();
	}

	private double obtenerSubtotal() {
		double subT=0;
		for (int i=0; i < servicios.size(); i++) {
			subT += servicios.get(i).getCosto();
		}
		return subT;
	}

	@Override
	public String toString() {
		if(!servicios.isEmpty()) {
			return "Servicios\n" + enumerarServicios();
		}else{
			return "";
		}
	}

	public String enumerarServicios(){
		String cadenaServicios="";
		for (int i = 0; i < servicios.size(); i++) {
			cadenaServicios+=((i+1)+": "+servicios.get(i).toString()+"\n");
		}
		return cadenaServicios;
	}
}