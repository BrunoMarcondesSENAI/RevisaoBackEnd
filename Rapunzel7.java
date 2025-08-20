package revisao1be;

import java.util.Random;
import java.util.Scanner;

public class Rapunzel7 {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner ler = new Scanner(System.in);
		int estouDegrau = 0;

		int degrauRapunzel = random.nextInt(101);

		do {
			System.out.println("Suba a escada até encontrar a Rapunzel! (digite 1)");
			int subirDegrau = ler.nextInt();

			if (subirDegrau != 0) {
				estouDegrau++;
			}

			if (estouDegrau == degrauRapunzel) {
				System.out.println("Aeee encontrou a Rapunzel! Você subiu: " + degrauRapunzel + " degraus!");
			} else {
				System.out.println("Ainda não encontraste a Rapunzel :(");
			}

		} while (estouDegrau != degrauRapunzel);
		ler.close();
	}

}