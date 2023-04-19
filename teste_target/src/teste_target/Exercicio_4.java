package teste_target;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 double sp = 67.83643;
		 double rj = 36.67866;
		 double mg = 29.22988;
		 double es = 27.16548;
		 double outros = 19.84953;
		 
		 double total = sp + rj + mg + es + outros;
		 System.out.println(total);
		 
		 double psp = ((sp/total)*100);
		 double prj = ((rj/total)*100);
		 double pmg = ((mg/total)*100);
		 double pes = ((es/total)*100);
		 double poutros = ((outros/total)*100);
		 
		 System.out.println("porcentagem de sp : " + psp);
		 System.out.println("porcentagem de rj : " + prj);
		 System.out.println("porcentagem de mg : " + pmg);
		 System.out.println("porcentagem de es : " + pes);
		 System.out.println("porcentagem de outros : " + poutros);
		 
		 sc.close();
		 
		
	}

}
