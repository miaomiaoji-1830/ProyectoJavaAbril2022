package EjemploJava1;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ejercicio1 {
    public static void main(String[] args) {
      LocalDateTime Exuni = LocalDateTime.of(1900, 11, 12, 0, 0);
		LocalDateTime Actual = LocalDateTime.now();

		long dias = ChronoUnit.DAYS.between(Exuni, Actual);
		
		System.out.println("====DIAS DE FINALIZACION DE LA EXPOSICION UNIVERSAL DE PARIS HASTA HOY====");
		System.out.println("Han usado " + dias + " dias");
	
		LocalDateTime PGuerra = LocalDateTime.of(1914, 7, 28, 14, 00);
		LocalDateTime actual = LocalDateTime.now();
		long minuto = ChronoUnit.MINUTES.between(PGuerra, actual);

		System.out.println("\n====MINUTOS DE PRIMERA GUERRA MUNDIAL HASTA HOY====");
		System.out.println("Han usado " + minuto + " minutos");
		long transcurrimin = ChronoUnit.MINUTES.between(Exuni, PGuerra);
		long transcurrihor = ChronoUnit.HOURS.between(Exuni, PGuerra);
		
		System.out.println("\n====MINUTOS Y HORAS ENTRE DOS EVENTO====");
		System.out.println("Han usado " + transcurrimin + " minutos");
		System.out.println("Han usado " + transcurrihor + " horas");
    }
    
}
