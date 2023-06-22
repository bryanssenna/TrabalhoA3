import java.util.Scanner;

class Main {
  public static void main (String [] args) {
  double area, raio, pi;
  Scanner teclado = new Scanner (System.in);
    
    System.out.println ("Qual é o Raio de um circulo ? ");
    
    raio =  teclado.nextDouble();
    area = 3.1415 * (raio * raio);
    
    System.out.println ("A Area  é " + area );
    
  }
  
}
  