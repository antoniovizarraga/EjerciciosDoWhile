package ejerciciosdowhile;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int i = 0, userVal = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor entero: ");
		userVal = sc.nextInt();
		
		userVal--;
		
		do {
			System.out.print(++i + "+");
			if(i == userVal) {
				System.out.print(++i);
			}
		} while(i < userVal);
		
		sc.close();
	}

}
