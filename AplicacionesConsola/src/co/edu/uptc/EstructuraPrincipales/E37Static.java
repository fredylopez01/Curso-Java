package co.edu.uptc.EstructuraPrincipales;

import co.edu.uptc.POO.E45Empleado;

public class E37Static {
	E45Empleado[] empleados = new E45Empleado[10];
	
	public E37Static() {
		empleados[0] = new E45Empleado("Carlos");
		empleados[1] = new E45Empleado("Maria");
	}

	public static void main (String [] args) {
		E37Static empresa = new E37Static();
		empresa.run();
	}
	
	public void run() {
		for(E45Empleado a: empleados) {
			if(a != null) {
				System.out.println("El emplado: " + a.getName() + " con identificacion: " + a.getId() 
						+ " en la dependencia : " + a.getDependency());
			}
		}
		System.out.println(E45Empleado.idSiguiente());
	}
	
}

class Empleado1{
	private final String name;
	private String dependency;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleado1(String name) {
		this.name = name;
		dependency = "Administración";
		id = idSiguiente;
		idSiguiente += 200; 
	}
	
	public static String idSiguiente() {
		return "El siguiiiente id sera: " + idSiguiente;
	}

	public String getDependency() {
		return dependency;
	}

	public void setDependency(String dependency) {
		this.dependency = dependency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
}
