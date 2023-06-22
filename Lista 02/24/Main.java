import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int operacao = scanner.nextInt();

        double resultado = 0;
        String descricao = "";

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                descricao = "soma";
                break;
            case 2:
                resultado = num1 - num2;
                descricao = "subtração";
                break;
            case 3:
                resultado = num1 * num2;
                descricao = "multiplicação";
                break;
            case 4:
                resultado = num1 / num2;
                descricao = "divisão";
                break;
            default:
                System.out.println("Operação inválida.");
                System.exit(0);
        }

        System.out.println("O resultado da " + descricao + " é: " + resultado);

        
        if (resultado % 2 == 0) {
            System.out.println("O resultado é um número par.");
        } else {
            System.out.println("O resultado é um número ímpar.");
        }

       
        if (resultado > 0) {
            System.out.println("O resultado é um número positivo.");
        } else if (resultado < 0) {
            System.out.println("O resultado é um número negativo.");
        } else {
            System.out.println("O resultado é zero.");
        }

        
        if (resultado % 1 == 0) {
            System.out.println("O resultado é um número inteiro.");
        } else {
            System.out.println("O resultado é um número decimal.");
        }

        scanner.close();
    }
}
