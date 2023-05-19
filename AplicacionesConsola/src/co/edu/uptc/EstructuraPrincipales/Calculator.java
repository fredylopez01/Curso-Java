package co.edu.uptc.EstructuraPrincipales;

public class Calculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int res = calculator.divide(6, 0);
		System.out.println("resultado: " + res);
		int result = 0;
		try {
			result = calculator.dividir(5,0);
		} catch(MiException e) {
			System.out.println(e.getMessage());
		} catch(ArithmeticException e){
			System.out.println("Error capturado en test");
		} 
		System.out.println("Resultado: " + result);
	}
	
	public int divide(int a, int b) {
		int res = 0;
		try {
			res = a/b;
		}catch(ArithmeticException e) {
			System.out.println("Se produjo  un error matematico");
		} catch(Exception e){
			System.out.println("Se produjo un error desconocido");
			System.out.println("Mensaje original: " + e.getMessage());
			System.out.println("Pero la aplicación se seguira ejecutando");
		}
		return res;
	}
	
	public int dividir (int a, int b) throws MiException{
		if(b == 0) {
			throw new MiException();
		}
		int res = 0;
		res = a/b;
		return res;
	}
}
