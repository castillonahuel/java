package resolucion_eldar;

import java.util.Scanner;
import tarjetas.Info;
import tarjetas.Valid;
import tarjetas.Ope;

public class Main {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Importe de compra:");
		int importe = sc.nextInt();
		Valid Val = new Valid(importe);
		
		System.out.println("Ingrese los datos de la tarjeta:");
		System.out.println("Marca:");
		String marca = sc.next();
		
		System.out.println("Numero de tarjeta:");
		long num = sc.nextLong();
		
		System.out.println("Nombre (como aparece en la tarjeta):");
		String name = sc.next();
		
		System.out.println("Apellido (como aparece en la tarjeta):");
		String ape = sc.next();
		
		System.out.println("Fecha de vencimiento (mm/yy):");
		System.out.println("Mes:");
		int mes = sc.nextInt();
		
		System.out.println("Año:");
		int year = sc.nextInt();
		
		Info Data = new Info(marca, num, name, ape, mes, year);
		
		Ope op = new Ope(importe, marca, mes, year);
		
		boolean fin = false;

		while (!fin) {
			
			System.out.println("Que accion desea realizar?");
			System.out.println("1. Mostrar Info de la tarjeta");
			System.out.println("2. Validar operacion");
			System.out.println("3. Validar tarjeta");
			System.out.println("4. Calcular tasas");
			
			System.out.println("0. Terminar");

			switch(sc.next()) {
				case "1": {
					System.out.println(Data.MostrarInfo());
					break;
				}
				case "2": {
					System.out.println(Val.validar());
					break;
				}
				case "3": {
					System.out.println(Data.verif());
					break;
				}
				case "4": {
					System.out.println(op.Tasas());
					break;
				}
				case "0": {
					System.out.println(" ");
					fin = true;
					System.out.println("Gracias por utilizar el programa");
					break;
				}
				
			}
		}
		
	}
}
