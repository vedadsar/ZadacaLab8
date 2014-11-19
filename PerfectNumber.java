import java.util.Scanner;

/**
 * Output if a given number is perfect (it is equal to the sum of its divisors)
 * 
 * @author Vedad
 *
 */

public class PerfectNumber {
	public static void main(String[] args) {
		int broj;
		System.out.println("unesite broj");
		Scanner in = new Scanner(System.in);
		broj = in.nextInt();

		int zbir = 0;

		for (int i = 1; i < broj; i++) {
			if (broj % i == 0) {
				zbir = zbir + i;
			}
		}
		if (zbir == broj) {
			System.out.println("Broj je perfektan");
		} else {
			System.out.println("Broj nije perfektan");
		}
	}
}
