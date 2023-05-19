package co.edu.uptc.EstructuraPrincipales;

import java.util.Scanner;

public class PLusBinary {
	
	public static void main(String [] args) {
		PLusBinary a = new PLusBinary();
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		String numberOne = input.nextLine();
		
		System.out.println("Ingrese el segundo numero");
		String numberTwo = input.nextLine();
		
		String numberCompleteOne = a.rellenar(numberOne);
		String numberCompleteTwo = a.rellenar(numberTwo);
		
		System.out.println(numberCompleteOne + "\n" + numberCompleteTwo);
		
		
		String sum = a.plusNumbers(numberCompleteOne, numberCompleteTwo);
		System.out.println(sum);
		
	}
	
	public String plusNumbers(String numberOne, String numberTwo) {
		String byteOne;
		String byteTwo;
		String result = "";
		String[] byteResult = new String[8];
		for(int i = 8; i > 0; i--) {
			if(i < 8 && byteResult[(i)].equals("10")) {
				byteOne = numberOne.substring(i-1, i);
				byteOne = sumarBites("10", byteOne);
				byteResult[(i)] = "0";
			}
				byteOne = numberOne.substring(i-1, i);
				byteTwo = numberTwo.substring(i-1, i);
				byteResult[(i-1)] = sumarBites(byteOne, byteTwo);
		}
		for(int i = 0; i < byteResult.length; i++) {
			result += byteResult[i]; 
		}
		
		return result;
	}
	
	public String rellenar(String number) {
		String result = "";
		String cero = "0";
		for(int i = 1; i < 8; i++) {
			if(number.length() == i) {
				for(int j = 0; j < (8-i); j++) {
					result += cero;
				}
			}
		}
		result += number;
		return result;
	}
	
	public String sumarBites(String biteOne, String biteTwo) {
		String result = "";
		if(biteOne.equals("0") && biteTwo.equals("0")) {
			result = "0";
		} else if (biteOne.equals("0") && biteTwo.equals("1") || biteOne.equals("1") && biteTwo.equals("0")) {
			result = "1";
		} else if(biteOne.equals("1") && biteTwo.equals("1")) {
			result = "10";
		}
		return result;
	}
	
}
