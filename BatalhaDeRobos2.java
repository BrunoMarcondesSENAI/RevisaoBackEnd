package revisao1be;

import java.util.Random;
import java.util.Scanner;

public class BatalhaDeRobos2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		int PlcAdv = 0, PlcJgd = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe sua força! (até 1000)");
			int forcaJogador = ler.nextInt();

			int forcaPC = random.nextInt();

			if (forcaJogador < forcaPC) {
				System.out.println("O adversário ganhou o round!");
				PlcAdv++;
			} else if (forcaJogador == forcaPC) {
				System.out.println("Houve um empate!");
			} else {
				System.out.println("Você ganhou o round!");
				PlcJgd++;
			}

		}
		System.out.println("O placar final foi: " + PlcJgd + " a " + PlcAdv);
		ler.close();
	}

}
