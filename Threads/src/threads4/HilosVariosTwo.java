package threads4;

public class HilosVariosTwo extends Thread {
	private Thread thread;
	
	public HilosVariosTwo(Thread thread) {
		this.thread = thread;
	}
	
	@Override
	public void run() {
		try {
			thread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(int i = 0; i < 15; i++) {
			System.out.println("Ejecutando hilo" + this.getName());
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
