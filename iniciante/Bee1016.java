package iniciante;

import java.util.Scanner;

/*

QUESTÃO
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade 
constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do 
carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y 
tomar essa distância do outro carro.

ENTRADA
O arquivo de entrada contém um número inteiro.

SAÍDA
Imprima o tempo necessário seguido da mensagem "minutos".

*/

public class Bee1016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		int min = (60 * km) / 30;
		System.out.println(min + " minutos");
		
		sc.close();

	}

}
