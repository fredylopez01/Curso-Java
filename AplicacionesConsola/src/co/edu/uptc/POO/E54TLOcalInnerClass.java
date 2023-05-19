package co.edu.uptc.POO;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class E54TLOcalInnerClass {

	public static void main(String[] args) {
		WatchTwo myWatch = new WatchTwo();
		myWatch.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		System.exit(0);

	}
	
}
	
	class WatchTwo{
		
		public void enMarcha(int intervalo, boolean sonido) {
			
			class DameHora2 implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					Date ahora = new Date();
					JOptionPane.showMessageDialog(null, "Fecha: " + ahora);
					if(sonido) {
						Toolkit.getDefaultToolkit().beep();
					}
				}
			}
			
			ActionListener oyente = new DameHora2();
			Timer miTemporizador = new Timer(intervalo, oyente);
			miTemporizador.start();
		}
		
}
