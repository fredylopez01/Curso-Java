package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class vWGraficoTorta extends JFrame{
	
	
	public static void main(String[] args) {
		MarcoGraficaTorta window = new MarcoGraficaTorta();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

class MarcoGraficaTorta extends JFrame implements ActionListener {
	private JLabel title;
	private JLabel optionOne;
	private JLabel optionTwo;
	private JLabel optionThree;
	
	public MarcoGraficaTorta() {
		setSize(400,396);
		setLocationRelativeTo(null);
		setTitle("Grafica Circular");
		
		title = new JLabel("Color favorito");
		title.setBounds(120, 10, 100, 20);
		title.setFont(new Font("Tahoma", 1, 14));
		add(title);
		
		optionOne = new JLabel();
		optionOne.setBounds(20, 160, 100, 20);
		optionOne.setFont(new Font("Tahoma", 1, 14));
		add(optionOne);
		
		optionTwo = new JLabel();
		optionTwo.setBounds(20, 190, 100, 20);
		optionTwo.setFont(new Font("Tahoma", 1, 14));
		add(optionTwo);
		
		optionThree = new JLabel();
		optionThree.setBounds(20, 210, 100, 20);
		optionThree.setFont(new Font("Tahoma", 1, 14));
		add(optionThree);
		
		
		
		LaminaGraficaTorta lamina = new LaminaGraficaTorta();
		add(lamina);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
	}
}


class LaminaGraficaTorta extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		g2.setPaint(Color.ORANGE);
		g2.fill(circulo);
		
	}
}
