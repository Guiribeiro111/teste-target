package teste_target;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int sequencia[] = new int[30];
		int soma = 0;
		int anterior = 1;
		int proximo;

		for (int i = 0; i < 30; i++) {

			sequencia[i] = soma;
			proximo = soma;
			soma = soma + anterior;
			anterior = proximo;

		}

		System.out.println("entre com um valor: ");
		int valor = sc.nextInt();
		String pertence = "Não";
		int i = 0, limite = 30;
		   do {
			   
			   
			if (valor == sequencia[i]) {
				pertence = "Sim";
				break;				
			}
				
			i++;
			
		} while ( i < limite);

		   
			   System.out.println("Pertence Fibonacci? : " + pertence );

		   
		sc.close();
	}
}

