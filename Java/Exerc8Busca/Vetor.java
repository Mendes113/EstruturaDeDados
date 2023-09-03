
import java.util.Random;

class Vetor {
    int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
    }

    public void preencherAleatorio() {
        Random random = new Random();
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = random.nextInt(1000) + 1;
        }
    }

    public int pesquisaBinariaLaco(int elemento) {
        int inicio = 0;
        int fim = elementos.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (elementos[meio] == elemento) {
                return meio;
            } else if (elementos[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Elemento não encontrado
    }

    public int pesquisaBinariaRecursao(int elemento) {
        return pesquisaBinariaRecursao(elemento, 0, elementos.length - 1);
    }

    private int pesquisaBinariaRecursao(int elemento, int inicio, int fim) {
        if (inicio > fim) {
            return -1; // Elemento não encontrado
        }

        int meio = (inicio + fim) / 2;

        if (elementos[meio] == elemento) {
            return meio;
        } else if (elementos[meio] < elemento) {
            return pesquisaBinariaRecursao(elemento, meio + 1, fim);
        } else {
            return pesquisaBinariaRecursao(elemento, inicio, meio - 1);
        }
    }
}
