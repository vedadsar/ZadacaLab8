import java.util.Scanner;

/**
 * Program obracunava dnevnicu,mjesecnu i godisnju platu na osnovu satnice, sati
 * i mjesecnih radnih dana
 * 
 * @author Vedad
 *
 */
public class Placa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double satnica;
		int sati;
		int radniDani;

		System.out.println("Kolika vam je satnica ?");
		satnica = in.nextDouble();
		System.out.println("Koliko sati radite dnevno ?");
		sati = in.nextInt();
		System.out.println("Koliko radnih dana mjesecno?");
		radniDani = in.nextInt();

		double dnevnica = satnica * sati;
		double mjesecnaPlata = dnevnica * radniDani;
		double godisnjaPlata = mjesecnaPlata * 12;
		System.out
				.printf("Vi zaradjujete %f KM dnevno, tj. %f KM mjesecno odnosno %f KM godisnje",
						dnevnica, mjesecnaPlata, godisnjaPlata);
	}
}
