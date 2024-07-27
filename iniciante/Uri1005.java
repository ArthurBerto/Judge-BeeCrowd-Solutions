package iniciante;

import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		media = ((nota1 * 3.5) + (nota2 * 7.5)) / (3.5 + 7.5);
		System.out.println(String.format("MEDIA = %.4f", media));
		
		sc.close();

	}

}
