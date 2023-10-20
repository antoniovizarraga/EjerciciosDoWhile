package ejerciciosdowhile;
import java.util.Scanner;

public class Ejercicio4 {

	/* Vamos a crear un Script en el que muestre la tabla de multiplicar de un número
	 * dado por el usuario. */
	public static void main(String[] args) {
		/* Creamos e inicializamos la variable que será los múltiplos de la tabla de multiplicar
		 * y la variable en la que escribirá el usuario el número. Será una constante ya que
		 * como la tabla no va a variar a lo largo del código, aprovechamos y lo hacemos una
		 * constante. */
		final int USER_VAL;
		int i = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Imprimimos en pantalla el texto y le pedimos al usuario el valor.
		System.out.print("Introduzca el valor del que desea saber la tabla de multiplicar: ");
		USER_VAL = sc.nextInt();
		
		// Haz lo siguiente:
		do {
			// Suma 1 a la variable i.
			i++;
			// Imprime el resultado de multiplicar USER_VAL por la variable i.
			System.out.println(USER_VAL + " x " + i + " = " + (USER_VAL * i));
		} while(i < 10); /* Haz un bucle (Es decir, repite) las dos líneas de
		código que hemos mencionado anteriormente hasta que el valor sea mayor
		que 10.  */
		
		// Cierra el Scanner.
		sc.close();
	}

}
