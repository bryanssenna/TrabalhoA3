import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Digite a altura (em metros): ");
      double altura = scanner.nextDouble();
        
    System.out.print("Digite o sexo (M para masculino, F para feminino): ");
      char sexo = scanner.next().charAt(0);
        
      double pesoIdeal;
        
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. O programa será encerrado.");
            return;
        }
        
        System.out.println("O peso ideal é: " + pesoIdeal + " kg");
    }
}
