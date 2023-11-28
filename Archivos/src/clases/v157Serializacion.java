package clases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class v157Serializacion {
	private Manager jefe;
	private Employee[] personal;
	String ruta;
	
	public v157Serializacion() {
		jefe = new Manager("Juan", 800000, LocalDate.of(2005, 12, 15));
		jefe.setIncentivo(5000);
		personal = new Employee[3];
		personal[0] = jefe;
		personal[1] = new Employee("Anita", 25000, LocalDate.of(2008, 10, 1));
		personal[2] = new Employee("Luis", 18000, LocalDate.of(2012, 9, 15));
		ruta = "C:\\Users\\Lenovo\\OneDrive\\Escritorio\\Programacion\\repositorios\\PildorasInformaticasJava\\Archivos\\src\\clases\\employee.dat";
	}

	public static void main(String[] args) {
		v157Serializacion test = new v157Serializacion();
		test.escribirFichero();
		test.leerFichero();
	}
	
	//Este mmetodo escribe un fichero que tendra o guardara toda la informacion de los objetos
	public void escribirFichero() {
		try {
			ObjectOutputStream escribirFichero = new ObjectOutputStream(new FileOutputStream(ruta));
			escribirFichero.writeObject(personal);
			System.out.println("Informacion gurdada correctamente");
			escribirFichero.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Este metoddo busca un fichero donde nosostros ledigamos y recupera lo que hay en el el, en este caso el array de objetos
	public void leerFichero() {
		try {
			ObjectInputStream recuperarFichero = new ObjectInputStream(new FileInputStream(ruta));
			
			Employee[] empleadosGuardados = (Employee[]) recuperarFichero.readObject();
			for(Employee i : empleadosGuardados) {
				System.out.println(i);
			}
			recuperarFichero.close();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}


class Employee  implements Serializable {
	private String name;
	private double salary;
	private LocalDate engagementDate;
	
	
	public Employee(String name, double salary, LocalDate engagementDate) {
		this.name = name;
		this.salary = salary;
		this.engagementDate = engagementDate;
	}
	
	public void upSalary(double amount) {
		salary += amount;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", engagementDate=" + engagementDate + "]";
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public LocalDate getEngagementDate() {
		return engagementDate;
	}


	public void setEngagementDate(LocalDate engagementDate) {
		this.engagementDate = engagementDate;
	}
	
	
}

class Manager extends Employee {
	private double incentivo;

	public Manager(String name, double salary, LocalDate engagementDate) {
		super(name, salary, engagementDate);
		incentivo = 0;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return  super.toString() + "Manager [incentivo=" + incentivo + "]";
	}
	
}
