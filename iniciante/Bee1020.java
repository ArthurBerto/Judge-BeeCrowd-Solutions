package iniciante;

import java.util.Scanner;

public class Bee1020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ano = N / 365;
		int resto = N % 365;
		
		int mes = resto / 30;
		resto = resto % 30;
		
		int dia = resto;
		
		System.out.println(String.format("%d anos (s)", ano));
		System.out.println(String.format("%d mes (s)", mes));
		System.out.println(String.format("%d dia (s)", dia));
		
		sc.close();
		
	}

}
