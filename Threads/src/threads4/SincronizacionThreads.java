package threads4;

public class SincronizacionThreads {
	
	public static void main(String[] args) {
		HilosVarios hilo1 = new HilosVarios();
		HilosVarios hilo2 = new HilosVarios();
		hilo1.start();
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hilo2.start();
	}
}
