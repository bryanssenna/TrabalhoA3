import java.util.Scanner;
  class Main {
    public static void main (String [] args) {
      
      System.out.println(" Escreva a Lateral de um Quadrado ");
      float lado = new Scanner (System.in).nextFloat();
      
      System.out.println ("O dobro do lado do Quadrado é " + ((lado * lado)* 2) );
      
    } 
  }