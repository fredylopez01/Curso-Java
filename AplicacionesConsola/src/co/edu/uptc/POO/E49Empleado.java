package co.edu.uptc.POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class E49Empleado implements Comparable, E51Trabajadores{
	private String name;
	private double sueldo;
	private Date dateContrato;
	private int id;
	private static int idSiguiente = 1;
	
	public E49Empleado(String name, double sueldo, int year, int month, int day) {
		this.name = name;
		this.sueldo = sueldo;
		dateContrato = new GregorianCalendar(year, month, day).getTime();
		idSiguiente++;
		id = idSiguiente;
	}
	
	public E49Empleado(String name) {
		this(name, 30000, 2000, 01, 01);
	}
	
	public void uppSalary(double percent) {
		sueldo = sueldo*percent/100;
	}
	
	@Override
	public int compareTo(Object miObjeto) {
		E49Empleado otroEmpleado = (E49Empleado) miObjeto;
		if(this.sueldo < otroEmpleado.sueldo) {
			return -1;
		} else if(this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public double estableceBonus(double gratification) {
		return E51Trabajadores.bonusBase + gratification;
	}

	public String getName() {
		return name + " Id: " + id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getDateContrato() {
		return dateContrato;
	}

	public void setDateContrato(Date dateContrato) {
		this.dateContrato = dateContrato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
