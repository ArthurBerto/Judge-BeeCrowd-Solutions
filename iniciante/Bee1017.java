package iniciante;

import java.util.Scanner;

public class Bee1017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tempo, velocidade;
		double combustivel;
		
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		combustivel = (double) (tempo * velocidade) / 12;
		System.out.println(String.format("%.3f", combustivel));
		
		sc.close();

	}

}
