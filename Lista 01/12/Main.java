import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
    
  System.out.println("Digite sua altura !");
  double altura = input.nextDouble();
  System.out.println("");

  double pesoIdeal = (72.7 * altura) - 58;

  System.out.println("O 'peso ideal' é :" + pesoIdeal + "kg");

    
  }
} 