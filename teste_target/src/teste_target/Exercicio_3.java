package teste_target;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		double [] vetor = {22174.1664, 24537.6698, 26139.6134, 26742.6612, 42889.2258, 46251.174, 11191.4722, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 25681.8318, 1718.1221, 13220.495, 8414.61 };
        double aux = vetor[0];
        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < aux) {
                aux = vetor[i];
            }
        }
        
        System.out.println("O menor valor de faturamento no mês foi: " + aux);
        
       
        aux = 0;
        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > aux) {
                aux = vetor[i];
            }
        }
        
        System.out.println("O maior valor de faturamento no mês foi: " + aux);
        
        double media =0;
        for (int i = 1; i < vetor.length; i++) {
            	media = media + vetor[i];
            
        }
           media = media / 21; 
           int diasMaiorQueMedia = 0;
           
           for (int i = 1; i < vetor.length; i++) {
           	if (vetor[i] > media) {
           		diasMaiorQueMedia++;
           	}
           
       }
        System.out.println(diasMaiorQueMedia);
        
        
        
        
	}
	

	}


