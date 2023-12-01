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
//Se quita el for para que la acción se ejecute indefinidamente y no solo un periodo determinado
//		for(int i = 1; i <=3000; i++) {
//Mientras el hilo no sea interrumpido se ejecutara esta acción
		while(!Thread.interrupted()) {
			pelota.mueve_pelota(component.getBounds());
			component.paint(component.getGraphics());
//Se comenta el try y no se utiliza el método sleep ya que con este no se puede interrumpir el hilo
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
//				e.printStackTrace();
//				System.out.println(e.getMessage());
				Thread.currentThread().interrupt();
			}
		}
	}

}
