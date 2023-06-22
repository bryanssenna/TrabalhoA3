import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da hora de trabalho: ");
        double valorHora = input.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;

        double descontoIR = 0;
        if (salarioBruto > 900 && salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.1;
        } else if (salarioBruto > 2500) {
            descontoIR = salarioBruto * 0.2;
        }

        double descontoINSS = salarioBruto * 0.1;
        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;

        double totalDescontos = descontoIR + descontoINSS + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR (5%): R$ " + descontoIR);
        System.out.println("(-) INSS (10%): R$ " + descontoINSS);
        System.out.println("(-) Sindicato (3%): R$ " + descontoSindicato);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        input.close();
    }
}
