package sockets.cliente;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCliente extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel lblTitle;
	private JTextField message;
	private JButton btnSubmit;
	
	public PanelCliente() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		lblTitle = new JLabel("CLIENTE");
		add(lblTitle, gbc);
		
		message = new JTextField(15);
		gbc.gridy = 1;
		add(message, gbc);
		
		btnSubmit = new JButton("Enviar");
		gbc.gridy = 2;
		add(btnSubmit, gbc);
	}

}
