package tarjetas;

import java.util.Scanner;

public class Ope {
	private int importe;
	private String marca;
	private float total;
	private float tasa;
	private int mes;
	private int year;
	Scanner sc = new Scanner(System.in);
	
	public Ope(int importe, String marca, int mes, int year){
		this.importe = importe;
		this.marca = marca;
		this.mes = mes;
		this.year = year;
	}
	
	public String Tasas(){
		if (this.marca.equalsIgnoreCase("visa")) {
			
			this.tasa = (year/mes) * 10;
			this.total = (year / mes) + importe;
			return "La tasa es de: " + this.tasa + "% y el total con el importe es: $" + this.total;
			
		} 
		else if (this.marca.equalsIgnoreCase("nara")) {
			
			System.out.println("Ingrese el numero de dia:");
			int dia = sc.nextInt();
			
			if(dia > 31) {
				
				return "Ha ingresado un valor no valido.";
				
			} else {
				
				this.tasa = (float) ((dia * 0.5) * 10);
				this.total = (year / mes) + importe;
				return "La tasa es de: " + this.tasa + "% y el total con el importe es: $" + this.total;
				
			}
			
		}
		else if (this.marca.equalsIgnoreCase("amex")) {
			
			this.tasa = (float) ((mes * 0.1) * 10);
			this.total = (year / mes) + importe;
			return "La tasa es de: " + this.tasa + "% y el total con el importe es: $" + this.total;
			
		}
		else {
			return "No se reconoce la tarjeta o el importe";
		}
	}

}
