package tarjetas;

public class Valid {
	
	private int importe;

	public Valid(int importe) {
		this.importe = importe;
	}
	
	public String validar () {
		if (this.importe < 1000) {
			return "No se llega al importe minimo para operar.";
		}
		else{
			return "Se puede proceder satisfactoriamente con la operacion.";
		}
	}
	
	

}
