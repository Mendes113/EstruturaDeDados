import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] vetor) {
        int n = vetor.length;

        // Construir o heap máximo
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(vetor, n, i);

        // Extrair os elementos do heap um por um
        for (int i = n - 1; i > 0; i--) {
            // Mover a raiz (maior elemento) para o final do array
            trocar(vetor, 0, i);

            // Chamar heapify na subárvore reduzida
            heapify(vetor, i, 0);

            System.out.println("Vetor intermediário: " + Arrays.toString(vetor));
        }
    }

    private static void heapify(int[] vetor, int n, int i) {
        int maior = i; // Inicializar o maior como raiz
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        // Se o filho esquerdo é maior que a raiz
        if (esquerda < n && vetor[esquerda] > vetor[maior])
            maior = esquerda;

        // Se o filho direito é maior que o maior até agora
        if (direita < n && vetor[direita] > vetor[maior])
            maior = direita;

        // Se o maior não é a raiz
        if (maior != i) {
            trocar(vetor, i, maior);

            // Recursivamente heapify a subárvore afetada
            heapify(vetor, n, maior);
        }
    }

    private static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
