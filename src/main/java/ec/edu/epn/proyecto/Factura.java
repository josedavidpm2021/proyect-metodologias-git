package ec.edu.epn.proyecto;

public class Factura {
	private double iva;
	private static int numFactura=0;
	private double total;
	private double subtotal;
	private double descuento;
	private String formaPago;
	private Fecha fecha;
	
	public Factura(String formaPago, FichaTecnica ficha) {
		this.numFactura++ ;
		valoresCalculados(ficha);
		this.descuento = 0.0;
		this.formaPago = formaPago;
		this.fecha = new Fecha("04/07/2021");
		int numFicha = getNumFicha(ficha);
	}

	private void valoresCalculados(FichaTecnica ficha) {
		calculoSubTotal(ficha);
		calculoIva();
		calculoTotal();
	}

	public int getNumFicha(FichaTecnica ficha){
		return ficha.getNumFicha();
	}
	
	public void calculoIva() {
		this.iva = this.subtotal * 0.12;
	}
	
	
	public void calculoSubTotal(FichaTecnica ficha) {
		 this.subtotal = ficha.getServicios().valoresServicios();		
	}
	
	public void calculoTotal() {
		this.total = this.iva + this.subtotal; 
	}

	public int getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		return "\nFactura\nNúmero de Factura: " + numFactura + "\nTotal: " + total + "\nSubtotal: " + subtotal
				+"\nIva: " +iva + "\nDescuento: " + descuento + "\nForma de Pago: " + formaPago + "\nFecha: " + fecha;
	} 

}