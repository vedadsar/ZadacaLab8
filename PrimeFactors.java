import java.util.Scanner;

/**
 * A program which will output a given number’s prime factors.
 * 
 * @author Vedad
 *
 */
public class PrimeFactors {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int unos;
		System.out.println("Unesite broj");
		unos = in.nextInt();
		int brojac2 = 0;
		int brojac3 = 0;
		int djeljenje2 = unos;
		int djeljenje3;

		while (unos % 2 == 0) {
			unos = unos / 2;
			brojac2 = brojac2 + 1;
		}
		while (unos % 3 == 0) {
			unos = unos / 3;
			brojac3 = brojac3 + 1;
		}
		System.out.println(brojac2 +" " +brojac3 +" " +unos);
	}
}
