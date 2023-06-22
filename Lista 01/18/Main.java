import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double mbTamanho, velociLink, tempoS, tempoM;
    
    System.out.println("Vamos calcular o tempo de Dowload!?");
    
    System.out.println("Digite o tamanho do arquivo (em MB).");
    mbTamanho = teclado.nextDouble();
    
    System.out.println("Digite a velocidade do Link (em Mbps).");
    
    velociLink = teclado.nextDouble();
    tempoS = mbTamanho / (velociLink / 8);   
    tempoM = tempoS / 60 ;
    
    System.out.println("o tempo aproximado do seu download é de :" + tempoM + " minutos.");

  }

}