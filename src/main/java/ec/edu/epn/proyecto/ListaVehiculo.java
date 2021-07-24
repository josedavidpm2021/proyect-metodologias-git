package ec.edu.epn.proyecto;

import java.util.ArrayList;

public class ListaVehiculo {
	private ArrayList<Vehiculo> vehiculos;

	public ListaVehiculo() {
		super();
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	public void aniadir(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	
	public void quitar(Vehiculo vehiculo) {
		vehiculos.remove(vehiculo);
	}
	
	@Override
	public String toString() {
		if(!vehiculos.isEmpty()) {
			return "Vehículos\n" + enumerarVehiculos();
		}else{
			return "";
		}
	}

	public String enumerarVehiculos(){
		String cadenaVehiculos="";
		for (Vehiculo vehiculo : vehiculos) {
			cadenaVehiculos+=(vehiculo.toString()+"\n");
		}
		return cadenaVehiculos;
	}
}