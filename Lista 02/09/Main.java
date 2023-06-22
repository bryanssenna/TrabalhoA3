import java.util.Arrays;
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

        int[] numeros = { numero1, numero2, numero3 };
        Arrays.sort(numeros);

        System.out.println("Os números em ordem decrescente são: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        input.close();
    }
}
