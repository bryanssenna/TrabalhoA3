public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void aumentarSalario(double porcentualDeAumento) {
        double aumento = salario * (porcentualDeAumento / 100.0);
        salario += aumento;
    }
    
    public static void main(String[] args) {
    
        Funcionario harry = new Funcionario("Harry", 25000.0);
        System.out.println("Nome: " + harry.getNome());
        System.out.println("Salário antes do aumento: " + harry.getSalario());
        
        harry.aumentarSalario(10);
        System.out.println("Salário após o aumento: " + harry.getSalario());
    }
}