package revisao1be;

import java.util.Scanner;

public class QuizNerd {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Bem vindo ao quiz nerd! Responda as questões em caps lock"
				+ "\n\n1) Em Naruto, qual é o nome da técnica proibida usada por \nItachi Uchiha que prende a vítima em uma ilusão poderosa?"
				+ "\n\nA) Chidori"
				+ "\nB) Amaterasu"
				+ "\nC) Tsukuyomi"
				+ "\nD) Susanoo");
		String questaoUm = ler.next();
		
		System.out.println("Em The Legend of Zelda: Ocarina of Time, \nqual é o nome da espada conhecida por selar o mal?"
				+ "\n\nA) Espada do Tempo"
				+ "\nB) Espada Mestra"
				+ "\nC) Espada Hyliana"
				+ "\nD) Espada do Herói");
		
		String questaoDois = ler.next();
		
		System.out.println("Em Stranger Things, qual é o nome do mundo alternativo \nonde vivem criaturas como o Demogorgon e onde Eleven usa seus poderes?"
				+ "\n\nA) Upside Down"
				+ "\nB) Underworld"
				+ "\nC) Nether"
				+ "\nD) Shadow Realm");
		
		String questaoTres = ler.next();
		ler.close();
		
		String gbrtUm = "C", gbrtDois = "B", gbrtTres = "A";
		int nota = 0;
		
		if (gbrtUm.equals(questaoUm)) {
			nota++;
		}
		if (gbrtDois.equals(questaoDois)) {
			nota++;
		}
		if (gbrtTres.equals(questaoTres)) {
			nota++;
		}
		System.out.println("Sua nota foi: "+nota);
		
	}

}
