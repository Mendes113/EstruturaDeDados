package demo.src.main.java.com.example;
public class App {
    public static void main(String[] args) {
        Vetor vetorObj = new Vetor();

        // Medição do tempo de execução para o método getVetor()
        long tempoInicialGetVetor = System.nanoTime();

        int[] vetorSemOrdenacao = vetorObj.getVetor();

        long tempoFinalGetVetor = System.nanoTime();
        long tempoTotalGetVetor = tempoFinalGetVetor - tempoInicialGetVetor;
        System.out.println("Tempo de execução do método getVetor(): " + tempoTotalGetVetor + " nanossegundos");

        System.out.println("--------------------------------------------------------------------");

        // Medição do tempo de execução para o método ordenaBubbleSort()
        long tempoInicialOrdenaBubbleSort = System.nanoTime();

        int[] vetorOrdenado = vetorObj.ordenaBubbleSort();

        long tempoFinalOrdenaBubbleSort = System.nanoTime();
        long tempoTotalOrdenaBubbleSort = tempoFinalOrdenaBubbleSort - tempoInicialOrdenaBubbleSort;
     
        System.out.println("Tempo de execução do método ordenaBubbleSort(): " + tempoTotalOrdenaBubbleSort + " nanossegundos");




        System.out.println("--------------------------------------------------------------------");

        // Medição do tempo de execução para o método selection_sort()
        long tempoInicialSelectionSort = System.nanoTime();

        vetorObj.selection_sort();

        long tempoFinalSelectionSort = System.nanoTime();
        long tempoTotalSelectionSort = tempoFinalSelectionSort - tempoInicialSelectionSort;
        System.out.println("Tempo de execução do método selection_sort(): " + tempoTotalSelectionSort + " nanossegundos");

        System.out.println("--------------------------------------------------------------------");

        // Medição do tempo de execução para o método insertion_sort()
        long tempoInicialInsertionSort = System.nanoTime();
        
        vetorObj.insertion_sort();

        long tempoFinalInsertionSort = System.nanoTime();
        long tempoTotalInsertionSort = tempoFinalInsertionSort - tempoInicialInsertionSort;
        System.out.println("Tempo de execução do método insertion_sort(): " + tempoTotalInsertionSort + " nanossegundos");










    }



}
