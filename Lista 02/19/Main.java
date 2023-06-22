import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = (numero % 100) % 10;

        String resultado = "";

        if (centenas > 0) {
            resultado += centenas + " centena" + (centenas > 1 ? "s" : "");
        }

        if (dezenas > 0) {
            if (centenas > 0) {
                resultado += ", ";
            }
            resultado += dezenas + " dezena" + (dezenas > 1 ? "s" : "");
        }

        if (unidades > 0) {
            if (centenas > 0 || dezenas > 0) {
                resultado += " e ";
            }
            resultado += unidades + " unidade" + (unidades > 1 ? "s" : "");
        }

        System.out.println(resultado);
    }
}
