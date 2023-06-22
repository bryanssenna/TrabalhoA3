import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoAlcool = 1.90;
        double precoGasolina = 2.50;

        System.out.print("Digite o número de litros vendidos: ");
        int litros = scanner.nextInt();

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        String tipoCombustivel = scanner.next().toUpperCase();

        double valorAPagar = 0.0;

        if (tipoCombustivel.equals("A")) {
            if (litros <= 20) {
                valorAPagar = litros * (precoAlcool - (precoAlcool * 0.03));
            } else {
                valorAPagar = litros * (precoAlcool - (precoAlcool * 0.05));
            }
        } else if (tipoCombustivel.equals("G")) {
            if (litros <= 20) {
                valorAPagar = litros * (precoGasolina - (precoGasolina * 0.04));
            } else {
                valorAPagar = litros * (precoGasolina - (precoGasolina * 0.06));
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }

        System.out.println("Valor a ser pago pelo cliente: R$ " + valorAPagar);

        scanner.close();
    }
}
