package co.edu.uptc.Exception;

public class test {
	public static void main(String[] args) {
		Ecuacion ecuacionTest;
		int resultOne = 0;
		int resultTwo = 0;
		
		try {
			ecuacionTest = new Ecuacion(7,8,2);
			resultOne = ecuacionTest.raizOne();
			resultTwo = ecuacionTest.raizTwo();
		} catch (ExceptionCoeficiente e) {
			System.out.println("Error : " + e.getMessage());
		} catch (ExceptionRadical e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Raiz 1: " + resultOne);
		System.out.println("Raiz 2: " + resultTwo);
	}
	
}
