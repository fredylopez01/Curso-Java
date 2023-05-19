package co.edu.uptc.POO;

public class E49Jefatura extends E49Empleado implements E50Jefes{
	private double incentivo;

	public E49Jefatura(String name, double sueldo, int year, int month, int day) {
		super(name, sueldo, year, month, day);
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo()+incentivo;
	}
	
	@Override
	public String tomarDecisiones(String decision) {
		return "El jef@ " + getName() +  " ha tomado la desicion de: " + decision;
	}

	@Override
	public double estableceBonus(double gratification) {
		double prima = 2000;
		return E51Trabajadores.bonusBase + gratification + prima;
	}
	
}
