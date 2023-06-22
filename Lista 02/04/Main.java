import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scanner.next().toLowerCase();

        if (letra.length() == 1) {
            if (letra.matches("[aeiou]")) {
                System.out.println("É uma vogal.");
            } else if (letra.matches("[b-df-hj-np-tv-z]")) {
                System.out.println("É uma consoante.");
            } else {
                System.out.println("Não é uma letra válida.");
            }
        } else {
            System.out.println("Digite apenas uma letra.");
        }

        scanner.close();
    }
}
