package revisao1be;

import java.util.Random;

public class LutasPersonagens {
	public static void main(String[] args) {
		int vidaP1 = 100, vidaP2 = 100;
		Random random = new Random();
		int dano1 = 0, dano2 = 0;

		System.out.println("BATALHA DE ROBÔS!");

		do {

			dano1 = random.nextInt(41);
			vidaP1 -= dano1;
			System.out.println("Personagem 1 levou " + dano1 + " de dano!\n VIDA: " + vidaP1 + "\n");

			if (vidaP1 <= 0)
				break;

			dano2 = random.nextInt(41);
			vidaP2 -= dano2;
			System.out.println("Personagem 2 levou " + dano1 + " de dano!\n VIDA: " + vidaP2 + "\n");

			if (vidaP2 < -0)
				break;

		} while (vidaP2 > 0 && vidaP1 > 0);

		String mensagem = vidaP1 > 0 ? "O vencedor foi o Personagem 1!!" : "O vencedor foi o personagem 2!!";
		System.out.println(mensagem);
		System.out.println("Vida Personagem 1: " + vidaP1 + " / Vida Personagem 2: " + vidaP2);
	}

}
