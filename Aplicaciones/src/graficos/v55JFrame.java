package graficos;

import javax.swing.JFrame;

public class v55JFrame {
	
	public static void main(String[] args) {
		MyJFrame windowOne = new MyJFrame();
		windowOne.setVisible(true);
		windowOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MyJFrame extends JFrame{
	
	public MyJFrame() {
		setSize(500,300); 
		//setLocation(500, 300); //Position in fullScreen
		//setBounds(500,300, 550,350); //Pasa posicion x and y, ademas el tamaño ancho y alto
		//setResizable(false); //Opción de redimensionar o no
		//setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizada la ventana
		setTitle("Mi ventana"); //Titulo de la ventana
	}
}