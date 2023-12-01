package threads4;

public class SincronizacionThreads {
	
	public static void main(String[] args) {
		HilosVarios hilo1 = new HilosVarios();
		HilosVariosTwo hilo2 = new HilosVariosTwo(hilo1);
		hilo2.start();
		hilo1.start();
		System.out.println("Tareas terminadas");
	}
}
