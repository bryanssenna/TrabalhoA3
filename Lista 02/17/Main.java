import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner (System.in);

        int ano;

        System.out.println ("Descubra se o ano é Bissexto. Digite o ano:");
        ano = entrada.nextInt();

        if ((ano % 400 == 0 && ano % 4 == 0 )|| (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println(ano + " O Ano é Bissexto ! "); 
        } else {
            System.out.println(ano + " O Ano não é Bissexto ! "); 
        }
        entrada.close();
    }
}