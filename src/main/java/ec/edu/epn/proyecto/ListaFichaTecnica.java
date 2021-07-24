package ec.edu.epn.proyecto;

import java.util.ArrayList;

public class ListaFichaTecnica {
	private ArrayList<FichaTecnica> fichasTecnicas;

	public ListaFichaTecnica(){
		super();
		this.fichasTecnicas= new ArrayList<FichaTecnica>();
	}
	
	public void aniadir(FichaTecnica ficha) {
		fichasTecnicas.add(ficha);
	}
	
	public void quitar(FichaTecnica ficha) {
		fichasTecnicas.remove(ficha);
	}

	public String toString() {
		if(!fichasTecnicas.isEmpty()) {
			return "Fichas Técnicas:\n" + enumerarFichas();
		}else{
			return "";
		}
	}

	public String enumerarFichas(){
		String fichas="";
		for (FichaTecnica ficha : fichasTecnicas) {
			fichas+=(ficha.toString()+"\n");
		}
		return fichas;
	}
}