import java.util.Scanner;

class Main {
  public static void main (String [] args) {
    
    double metro, centimetro;
    Scanner teclado = new Scanner (System.in);
    
    System.out.println ("Insira a quantidade de metros: ");
    metro = teclado.nextDouble();
    
    centimetro = metro / 100; 
    
    System.out.println(" É igual a " + centimetro + " centimetros ");
    
    
  }
}