package revisao1be;

import java.util.Scanner;

public class ChatAmor3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Você é legal?? (s / n)");
		String resposta = ler.next();

		if (resposta.equals("s")) {
			System.out.println("Você merece um bombom! <3");
		} else if (resposta.equals("n")) {
			System.out.println("Todo mundo tem seus dias...");
		} else {
			System.out.println("Digito errado");
		}
		ler.close();
	}

}
