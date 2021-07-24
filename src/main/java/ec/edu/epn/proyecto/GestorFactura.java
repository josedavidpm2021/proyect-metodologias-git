package ec.edu.epn.proyecto;

public class GestorFactura {
	
	private Factura factura;
	
	
	public String realizarFactura(FichaTecnica fichaT, String metodoPago) {
		this.factura = new Factura(metodoPago, fichaT );
		return this.factura.toString() + "\nNúmero Ficha: " + fichaT.getNumFicha();
	}
	
	public void reembolsarFactura() {
		
	}
	
	public void imprimirFactura() {
		
	}
	
	public void modificarFactura() {
		
	}
	
	public void devolverFactura() {
		
	}
}