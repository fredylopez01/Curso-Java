package co.edu.uptc.POO;

import javax.swing.JOptionPane;

public class E45ClasesAbstractas {
	
	public static void main(String [] args) {
		E45Empleado employee = new E45Empleado("Carlos");
		E45Student bestStudent = new E45Student("Andrey", 50);
		JOptionPane.showMessageDialog(null, "Bienvenidos\n" + employee.Description() + "\n" + bestStudent.Description());
	}
}
