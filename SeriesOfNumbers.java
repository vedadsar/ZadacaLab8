import java.util.Scanner;

/**
 * The user inputs a series of numbers (0 for terminating) the program will
 * output the sum of all the numbers, and information on whether the numbers
 * were all positive, integers, bigger than 0 and prime.
 * 
 * @author Vedad
 *
 */
public class SeriesOfNumbers {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double unos;
		double suma = 0;
		double pozitiv = 0;
		double integer = 0;
		double bigger = 0;
		double prime = 0;
		int i;
		do {
			System.out.println("Unesite broj");
			unos = in.nextDouble();

			suma = suma + unos;

			// prime ispitivanje
			for (i = 2; i < unos; i++) {

				if (unos % i == 0) {
					prime = 1;

				}

			}

			if (unos < 0) {
				pozitiv = 1;
			}

			if (unos % 1 != 0) {
				integer = 1;
			}

			if (unos > 0 && unos < 1) {
				bigger = 1;
			}

		} while (unos != 0);

		System.out.println("Suma svih brojeva je " + suma);

		// Ispisuje da li su svi brojevi pozitivni
		if (pozitiv == 1) {
			System.out.println("Svi brojevi koje ste unijeli nisu pozitivni");
		} else {
			System.out.println("Svi brojevi koje ste unijeli su pozitivni");
		}

		// Ispisuje da li su svi brojevi integeri

		if (integer == 1) {
			System.out.println("Svi brojevi koje ste unijeli nisu integeri");
		} else {
			System.out.println("Svi brojevi koje ste unijeli su integeri");
		}

		// Ispisuje da li su svi brojevi veci od
		if (bigger == 1) {
			System.out
					.println("Svi brojevi koje ste unijeli nisu veci od nule");
		} else {
			System.out.println("Svi brojevi koje ste unijeli su veci od nule");
		}

		// Ispisuje da li su svi brojevi prime.
		if (prime == 1) {
			System.out.println("Svi brojevi nisu prime brojevi");

		} else {
			System.out.println("Svi brojevi su prime brojevi");
		}

	}

}
