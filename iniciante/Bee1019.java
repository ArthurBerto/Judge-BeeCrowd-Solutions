package iniciante;

import java.util.Scanner;

/*

QUESTÃO
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

ENTRADA
O arquivo de entrada contém um valor inteiro N.

SAÍDA
Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
horas:minutos:segundos, conforme exemplo fornecido.

*/

public class Bee1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int horas = N / 3600;
		int resto = N % 3600;
		
		int minutos = resto / 60;
		resto = resto % 60;
		
		int segundos = resto;
		
		System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));
		
		sc.close();

	}

}
