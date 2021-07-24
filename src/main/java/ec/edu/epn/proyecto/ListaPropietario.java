package ec.edu.epn.proyecto;

import java.util.ArrayList;

public class ListaPropietario {
	private ArrayList<Propietario> propietarios;

	public ListaPropietario(){
		super();
		this.propietarios = new ArrayList<Propietario>();
	}
	
	public void aniadir(Propietario propietario) {
		propietarios.add(propietario);
	}
	
	public void quitar(Propietario propietario) {
		propietarios.remove(propietario);
	}
	
	@Override
	public String toString() {
		if(!propietarios.isEmpty()) {
			return "Propietarios de los Vehículos" + enumerarPropietarios();
		}else{
			return "";
		}
	}

	public String enumerarPropietarios(){
		String cadenaPropietarios="";
		for (Propietario propietario: propietarios) {
			cadenaPropietarios+=(propietario.toString()+"\n");
		}
		return cadenaPropietarios;
	}
}