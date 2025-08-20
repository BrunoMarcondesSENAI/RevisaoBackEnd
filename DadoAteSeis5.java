package revisao1be;

import java.util.Random;

public class DadoAteSeis5 {
	public static void main(String[] args) {
		Random dado = new Random();

		int jogada;
		do {
			jogada = dado.nextInt(6);
			jogada ++;
			System.out.println("O dado caiu com a face " + jogada + "!");

		} while (jogada != 6);
	}
}