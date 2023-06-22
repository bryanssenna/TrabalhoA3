import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tamagushi tamagushi = new Tamagushi("Meu Tamagushi", 5, 5, 2, 5);

        System.out.println("Bem-vindo ao Tamagushi!");
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Alimentar o Tamagushi");
        System.out.println("2 - Brincar com o Tamagushi");
        System.out.println("3 - Exibir informações secretas (apenas para testes)");
        System.out.println("0 - Sair");

        int opcao;
        do {
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade de comida: ");
                    int quantidadeComida = scanner.nextInt();
                    tamagushi.alimentar(quantidadeComida);
                    break;
                case 2:
                    System.out.print("Tempo de brincadeira: ");
                    int tempoBrincadeira = scanner.nextInt();
                    tamagushi.brincar(tempoBrincadeira);
                    break;
                case 3:
                    System.out.println("Opção secreta selecionada! Exibindo informações do Tamagushi:");
                    System.out.println(tamagushi.toString());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
