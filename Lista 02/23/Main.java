import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = input.nextDouble();

        if (ehInteiro(numero)) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }

        input.close();
    }

    public static boolean ehInteiro(double numero) {
        return Math.round(numero) == numero;
    }
}
