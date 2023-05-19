package co.edu.uptc.POO;

public abstract class E45Person {
	private final String name;
	
	public abstract String Description();
	
	public E45Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
