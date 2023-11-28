package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class v57JFrame2 {
	public static void main(String[] args) {
		MarcoCentrado windowOne = new MarcoCentrado();
		windowOne.setSize(550,350);
		windowOne.setVisible(true);
		windowOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension size = miPantalla.getScreenSize(); //Dimensiones de la pantalla donde se ejecuta
		int height = size.height; //Altura de la pantalla
		int widht = size.width; //Ancho de la pantalla
		setSize(widht/2, height/2); //Tamaño de la ventana
		setLocation(widht/4, height/4); //Posicionamiento en la pantalla
		setTitle("Marco Centrado");
		Image myIcon = miPantalla.getImage("src/images/NASA.gif"); //Traer una imagen
		setIconImage(myIcon); //Ponerla como icono de la ventana
	}
}