import java.util.Scanner;
/** Program trazi od korisnika da unese
 * 
 * @author Vedad
 *
 */
public class SumProductetc {
	public static void main(String[] args) {
		double a;
		double b;

		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Unesite dva broja");
			a = in.nextDouble();
			b = in.nextDouble();
			if (b == 0 && a == 0) {
				System.out.println("Unijeli ste nule, kraj programa. Cao :) ");
				return;
			}
			System.out.printf("Suma %f Proizvod %f modul %f \n", a + b, a * b, a
					% b);
		} while (a != 0 && b != 0);

	}
}