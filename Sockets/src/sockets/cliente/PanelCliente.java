package sockets.cliente;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

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
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try (Socket mySocket = new Socket("192.168.45.168", 9999)) {
					DataOutputStream flujoSalida = new DataOutputStream(mySocket.getOutputStream());
					flujoSalida.writeUTF(message.getText());
					flujoSalida.close();
				} catch (UnknownHostException e1) {
					System.out.println(e1.getMessage());
					e1.printStackTrace();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
					e1.printStackTrace();
				}
			}
		});
		gbc.gridy = 2;
		add(btnSubmit, gbc);
	}

}
