package sockets.cliente;

import javax.swing.JFrame;

public class MarcoCliente extends JFrame {
	private static final long serialVersionUID = 1L;

	public MarcoCliente() {
		setSize(280,  350);
		setLocationRelativeTo(null);
		PanelCliente myPanel = new PanelCliente();
		add(myPanel);
		setVisible(true);
	}
}
