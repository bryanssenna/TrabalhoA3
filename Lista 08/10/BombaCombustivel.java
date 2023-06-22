public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            return litrosAbastecidos;
        } else {
            return -1;
        }
    }

    public double abastecerPorLitro(double litros) {
        double valorPagar = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            return valorPagar;
        } else {
            return -1;
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoCombustivel) {
        tipoCombustivel = novoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 4.5, 1000);
        System.out.println("Quantidade de combustível disponível na bomba: " + bomba.getQuantidadeCombustivel() + " litros");

        double litrosAbastecidos = bomba.abastecerPorValor(50);
        if (litrosAbastecidos >= 0) {
            System.out.println("Litros abastecidos: " + litrosAbastecidos);
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
        System.out.println("Quantidade de combustível restante na bomba: " + bomba.getQuantidadeCombustivel() + " litros");

        double valorPagar = bomba.abastecerPorLitro(20);
        if (valorPagar >= 0) {
            System.out.println("Valor a pagar: " + valorPagar);
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
        System.out.println("Quantidade de combustível restante na bomba: " + bomba.getQuantidadeCombustivel() + " litros");

        bomba.alterarValor(5.0);
        bomba.alterarCombustivel("Etanol");
        bomba.alterarQuantidadeCombustivel(500);

        System.out.println("Quantidade de combustível disponível na bomba: " + bomba.getQuantidadeCombustivel() + " litros");
    }
}