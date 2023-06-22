public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        this.idade++;
        if (this.idade < 21) {
            this.crescer(0.5);
        }
    }

    public void engordar(double pesoGanho) {
        this.peso += pesoGanho;
    }

    public void emagrecer(double pesoPerdido) {
        this.peso -= pesoPerdido;
    }

    public void crescer(double alturaGanha) {
        this.altura += alturaGanha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
