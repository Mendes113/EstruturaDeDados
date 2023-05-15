public class App {
    public static void main(String[] args) {
        int tamanho = 1000;
        Vetor vetor = new Vetor(tamanho);
        vetor.preencherAleatorio();
        long inicio = System.nanoTime();
        
     

        int[] numeros = new int[200]; // Números que você deseja pesquisar
        for (int i = 0; i < 200; i++) {
            numeros[i] = vetor.elementos[i]; // Copia os primeiros 200 elementos do vetor para o array de números
        }

        long fim = System.nanoTime();
       

        // Pesquisa binária com laço de repetição para cada número
        for (int numero : numeros) {
            int indice = vetor.pesquisaBinariaLaco(numero);

            if (indice != -1) {
                System.out.println("Número " + numero + " encontrado na posição " + indice);
            } else {
                System.out.println("Número " + numero + " não encontrado");
            }
        }

        System.out.println("Tempo de execução da pesquisa binária com laço de repetição: " + (fim - inicio) + " nanosegundos");



        // Pesquisa binária com recursão para cada número
        inicio = System.nanoTime();
        int indice2 = vetor.pesquisaBinariaRecursao(10);
        fim = System.nanoTime();

        if (indice2 != -1) {
            System.out.println("Número " + 10 + " encontrado na posição " + indice2);
        } else {
            System.out.println("Número " + 10 + " não encontrado");
        }

        System.out.println("Tempo de execução da pesquisa binária com recursão: " + (fim - inicio) + " nanosegundos");



        //mostra numeros
        inicio = System.nanoTime();
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor.elementos[i]);
        }
        fim = System.nanoTime();
        System.out.println("Tempo de execução para mostrar todos os numeros: " + (fim - inicio) + " nanosegundos");


    }
}
