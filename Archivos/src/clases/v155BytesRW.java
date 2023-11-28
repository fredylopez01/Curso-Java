package clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class v155BytesRW {

	public static void main(String[] args) {
		v155BytesRW test = new v155BytesRW();
		test.crearFichero();
	}
	
	public void crearFichero() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la ruta del archivo que quiere copiar");
		//C:\\Users\\Lenovo\\OneDrive\\Escritorio\\Programacion\\repositorios\\PildorasInformaticasJava\\Archivos\\src\\clases\\signDollar.jpg
		String ruta = input.nextLine();
		int numBytes = countBytes(ruta);
		int[] bytes = readBytes(numBytes, ruta);
		createFichero(bytes);
	}
	
	public int countBytes(String ruta) {
		int numBytes = 0;
		try {
			FileInputStream archivo = new FileInputStream(ruta);
			boolean finalAr = false; 
			while(!finalAr) {
				int byteIn = archivo.read();
				if(byteIn!=-1)
					numBytes++;
				else {
					finalAr = true;
				}
			}
			archivo.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return numBytes;
	}
	
	public int[] readBytes(int numBytes, String ruta) {
		int[] datosIn = new int[numBytes];
		try {
			FileInputStream archivo = new FileInputStream(ruta);
			for(int i = 0; i < numBytes; i++) {
				int byteIn = archivo.read();
				if(byteIn!=-1)
					datosIn[i] = byteIn;
			}
			archivo.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return datosIn;
	}
	
	public static void createFichero(int[] datosFichero) {
		try {
			FileOutputStream ficheroNuevo = new FileOutputStream("C:\\Users\\Lenovo\\OneDrive\\Escritorio\\Programacion\\repositorios\\PildorasInformaticasJava\\Archivos\\src\\clases\\signDollarCopia.jpg");
			for(int i = 0; i < datosFichero.length; i++) {
				ficheroNuevo.write(datosFichero[i]);
			}
			System.out.print("Fichero creado correctamente");
			ficheroNuevo.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
