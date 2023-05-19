package co.edu.uptc.POO;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class E52TestTemporizador {

	public static void main(String[] args) {
		DameHora oyente = new DameHora();
		//polimorfismo
		//ActionListener oyente = new DameHora();
		Timer mitemporizador = new Timer(5000, oyente);
		mitemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		System.exit(0);
	}
	
}

class DameHora implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		JOptionPane.showMessageDialog(null, "Fecha: " + ahora);
		Toolkit.getDefaultToolkit().beep();
	}
	
	
}