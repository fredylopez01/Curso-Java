package co.edu.uptc.Exception;

public class Ecuacion {
	private int a;
	private int b;
	private int c;
	
	public Ecuacion(int a, int b, int c) throws ExceptionCoeficiente, ExceptionRadical {
		if(a == 0) {
			throw new ExceptionCoeficiente();
		} else if((Math.pow(b, 2) < ((4*a)*c))) {
			throw new ExceptionRadical();
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int raizOne() {
		int res = 0;
		res = (int) ((-b) + (Math.sqrt((Math.pow(b, 2)-((4*a)*c)))))/2*a;
		return res;
	}
	
	public int raizTwo() {
		int res = 0;
		res = (int) ( (-b) - (Math.sqrt((Math.pow(b, 2)-((4*a)*c)))))/2*a;
		return res;
	}
}
