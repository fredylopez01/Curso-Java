package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class v152Leer {

	public static void main(String[] args) {
		v152Leer leerFicheroTest = new v152Leer();
		leerFicheroTest.read();

	}
	
	public void countBytes() {
		try {
			FileReader entrada = new FileReader("C:/Users/Lenovo/OneDrive/Escritorio/Programacion/repositorios/PildorasInformaticasJava/Archivos/src/clases/documento.txt");
			boolean isEnd = false;
			int acount = 0;
			while(!isEnd) {
				if(entrada.read()!= -1)
					acount++;
				else
					isEnd = true;
			}
			System.out.println(acount);
			entrada.close();
		} catch (IOException e) {
			System.out.println(e.getMessage() + "No se ha encontrado el archivo");
		}
	}
	
	public void readBytes() {
		try {
			FileReader entrada = new FileReader("C:/Users/Lenovo/OneDrive/Escritorio/Programacion/repositorios/PildorasInformaticasJava/Archivos/src/clases/documento.txt");
			boolean isEnd = false;
			int bytes;
			while(!isEnd) {
				bytes = entrada.read();
				if(bytes != -1)
					System.out.println(bytes);
				else
					isEnd = true;
			}
			entrada.close();
		} catch (IOException e) {
			System.out.println(e.getMessage() + "No se ha encontrado el archivo");
		}
	}
	
	public void readText() {
		try {
			FileReader entrada = new FileReader("C:/Users/Lenovo/OneDrive/Escritorio/Programacion/repositorios/PildorasInformaticasJava/Archivos/src/clases/documento.txt");
			int bytes;
			StringBuilder phrase = new StringBuilder();
			do {
				bytes = entrada.read();
				phrase.append((char)bytes);
			} while(bytes != -1);
			System.out.println(phrase);
			entrada.close();
		} catch (IOException e) {
			System.out.println(e.getMessage() + "No se ha encontrado el archivo");
		}
	}
	
	public void read() {
		try {
			FileReader entrada = new FileReader("C:/Users/Lenovo/OneDrive/Escritorio/Programacion/repositorios/PildorasInformaticasJava/Archivos/src/clases/documento.txt");
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			StringBuilder total = new StringBuilder();
			String linea = "";
			while(linea != null) {
				linea = miBuffer.readLine();
				if(linea!=null) {
					total.append(linea + "\n");
//					System.out.println(linea); // Esta linea de codigo lee la linea del archivo
				}
			}
			System.out.println(total.toString());
			entrada.close();
		} catch (IOException e) {
			System.out.println(e.getMessage() + "No se ha encontrado el archivo");
		}
	}
}