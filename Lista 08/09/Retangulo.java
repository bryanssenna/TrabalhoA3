public class Retangulo {
    
private double largura;
    private double altura;
    private Ponto verticePartida;
    
    public Retangulo(double largura, double altura, Ponto verticePartida) {
        this.largura = largura;
        this.altura = altura;
        this.verticePartida = verticePartida;
    }
    
    public void alterarValores(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public Ponto encontrarCentro() {
        double centroX = verticePartida.getX() + largura / 2;
        double centroY = verticePartida.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }
}
