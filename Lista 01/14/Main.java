import java.util.Scanner;


class Main {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);


  System.out.println ("Digite valor em KG de peixes pescados: ");

    float peso = scanner.nextFloat();
    float limite = 50;
    float excesso = 0;
    float multaPorQuilo = 4.00f;
    float multa = 0;

    if (peso > limite) {
      excesso = peso - limite;
      multa = excesso * multaPorQuilo;
      
    }

    System.out.println("Peso informado: " + peso + " quilos");

    if (excesso > 0) {
      System.out.println("Excesso de peso: " + excesso + " quilos");
      System.out.println("Valor da multa a ser paga: R$ " + multa);
        } else {
          System.out.println("Dentro do limite de peso. Sem taxa a pagar.");
      
    
      
        
      }
      
  
  }
}