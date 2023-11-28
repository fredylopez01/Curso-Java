package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class v61Colors {

	public static void main(String[] args) {
		MarcoColors window = new MarcoColors();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoColors extends JFrame{
	
	public MarcoColors() {
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("Prueba de Dibujo");
		LaminaColor lamina = new LaminaColor();
		lamina.setBackground(SystemColor.window);
		add(lamina);
	}
	
}

class LaminaColor extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangle = new Rectangle2D.Double(100, 50, 200, 150);
		g2.setPaint(Color.BLACK);
		g2.draw(rectangle);
		g2.setPaint(Color.GREEN.darker());
		g2.fill(rectangle);
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrame(rectangle);
		g2.setPaint(Color.ORANGE);
		g2.fill(circulo);
		
		
	}
}