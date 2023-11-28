package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class v59Dibujos {
	public static void main(String[] args) {
		MarcoDibujos window = new MarcoDibujos();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoDibujos extends JFrame{
	
	public MarcoDibujos() {
		setSize(500,300);
		setLocationRelativeTo(null);
		setTitle("Prueba de Dibujo");
		add(new LaminaFiguras());
	}
	
}

class LaminaFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 200, 150);
		g.drawRect(80, 80, 200, 150);
		g.drawLine(50, 50, 80, 80);
		g.drawLine(250, 50, 280,80);
		g.drawLine(250, 200, 280,230);
		g.drawLine(50, 200, 80, 230);
		g.drawArc(300, 100, 120, 120, 90, 360);
	}
	
}