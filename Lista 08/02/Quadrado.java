public class Quadrado {
    
    public double tamanhoLado;

    public void mudarValorLado (double novoTamanhoLado) {
        tamanhoLado = novoTamanhoLado;
    }

    public double retornarTamanhoLado () {
        return tamanhoLado;
    } 
    
    public double calcularArea () {
        return Math.pow (tamanhoLado, 2);
    }
}
    