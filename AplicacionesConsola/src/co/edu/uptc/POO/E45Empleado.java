package co.edu.uptc.POO;

public class E45Empleado extends E45Person{
	private String dependency;
	private int id;
	private static int idSiguiente = 1;
	
	public E45Empleado(String name) {
		super(name);
		dependency = "Administración";
		id = idSiguiente;
		idSiguiente += 200; 
	}
	
	@Override
	public String Description() {
		return "El emplado: " + getName() + " con identificacion: " + id + " en la dependencia : " + dependency;
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

}
