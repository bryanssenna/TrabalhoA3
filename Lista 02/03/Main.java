import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra para indicar o sexo (F ou M): ");
        String letra = scanner.next();

        if (letra.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        } else if (letra.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }

        scanner.close();
    }
}
