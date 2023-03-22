package Quartaquestao;

public class Resolucao {

	public static void main(String[] args){
      
	
        

   
     
		double soma = 0;
		Regioes regioes [] = new Regioes [5];
		Regioes regiao1 = new Regioes("SP",6783643);
        Regioes regiao2 = new Regioes("RJ",3667866);
        Regioes regiao3 = new Regioes("MG",2922988);
        Regioes regiao4 = new Regioes("ES",2716548);
        Regioes regiao5 = new Regioes("Outros",1984953);
         regioes[0] = regiao1;
         regioes[1] = regiao2;
         regioes[2] = regiao3;
         regioes[3] = regiao4;
         regioes[4] = regiao5;
         for (int i = 0; i < regioes.length;i++) {
        	 soma += regioes[i].getFaturamento();  
         }
          int cont = 0;
          double total = soma;
          System.out.println("A representação percentual das cidades são:");
          while(cont < regioes.length) {
        	  double decimal = regioes[cont].getFaturamento()/total;
        	  double percentual = decimal*100;
        	  System.out.println( regioes[cont].getCidade()+":"+percentual);
        	  cont++;
          }
          System.out.println( " A soma de todos faturamentos das cidades é: "+ soma);
		
		
		 
		  
		  
         
        
         
        		
        
     
        
    }
}
		

