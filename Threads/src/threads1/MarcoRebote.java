package threads1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoRebote extends JFrame {
	private static final long serialVersionUID = 1L;
	private LaminaPelota lamina;
	
	public MarcoRebote() {
		setSize(400, 350);
		setTitle("Rebotes");
		setLocationRelativeTo(null);
		lamina = new LaminaPelota();
		add(lamina, BorderLayout.CENTER);
		JPanel laminaBotones = new JPanel();
		ponerBoton(laminaBotones, "Dale!", new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comienza_el_juego();
			}
		});
		ponerBoton(laminaBotones, "Salir",new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);;
			}
		});
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	public void ponerBoton(Container c, String titulo, ActionListener listener) {
		JButton btn = new JButton(titulo);
		c.add(btn);
		btn.addActionListener(listener);
	}
	
	public void comienza_el_juego() {
		Pelota pelota = new Pelota();
		lamina.add(pelota);
		Runnable r = new PelotaHilos(pelota, lamina);
		Thread threadTest = new Thread(r);
		threadTest.start();
	}
	
}
