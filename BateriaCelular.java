package revisao1be;

public class BateriaCelular {
	public static void main(String[] args) {

		int minutos = 0;

		int bateria = 100;

		do {
			bateria -= 7;
			minutos++;
		} while (bateria > 0);
		System.out.println("o TikTok gastou 100% da bateria! Sua bateria durou " + minutos + " minutos!");
	}

}