package ejerciciosdowhile;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		int randomVal = 0;
		int min = 0;
		int max = 100;
		String userVal = "";
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		

		System.out.println("Voy a intentar ser una copia de Akinator, pero más simple." + "\n" +
		"Piensa en un número del 1 al 100, ¡e intentaré adivinarlo!" + "\n\n");
	
		do {
			randomVal = rd.nextInt(min, max + 1);
			System.out.println("Creo que el número en el que has pensado podría ser " + randomVal +
			"\n" + "¿Es correcto?" + "\n\n" + "Escribe: \"Mayor\" si el número que he dicho es" +
			" más pequeño que lo esperado." + "\n" + "Escribe: \"Menor\" si me he pasado o: \"Igual\" si " +
			"he acertado.");
			userVal = sc.nextLine();
			
			if(userVal.equalsIgnoreCase("Mayor")) {
				min = randomVal;
			} else if(userVal.equalsIgnoreCase("Menor")) {
				max = randomVal;
			}
		} while(!userVal.equalsIgnoreCase("Igual"));
		
		System.out.println("¡Yuju! ¡He acertado! Ahora me debes un módulo de RAM de 8 GBs.");
		
		sc.close();
	}

}
