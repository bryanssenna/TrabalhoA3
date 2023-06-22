import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Bichinho {
    private int fome;
    private int tedio;

    public Bichinho() {
        Random random = new Random();
        fome = random.nextInt(10) + 1;
        tedio = random.nextInt(10) + 1;
    }

    public void alimentar() {
        fome -= 2;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void brincar() {
        tedio -= 2;
        if (tedio < 0) {
            tedio = 0;
        }
    }

    public void ouvir() {
        System.out.println("Bichinho fazendo som: Olá!");
    }

    public void exibirStatus() {
        System.out.println("Nível de fome: " + fome);
        System.out.println("Nível de tédio: " + tedio);
        System.out.println();
    }
}

public class FazendaBichinhos {
    private List<Bichinho> bichinhos;

    public FazendaBichinhos(int quantidadeBichinhos) {
        bichinhos = new ArrayList<>();
        for (int i = 0; i < quantidadeBichinhos; i++) {
            bichinhos.add(new Bichinho());
        }
    }

    public void alimentarTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.alimentar();
        }
        System.out.println("Todos os bichinhos foram alimentados.");
        System.out.println();
    }

    public void brincarTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.brincar();
        }
        System.out.println("Todos os bichinhos brincaram.");
        System.out.println();
    }

    public void ouvirTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.ouvir();
        }
        System.out.println();
    }

    public void exibirStatusTodos() {
        for (Bichinho bichinho : bichinhos) {
            bichinho.exibirStatus();
        }
    }

    public static void main(String[] args) {
        FazendaBichinhos fazenda = new FazendaBichinhos(5);

        fazenda.alimentarTodos();
        fazenda.brincarTodos();
        fazenda.ouvirTodos();
        fazenda.exibirStatusTodos();
    }
}