package threads4;

public class HilosVarios extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 15; i++) {
			System.out.println("Ejecutando hilo" + this.getName());
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
