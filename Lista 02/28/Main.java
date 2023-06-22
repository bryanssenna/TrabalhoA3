import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Hipermercado Tabajara! Confira nossa promoção de carnes:");
        System.out.println("   Até 5 Kg         Acima de 5 Kg");
        System.out.println("File Duplo  R$ 4,90 por Kg    R$ 5,80 por Kg");
        System.out.println("Alcatra     R$ 5,90 por Kg    R$ 6,80 por Kg");
        System.out.println("Picanha     R$ 6,90 por Kg    R$ 7,80 por Kg");

        System.out.print("Informe o tipo de carne desejado (File Duplo, Alcatra ou Picanha): ");
        String tipoCarne = scanner.nextLine();

        System.out.print("Informe a quantidade desejada (em Kg): ");
        double quantidade = scanner.nextDouble();

        System.out.print("Informe o tipo de pagamento (Cartão Tabajara ou outro): ");
        String tipoPagamento = scanner.next();

        double precoPorKg;
        if (quantidade <= 5) {
            if (tipoCarne.equalsIgnoreCase("File Duplo")) {
                precoPorKg = 4.90;
            } else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
                precoPorKg = 5.90;
            } else if (tipoCarne.equalsIgnoreCase("Picanha")) {
                precoPorKg = 6.90;
            } else {
                System.out.println("Tipo de carne inválido.");
                return;
            }
        } else {
            if (tipoCarne.equalsIgnoreCase("File Duplo")) {
                precoPorKg = 5.80;
            } else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
                precoPorKg = 6.80;
            } else if (tipoCarne.equalsIgnoreCase("Picanha")) {
                precoPorKg = 7.80;
            } else {
                System.out.println("Tipo de carne inválido.");
                return;
            }
        }

        double valorTotal = precoPorKg * quantidade;
        double desconto = 0.0;
        if (tipoPagamento.equalsIgnoreCase("Cartão Tabajara")) {
            desconto = valorTotal * 0.05;
        }
        double valorAPagar = valorTotal - desconto;

        System.out.println("----- Cupom Fiscal -----");
        System.out.println("Tipo de carne: " + tipoCarne);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preço total: R$" + valorTotal);
        System.out.println("Tipo de pagamento: " + tipoPagamento);
        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Valor a pagar: R$" + valorAPagar);
    }
}
