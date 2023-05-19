package co.edu.uptc.EstructuraPrincipales;

public class E03ConstantesyOperadores {

	public static void main(String[] args) {
		
		final double PI = 3.1416;
		final double PULGADAS = 2.54;
		double cm = 6;
		double result = cm/PULGADAS;
		System.out.println("En " + cm + "cm hay " + result +" pulgadas");
		
		int a=5;
		int b;
		b=7;
		int c = b+a;
		c++;
		c-=6;
		System.out.print(c);
	}

}
