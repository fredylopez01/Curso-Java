package co.edu.uptc.EstructuraPrincipales;

import javax.swing.JOptionPane;

public class E06While {

	public static void main(String[] args) {
		String pasword = "1234";
		String pass = JOptionPane.showInputDialog("Ingrese la contraseña");
		while(!pasword.equals(pass)) {
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
			pass = JOptionPane.showInputDialog("Ingrese de nuevo la contraseña");
		} 
		JOptionPane.showMessageDialog(null, "Bienvenido");
		
		int number = (int)(Math.random()*100);
		int intentos = 0;
		int sorting = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
		while(number != sorting) {
			intentos++;
			if(sorting<number) {
				JOptionPane.showMessageDialog(null, "Más alto");
			} else if(sorting>number) {
				JOptionPane.showMessageDialog(null, "Más bajo");
			}
			sorting = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
		} 
		JOptionPane.showMessageDialog(null, "Lo has conseguido en " + intentos + " intentos");
		
		int numberTwo = (int)(Math.random()*100);
		int intentosTwo = 0;
		int sortingTwo = 0;
		do{
			sortingTwo = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
			intentosTwo++;
			if(sortingTwo<numberTwo) {
				JOptionPane.showMessageDialog(null, "Más alto");
			} else if(sortingTwo>numberTwo) {
				JOptionPane.showMessageDialog(null, "Más bajo");
			}
		} while(numberTwo != sortingTwo);
		JOptionPane.showMessageDialog(null, "Lo has conseguido en " + intentosTwo + " intentos");
	}

}
