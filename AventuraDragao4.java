package revisao1be;

import java.util.Random;

public class AventuraDragao4 {
	public static void main(String[] args) {
		Random random = new Random();

		int vida = 100;

		do {
			int dano = random.nextInt(16);
			dano += 5;
			vida -= dano;
			System.out.println("O dragão te atacou! (" + dano + ") Sua vida agora é: " + vida);

		} while (vida != 0 || vida < 0);
	}

}
