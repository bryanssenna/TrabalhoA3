import java.util.Scanner;

class Main {
  public static void main (String [] args) {
    double N1, N2, N3, N4, media;
    
    Scanner teclado = new Scanner ( System.in);
    
    System.out.println ("Digite a primeira nota:");
    N1 = teclado.nextDouble();
    
    System.out.println ("Digite a segunda nota:");
    N2 = teclado.nextDouble();
    
    System.out.println ("Digite a terceita nota:");
    N3 = teclado.nextDouble();
    
    System.out.println (" Digite a quarta nota:");
    N4 = teclado.nextDouble();
    
    media = (N1+N2+N3+N4) / 4;
    
   System.out.println(" A Media do aluno é : "+media);
                
  }
}
