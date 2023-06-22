import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Criar objetos da classe Retangulo
        Ponto verticePartida1 = new Ponto(0, 0);
        Retangulo retangulo1 = new Retangulo(5, 3, verticePartida1);
        
        Ponto verticePartida2 = new Ponto(2, 4);
        Retangulo retangulo2 = new Retangulo(4, 6, verticePartida2);
        
        int opcao;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Alterar valores do retângulo 1");
            System.out.println("2. Alterar valores do retângulo 2");
            System.out.println("3. Imprimir centro do retângulo 1");
            System.out.println("4. Imprimir centro do retângulo 2");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a largura do retângulo 1: ");
                    double largura1 = teclado.nextDouble();
                    System.out.print("Digite a altura do retângulo 1: ");
                    double altura1 = teclado.nextDouble();
                    retangulo1.alterarValores(largura1, altura1);
                    break;
                case 2:
                    System.out.print("Digite a largura do retângulo 2: ");
                    double largura2 = teclado.nextDouble();
                    System.out.print("Digite a altura do retângulo 2: ");
                    double altura2 = teclado.nextDouble();
                    retangulo2.alterarValores(largura2, altura2);
                    break;
                case 3:
                    Ponto centro1 = retangulo1.encontrarCentro();
                    centro1.imprimir();
                    break;
                case 4:
                    Ponto centro2 = retangulo2.encontrarCentro();
                    centro2.imprimir();
                    break;
                case 0:
            }
        }
    }
}
                   
