public class Construtor {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", 2500.0);

        String nomeFuncionario = funcionario.getNome();
        double salarioFuncionario = funcionario.getSalario();

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário do funcionário: " + salarioFuncionario);
    }
}
