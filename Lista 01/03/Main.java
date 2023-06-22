import java.util.Scanner;

class Main {
  public static void main (String [] args) {
    int N1, N2, soma;
    
    Scanner teclado = new Scanner (System.in);
    
    System.out.println ("Digite um Numero");
      N1 = teclado.nextInt();
    
    System.out.println ("Digite outro Numero");
      N2 = teclado.nextInt();
    
      soma = N1+N2;
    
    System.out.println("A Soma de "+ N1 +" + "+ N2 +" é igual "+ soma);
  }
}