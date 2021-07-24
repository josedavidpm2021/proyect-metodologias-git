package ec.edu.epn.proyecto;

import java.util.ArrayList;

public class ListaMecanico {
	private ArrayList<Mecanico> mecanicos;

	public ListaMecanico() {
		super();
		this.mecanicos = new ArrayList<Mecanico>();
	}
	
	public void aniadir(Mecanico mecanico) {
		mecanicos.add(mecanico);
	}
	
	public void quitar(Mecanico mecanico) {
		mecanicos.remove(mecanico);
	}
	
	@Override
	public String toString() {
		if(!mecanicos.isEmpty()) {
			return "Mecánicos:\n" + enumerarMecanicos();
		}else{
			return "";
		}
	}

	public String enumerarMecanicos(){
		String cadenaMecanicos="";
		for (Mecanico mecanico: mecanicos) {
			cadenaMecanicos+=(mecanico.toString()+"\n");
		}
		return cadenaMecanicos;
	}
}