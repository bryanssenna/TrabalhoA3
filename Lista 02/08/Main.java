import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto: ");
        double preco1 = input.nextDouble();

        System.out.println("Digite o preço do segundo produto: ");
        double preco2 = input.nextDouble();

        System.out.println("Digite o preço do terceiro produto: ");
        double preco3 = input.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3) {
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("Você deve comprar o segundo produto.");
        } else {
            System.out.println("Você deve comprar o terceiro produto.");
        }

        input.close();
    }
}
