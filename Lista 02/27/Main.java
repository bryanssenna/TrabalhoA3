import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de morangos (em Kg): ");
        double quantidadeMorangos = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de maçãs (em Kg): ");
        double quantidadeMacas = scanner.nextDouble();
        
        double precoMorango = 0.0;
        double precoMaca = 0.0;
        
        if (quantidadeMorangos <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }
        
        if (quantidadeMacas <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }
        
        double valorTotal = (quantidadeMorangos * precoMorango) + (quantidadeMacas * precoMaca);
        
        if (quantidadeMorangos + quantidadeMacas > 8 || valorTotal > 25.00) {
            double desconto = valorTotal * 0.10;
            valorTotal -= desconto;
        }
        
        System.out.println("Valor a ser pago: R$ " + valorTotal);
        
        scanner.close();
    }
}
