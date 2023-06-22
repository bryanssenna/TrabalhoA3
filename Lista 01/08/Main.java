import java.util.Scanner;

class Main {
  public static void main (String[] args){
    
    double valorHora, horaTrabalhada, salario;
    
    Scanner teclado = new Scanner (System.in);
    
    System.out.println ("Qual o valor da Hora de Trabalho?");
    valorHora = teclado.nextDouble();
    
    System.out.println ("Quantas horas Trabalhadas ? ");
    horaTrabalhada = teclado.nextDouble();
    
    salario = valorHora* horaTrabalhada;
    System.out.println (" Seu salario de mês é R$ " + salario);
  }
  
}