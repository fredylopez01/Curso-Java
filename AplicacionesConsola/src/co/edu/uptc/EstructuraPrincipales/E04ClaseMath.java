package co.edu.uptc.EstructuraPrincipales;

public class E04ClaseMath {

	public static void main(String[] args) {
		double number = 25;
		double result = Math.sqrt(number);
		System.out.println("La raiz cuadrada de " + number + " es: " + result);
		
		double numberTwo = 23.089675;
		double resultTwo = Math.round(numberTwo);
		System.out.println("El redondeo numerico de " + numberTwo + " es: " + resultTwo);
		
		double base = 2;
		double exponente = 3;
		double resultThree = Math.pow(base, exponente);
		System.out.println("Al elevar " + base + " a la " + exponente +" obtenemos: " + resultThree);
	}

}
