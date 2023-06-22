 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor ganho por hora: R$ ");
        float valorHora = scanner.nextFloat();

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        float horasTrabalhadas = scanner.nextFloat();

        float salarioBruto = valorHora * horasTrabalhadas;
        float ir = salarioBruto * 0.11f;
        float inss = salarioBruto * 0.08f;
        float sindicato = salarioBruto * 0.05f;
        float salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto IR (11%): R$ " + ir);
        System.out.println("Desconto INSS (8%): R$ " + inss);
        System.out.println("Desconto Sindicato (5%): R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
