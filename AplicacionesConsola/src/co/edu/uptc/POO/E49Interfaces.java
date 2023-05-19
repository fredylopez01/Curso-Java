package co.edu.uptc.POO;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class E49Interfaces {
	private E49Empleado[] empleados = new E49Empleado[6];
	
	public E49Interfaces() {
		E49Jefatura	jefeRH = new E49Jefatura("Juan", 55000, 2006, 9,29);
		jefeRH.setIncentivo(2570);
		empleados[0] = new E49Empleado("Ana", 30000, 2000, 07, 07);
		empleados[1] = new E49Empleado("Carlos", 50000, 1995, 06, 15);
		empleados[2] = new E49Empleado("Paco", 25000, 2005, 9, 25);
		empleados[3] = new E49Empleado("Antonio", 47500, 2009, 11, 9);
		empleados[4] = jefeRH;
		empleados[5] = new E49Jefatura("Maria", 95000, 1999, 05, 26);
		E49Jefatura jefaFinanzas = (E49Jefatura) empleados[5];
		jefaFinanzas.setIncentivo(55000);
	}
	
	public static void main(String [] args) {
		E49Interfaces test = new E49Interfaces();
		test.run();
	}
	
	public void run() {
		for(E49Empleado e: empleados) {
			e.uppSalary(5);
		}
		JOptionPane.showMessageDialog(null, showValues());
		Arrays.sort(empleados);
		JOptionPane.showMessageDialog(null, "\nArray Ordenado por sueldos\n" + showValues());
		E49Jefatura jefaFinanzas = (E49Jefatura) empleados[5];
		JOptionPane.showMessageDialog(null, jefaFinanzas.tomarDecisiones("dar más dias de vacaciones a los empleados") 
				+ "\nEl jef@ " + jefaFinanzas.getName() + "tiene una bonificación de: " + jefaFinanzas.estableceBonus(500)
				+ "\nEl empleado: " + empleados[3].getName() + " tiene un bonus de: " + empleados[3].estableceBonus(200));
	}
	
	public String showValues() {
		String message = "";
		for(E49Empleado e: empleados) {
			message +=  ("Nombre: " + e.getName() + " Sueldo: " + e.getSueldo() + " Fecha: " + e.getDateContrato() + "\n");
		}
		return message;
	}
	
	public E49Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(E49Empleado[] empleados) {
		this.empleados = empleados;
	}
	
}
