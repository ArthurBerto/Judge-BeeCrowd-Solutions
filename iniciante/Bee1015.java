package iniciante;

import java.util.Scanner;

public class Bee1015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double resultado = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
		System.out.println(String.format("%.4f", resultado));
		
		sc.close();

	}

}
