package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class v58Escribir {
	public static void main(String[] args) {
		MarcoconTexto window = new MarcoconTexto();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoconTexto extends JFrame{
	
	public MarcoconTexto() {
		setSize(600, 400);
		setLocationRelativeTo(null);
		setTitle("Ventana con texto");
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); //llama a ese metodo para que haga su trbajo y luego haga lo que yo le digo
		g.drawString("I´m learning swing", 250, 25); //dibuja el texto
	}
} 