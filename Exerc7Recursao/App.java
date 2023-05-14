import java.util.Random;

public class App {
    public static void main(String[] args) {
        int tamanho = 1000;
        int[] vetor = new int[tamanho];

        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(); // Gera um número aleatório
        }

        int inicio = 0;
        int fim = vetor.length - 1;

        long startTime = System.nanoTime(); // Início da contagem do tempo
        Vetor v = new Vetor(vetor);
        int maximoIterativo = getMaximoIterativo(v, inicio, fim);
       
        long endTime = System.nanoTime(); // Fim da contagem do tempo

        long startTimeRecursivo =System.nanoTime(); // Início da contagem do tempo
        int maximoRecursivo = maxRecursivo(vetor, inicio, fim);
        long endTimeRecursivo = System.nanoTime(); // Fim da contagem do tempo
        long tempoDeExecucao = endTime - startTime;
        long tempoDeExecucaoRecursivo = endTimeRecursivo - startTimeRecursivo;

        System.out.println("O maior número encontrado de forma iterativa é: " + maximoIterativo  + " e o tempo de execução foi de: " + tempoDeExecucao + " milisegundos");
        System.out.println("O maior número encontrado de forma recursiva é: " + maximoRecursivo + " e o tempo de execução foi de: " + tempoDeExecucaoRecursivo + " milisegundos");
        System.out.println("O tamanho do vetor é: " + vetor.length);
        System.out.println("O menor número é: " + vetor[0]);

        
        
    }
    private static int maxRecursivo(int[] vetor, int inicio, int fim) {
        if (inicio == fim) {
            return vetor[inicio];
        }
        int meio = (inicio + fim) / 2;
        int maxEsquerda = maxRecursivo(vetor, inicio, meio);
        int maxDireita = maxRecursivo(vetor, meio + 1, fim);
        if (maxEsquerda > maxDireita) {
            return maxEsquerda;
        } else {
            return maxDireita;
        }
    }

    private static int getMaximoIterativo(Vetor v, int inicio, int fim) {
        int maximo = v.get(inicio);
        for (int i = inicio; i <= fim; i++) {
            if (v.get(i) > maximo) {
                maximo = v.get(i);
            }
        }
        return maximo;
    }
}
