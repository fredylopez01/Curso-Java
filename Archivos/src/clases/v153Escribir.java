package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class v153Escribir {

	public static void main(String[] args) {
		v153Escribir escribirTest = new v153Escribir();
		escribirTest.write();
	}
	
	public void write() {
		String phrase = "Esto es una prueba de escritura2\n";
		
		try {
			//Le dice donde esta el archivo y el true le dice que le agregue la Frase
			FileWriter escritura = new FileWriter("C:/Users/Lenovo/OneDrive/Escritorio/Programacion/repositorios/PildorasInformaticasJava/Archivos/src/clases/documento.txt", true);
			for(int i = 0; i<phrase.length(); i++) {
				escritura.write(phrase.charAt(i));
			}
			escritura.close();
			System.out.println("Documento escrito correctamento");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}