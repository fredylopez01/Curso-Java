package threads1;

import java.awt.Component;

public class PelotaHilos implements Runnable {
	private Pelota pelota;
	private Component component;
	
	public PelotaHilos(Pelota unaPelota, Component uComponent) {
		this.pelota = unaPelota;
		this.component = uComponent;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <=3000; i++) {
			pelota.mueve_pelota(component.getBounds());
			component.paint(component.getGraphics());
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}

}
