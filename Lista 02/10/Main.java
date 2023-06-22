import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Em qual turno você estuda?");
        System.out.println("Digite M para Matutino, V para Vespertino ou N para Noturno: ");
        String turno = input.nextLine();

        turno = turno.toUpperCase();

        String mensagem;

        if (turno.equals("M")) {
            mensagem = "Bom Dia!";
        } else if (turno.equals("V")) {
            mensagem = "Boa Tarde!";
        } else if (turno.equals("N")) {
            mensagem = "Boa Noite!";
        } else {
            mensagem = "Valor Inválido!";
        }

        System.out.println(mensagem);

        input.close();
    }
}

