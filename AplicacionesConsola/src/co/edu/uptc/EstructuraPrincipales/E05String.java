package co.edu.uptc.EstructuraPrincipales;

import java.util.Scanner;

public class E05String {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final char ARROBA = '@';
		boolean isCorrect = false;
		int numbersArroba = 0;
		String correoElectronico = "";
		System.out.println("Ingrese correo electronico");
		correoElectronico = input.next();
		
		for(int i = 0; i < correoElectronico.length(); i++) {
			if(correoElectronico.charAt(i) == ARROBA) {
				System.out.println("Datos correctos");
				isCorrect = true;
				numbersArroba++;
			}
		}
		if(!isCorrect || numbersArroba>1) {
			System.out.println("Error! datos invalidos");
		}
		
		if(correoElectronico.substring(correoElectronico.length()-9, correoElectronico.length()).equals("gmail.com")) {
			System.out.print("Correo gmail");
		} else {
			System.out.println(correoElectronico.substring(correoElectronico.length()-9, correoElectronico.length()));
		}
	}

}
