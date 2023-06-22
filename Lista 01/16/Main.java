import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double m2,rendTinta, totalTinta, valorLataTinta, rendLata, totalLataTinta, valorTotalTinta ;
   
    System.out.println("Vamos avaliar quanto será gasto de tinta!?");
    
    System.out.println("Quantos M² será pintado ?");
    
       m2 = teclado.nextDouble();
       rendLata = 130;
       valorLataTinta = 299;
       totalTinta = m2 / 3;
       totalLataTinta = Math.ceil(totalTinta / 18) ;
       valorTotalTinta = totalLataTinta * valorLataTinta;
    
    System.out.println("Você precisa comprar " + totalLataTinta + " latas de tinta .");
    System.out.println("O que totaliza o valor a ser gasto de R$" + valorTotalTinta);
     
    
  }
}