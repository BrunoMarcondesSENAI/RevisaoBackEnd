package revisao1be;

import java.util.Scanner;

public class jogoDoXp1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe seu XP: ");
		int XP = ler.nextInt();

		String msg;
		if (XP <= 100) {
			msg = "Noob";
		} else if (XP <= 500) {
			msg = "Aprendiz";
		} else if (XP <= 1000) {
			msg = "Pro";
		} else {
			msg = "Lendário";
		}
		System.out.println("Seu nível é: " + msg);
		ler.close();
	}

}
