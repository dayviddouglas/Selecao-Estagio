package questoes;

import java.util.Scanner;

public class Quintaquestao {
   public static void main(String[] args) {
	   Scanner usuario = new Scanner(System.in);
		  System.out.println("Digite uma frase...");
		  String frase = usuario.next();
		  int tamanho = frase.length();
		  for(int contador = tamanho -1;contador >=0; contador--) {
			  char caracteresDaFrase = frase.charAt(contador); 
			  System.out.println(caracteresDaFrase);
		  }
}
}
