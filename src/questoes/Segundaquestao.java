package questoes;

public class Segundaquestao {
  public static void main(String[] args) {
	  int num1 = 1, num2 = 0, numero = 20;
    
    System.out.println(num2);
    System.out.println(num1);
    
    for(int i = 0; i < 8; i++){
        num1 = num1 + num2;
        if (i == 2) {
        	num1 = numero;
        }
        num2 = num1 - num2;
        System.out.println(num1);
    }
}
}
