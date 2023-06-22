import java.util.Scanner;
  
class Main{
  public static void main (String [] args){
    double Celsius, Fahrenheit;
    
Scanner teclado = new Scanner(System.in);
System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n");

System.out.print("Digite a temperatura em Celsius: ");

Celsius = teclado.nextDouble();

Fahrenheit = ( 9 * Celsius + 160 ) / 5;

System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
  
  }
 
}