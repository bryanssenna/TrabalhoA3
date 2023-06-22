import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private String nome;
    private List<String> bucho;

    public Macaco(String nome) {
        this.nome = nome;
        this.bucho = new ArrayList<>();
    }

    public void comer(String alimento) {
        bucho.add(alimento);
        System.out.println(nome + " comeu " + alimento);
    }

    public void verBucho() {
        if (bucho.isEmpty()) {
            System.out.println(nome + " está com o bucho vazio.");
        } else {
            System.out.println(nome + " tem no bucho: ");
            for (String alimento : bucho) {
                System.out.println(alimento);
            }
        }
    }

    public void digerir() {
        if (bucho.isEmpty()) {
            System.out.println(nome + " não tem nada no bucho para digerir.");
        } else {
            System.out.println(nome + " está digerindo...");
            bucho.clear();
            System.out.println(nome + " terminou de digerir.");
        }
    }

    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("Macaco 1");
        Macaco macaco2 = new Macaco("Macaco 2");

        macaco1.comer("Banana");
        macaco2.comer("Maçã");
        macaco1.comer("Pêssego");

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.digerir();
        macaco2.digerir();

        macaco1.verBucho();
        macaco2.verBucho();

        // Tentando fazer um macaco comer o outro
        macaco1.comer(macaco2.nome);

        macaco1.verBucho();
        macaco2.verBucho();
    }
}
