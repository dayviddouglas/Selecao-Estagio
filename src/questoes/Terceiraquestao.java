package questoes;

import java.util.Scanner;

public class Terceiraquestao {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
	       double[] faturamentos = new double [5];
	       double max = faturamentos[0], min = 999999999, soma =0, media = 0;  
	      int contador = 1;
	      for(int i = 0; i < faturamentos.length;i++) {
	        	while(contador<6) {
	        		System.out.println("Faturamento:"+ contador);
	      		faturamentos[i]= usuario.nextDouble();
	                contador++;
	                soma += faturamentos[i];
	                media = soma/faturamentos.length;
	               if(faturamentos[i]> max) {
	                 	max = faturamentos[i];
	                 }
	                  else if(faturamentos[i]< min) {
	                 	min = faturamentos[i];
	                 }  
	               
	               
	         	}
	        	
	        	
	         
	         }
	        
	        
	         
	          System.out.println("O faturamento máximo foi de: " + max);
	          System.out.println("O faturamento mínimo foi de " + min);
	          System.out.println( "A média é: "+media);
	}
}
	
	


