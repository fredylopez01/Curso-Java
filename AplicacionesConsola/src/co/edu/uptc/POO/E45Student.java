package co.edu.uptc.POO;

public class E45Student extends E45Person{
	public int code;
	public static int FollowCode = 200;
	private int grade;

	public E45Student(String name, int grade) {
		super(name);
		code = FollowCode;
		FollowCode +=1;
		this.grade = grade;
	}
	
	@Override
	public String Description() {
		return "El estudiante: "+ getName()+ " identifocado con codigo: " + code + " tiene una nota de: " + grade;
	}
}
