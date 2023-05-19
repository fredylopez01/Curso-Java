package co.edu.uptc.POO;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class TestLocalDate {
	public static void main(String [] args) {
		LocalDate dateOne = LocalDate.now();
		LocalDate dateTwo = LocalDate.parse("2022-03-01");
		dateTwo = dateTwo.plusDays(8);
		dateTwo = dateTwo.plusYears(3);
		dateOne = dateOne.minusDays(2);
		dateOne = dateOne.minusYears(2);
		
		JOptionPane.showMessageDialog(null,"Fecha Actual: " + dateOne + "\nNacimiento de Pepito: " + dateTwo 
				                  			+ "\n Tiempo transcurrido entre las fechas: " + ChronoUnit.YEARS.between(dateOne, dateTwo) + " años");
		
		
		if(dateOne.isAfter(dateTwo)) {
			JOptionPane.showMessageDialog(null, "Fecha actual es mayor al nacimiento de Pepito");
		}
		
		if(dateOne.isBefore(dateTwo)) {
			JOptionPane.showMessageDialog(null, "Fecha actual es menor al nacimiento de Pepito");
		}
		
		//Other Video
		//Class
		// Fecha sin hora: LocalDate
		// Hora sin Fecha: LocalTime
		// Combinación: LOcalDateTime
		//Instant- Desde 01/01/1970 a las 00:00
		//Period-diferencia entre difentes fechas
		//Duration- Diferencia entre horas
		
		//Methods
		//now()-hora y fecha actual
		//of()-consturye una fecha segun las partes
		//with()-Modifica la hora o fecha dependiendo del parametro que se le pase
		
		String message = "Fecha actual: " + LocalDate.now() + "\nHora Actual: " + LocalTime.now()
		+ "\nFecha y hora Actual: " + LocalDateTime.now() + "\nMomento Actual: " + Instant.now();
		
		JOptionPane.showMessageDialog(null, message);
		
		//Uso de of
		String messageTwo = "Fecha de mi cumpleaños: " + LocalDate.of(2003, Month.MARCH, 30) 
						+ "\nHora: " + LocalTime.of(10, 40);
		LocalDate endYear = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
		Period hastaEndYear = LocalDate.now().until(endYear);
		
		JOptionPane.showMessageDialog(null, messageTwo + "\nFaltan " + hastaEndYear + " para terminar el año");
		
	}
}
