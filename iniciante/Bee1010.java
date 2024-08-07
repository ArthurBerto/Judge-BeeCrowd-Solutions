package iniciante;

import java.util.Scanner;

/*

QUESTÃO
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de 
peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o 
valor a ser pago.

ENTRADA
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 
valores, respectivamente dois inteiros e um valor com 2 casas decimais.

SAÍDA
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, 
lembrando de deixar um espaço após os dois pontos e um espaço após 
o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

*/

public class Bee1010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, n1, cod2, n2;
		double valor1, valor2, total;
		
		cod1 = sc.nextInt();
		n1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		n2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = (n1 * valor1) + (n2 * valor2);
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
		
		sc.close();

	}

}
