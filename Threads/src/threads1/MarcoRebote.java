package threads1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoRebote extends JFrame {
	private static final long serialVersionUID = 1L;
	private LaminaPelota lamina;
	private Thread threadTest1, threadTest2, threadTest3;
	private JButton btn1, btn2, btn3;
	private JButton stop1, stop2, stop3;
	
	public MarcoRebote() {
		setSize(600, 350);
		setTitle("Rebotes");
		setLocationRelativeTo(null);
		lamina = new LaminaPelota();
		add(lamina, BorderLayout.CENTER);
		JPanel laminaBotones = new JPanel();
		btn1 = new JButton("Hilo1");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comienza_el_juego(e);
			}
		});
		laminaBotones.add(btn1);
		btn2 = new JButton("Hilo2");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comienza_el_juego(e);
			}
		});
		laminaBotones.add(btn2);
		btn3 = new JButton("Hilo3");
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comienza_el_juego(e);
			}
		});
		laminaBotones.add(btn3);
		stop1 = new JButton("Detener1");
		stop1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				detener(e);
			}
		});
		laminaBotones.add(stop1);
		stop2 = new JButton("Detener2");
		stop2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				detener(e);
			}
		});
		laminaBotones.add(stop2);
		stop3 = new JButton("Detener3");
		stop3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				detener(e);
			}
		});
		laminaBotones.add(stop3);
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	
	public void comienza_el_juego(ActionEvent event) {
		Pelota pelota = new Pelota();
		lamina.add(pelota);
		Runnable r = new PelotaHilos(pelota, lamina);
		if(event.getSource().equals(btn1)) {
			threadTest1 = new Thread(r);
			threadTest1.start();
		} else if(event.getSource().equals(btn2)) {
			threadTest2 = new Thread(r);
			threadTest2.start();
		} else if(event.getSource().equals(btn3)) {
			threadTest3 = new Thread(r);
			threadTest3.start();
		}
		
	}
	
	public void detener(ActionEvent event) {
		if(event.getSource().equals(stop1)) {
			threadTest1.interrupt();
		} else if(event.getSource().equals(stop2)) {
			threadTest2.interrupt();
		} else if(event.getSource().equals(stop3)) {
			threadTest3.interrupt();
		}
	}
	
}
