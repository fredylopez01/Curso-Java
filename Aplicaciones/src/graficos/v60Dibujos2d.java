package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class v60Dibujos2d {

	public static void main(String[] args) {
		MarcoDibujos2d window = new MarcoDibujos2d();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoDibujos2d extends JFrame{
	
	public MarcoDibujos2d() {
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("Prueba de Dibujo");
		add(new LaminaFiguras2d());
	}
	
}

class LaminaFiguras2d extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangle = new Rectangle2D.Double(100, 50, 200, 150);
		g2.draw(rectangle);
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrame(rectangle);
		g2.draw(circulo);
		g2.draw(new Line2D.Double(100, 50, 300, 200));
		Ellipse2D circulo2 = new Ellipse2D.Double();
		circulo2.setFrameFromCenter(rectangle.getCenterX(), rectangle.getCenterY(), rectangle.getCenterX()+rectangle.getHeight(), rectangle.getCenterY()+rectangle.getHeight());
		g2.draw(circulo2);
	}
}
