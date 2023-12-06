package threads6;

public class EjecucionTransferencias implements Runnable {
	private Banco b;
	private int de;
	private double max;
	
	public EjecucionTransferencias(Banco b, int de, double max) {
		this.b = b;
		this.de = de;
		this.max = max;
	}
	
	public void run() {
		while(true) {
			int para = (int)(100*Math.random());
			double cantidad = max*Math.random();
			b.transferencia(de, para, cantidad);
			try {
				Thread.sleep((int)(Math.random()*10));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
