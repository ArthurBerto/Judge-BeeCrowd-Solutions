package iniciante;

import java.util.Scanner;

/*

QUESTÃO
Calcule o consumo médio de um automóvel sendo fornecidos a distância 
total percorrida (em Km) e o total de combustível gasto (em litros).

ENTRADA
O arquivo de entrada contém dois valores: um valor inteiro X representando 
a distância total percorrida (em Km), e um valor real Y representando o 
total de combustível gasto, com um dígito após o ponto decimal.

SAÍDA
Apresente o valor que representa o consumo médio do automóvel com 3 casas 
após a vírgula, seguido da mensagem "km/l".

*/

public class Bee1014 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int distancia;
		double combustivel, total;
		
		distancia = sc.nextInt();
		combustivel = sc.nextDouble();
		
		total = distancia / combustivel;
		
		System.out.println(String.format("%.3f km/l", total));
		
		sc.close();

	}

}
