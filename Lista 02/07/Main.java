import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = input.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = input.nextInt();

        int maior = numero1;
        int menor = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }

        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        input.close();
    }
}
