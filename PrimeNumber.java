import java.util.Scanner;
/**The user inputs a number the program outputs if it is a prime number.
 * 
 * @author Vedad
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int i;
		double unos;
		int razlika = 0;
		System.out
				.println("Unesite broj koji cemo ispitati je li prime number ili ne");
		unos = in.nextDouble();
		for (i = 2; i < unos; i++) {

			if (unos % i == 0) {
				razlika = 1;

			}

		}
		if (razlika == 1) {
			System.out.println("Broj nije prime number");

		} else {
			System.out.println("Broj je prime number");
		}
	}

}
