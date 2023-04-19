package teste_target;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com uma string ");
		String entrada = sc.next();
		
		String saida = "";
	
		
		for (int i = entrada.length()- 1; i >= 0; i--) {
		saida = saida + entrada.charAt(i);
		}
	System.out.println(saida);
	
	sc.close();

	
	}
}
