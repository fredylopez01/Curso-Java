package co.edu.uptc.POO;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class E53TemporizadorInnerClass {

	public static void main(String[] args) {
		Watch myWatch = new Watch(3000, true);
		myWatch.enMarcha();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		System.exit(0);
	}
	
}

class Watch{
	private int intervalo;
	private boolean sonido;
	
	public Watch(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha() {
		ActionListener oyente = new DameHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}
	
	private class DameHora2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Date ahora = new Date();
			JOptionPane.showMessageDialog(null, "Fecha: " + ahora);
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
	
}
