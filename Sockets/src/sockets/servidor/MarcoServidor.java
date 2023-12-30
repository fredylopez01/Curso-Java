package sockets.servidor;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MarcoServidor extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextArea areaTexto;
	
	public MarcoServidor() {
		setTitle("Servidor");
		setSize(400, 350);
		JPanel myPanel = new JPanel();
		myPanel.setLayout(new BorderLayout());
		
		areaTexto = new JTextArea();
		myPanel.add(areaTexto, BorderLayout.CENTER);
		add(myPanel);
		setLocation(800, 150);
		setVisible(true);
	}
	
}
