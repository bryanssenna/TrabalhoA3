import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        double a, b, c, delta, x1, x2;

        System.out.println ("-- Equação de 2º Grau --");
        System.out.print ("Informe o valor de a: ");
        a = teclado.nextDouble();

        if (a == 0 ) {
            System.out.println ("Não é uma Equação de 2º Grau!");

        } else if (a != 0) {
            System.out.print ("Informe o valor de b: ");
            b = teclado.nextDouble();

            System.out.print ("Informe o valor de c: ");
            c = teclado.nextDouble();

            delta = Math.pow(b, 2) - (4 * a * c);

            if ( delta < 0) {
                System.out.println ("O valor de Delta é " + delta);
                System.out.println ("A equação não possui raizes!");

            } else if (delta == 0) {
                System.out.println ("O valor de Delta é " + delta);
                System.out.println ("Quando o Delta é igual a Zero, a equação possui apenas 1 raiz.");
                x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
                System.out.println ("O valor da raíz é " + x1);

            } else {
                System.out.println ("O valor de Delta é " + delta);
                x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
                x2 = (-(b) - Math.sqrt(delta)) / (2 * a);
                System.out.println ("O valor a primeira raíz x1 é " + x1);
                System.out.println ("O valor da segudna raíz x2 é " + x2);
            }

        } else {
            System.out.println ("Valor inválido!");
        }

        teclado.close();
    }

}