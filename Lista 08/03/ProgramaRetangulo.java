import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a base do local: ");
        double baseLocal = teclado.nextDouble();

        System.out.print("Informe a altura do local: ");
        double alturaLocal = teclado.nextDouble();

        Retangulo local = new Retangulo();
        local.mudarLados(baseLocal, alturaLocal);

        double areaLocal = local.calcularArea();
        double perimetroLocal = local.calcularPerimetro();

        // Supondo que cada piso tenha 1 metro quadrado
        int quantidadePisos = (int) Math.ceil(areaLocal);

        // Supondo que cada rodapé tenha 0.1 metros
        int quantidadeRodapes = (int) Math.ceil(perimetroLocal / 0.1);

        System.out.println("Quantidade de pisos necessários: " + quantidadePisos);
        System.out.println("Quantidade de rodapés necessários: " + quantidadeRodapes);

        teclado.close();
    }
}
