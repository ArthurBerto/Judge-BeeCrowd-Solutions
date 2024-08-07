package iniciante;

import java.util.Scanner;

/*

QUESTÃO
Escreva um programa que leia o número de um funcionário, seu número de 
horas trabalhadas, o valor que recebe por hora e calcula o salário 
desse funcionário. A seguir, mostre o número e o salário do funcionário, 
com duas casas decimais.

ENTRADA
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas 
decimais, representando o número, quantidade de horas trabalhadas e o valor 
que o funcionário recebe por hora trabalhada, respectivamente.

SAÍDA
Imprima o número e o salário do funcionário, conforme exemplo fornecido, 
com um espaço em branco antes e depois da igualdade. No caso do salário, 
também deve haver um espaço em branco após o $.

*/

public class Bee1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double recebePorHora, salario;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		recebePorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * recebePorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.println(String.format("SALARY = U$ %.2f", salario));
		
		sc.close();

	}

}
