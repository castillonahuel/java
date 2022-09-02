package tarjetas;

public class Info {
	private String marca;
	private long numtarjeta;
	private String nombre;
	private String apellido;
	private int mes;
	private int year;
	
	public Info(String marca, long numtarjeta, String nombre, String apellido, int mes, int year) {
		this.marca = marca;
		this.numtarjeta = numtarjeta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mes = mes;
		this.year = year;
	}
	
	public String verif(){
		if(this.marca.equalsIgnoreCase("visa") || this.marca.equalsIgnoreCase("nara") || this.marca.equalsIgnoreCase("amex") ){
			return "Esta tarjeta es completamente valida y esta lista para su uso.";
		} 
		else if( this.mes < 9 || this.year < 22) {
			return "Esta tarjeta esta vencida.";
		} 
		else {
			return "Esta tarjeta no se puede utilizar en esta operacion.";
		}
		
	}

	public String MostrarInfo() {
		return "Tarjeta [Marca = " + this.marca + " Numero = " + this.numtarjeta + " Nombre = " + this.nombre + " Apellido = " + this.apellido + " Fecha de vencimiento = " + this.mes + "/" + this.year + " ]";
	}
}
