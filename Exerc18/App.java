import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] vetorHeap = {5, 3, 17, 10, 8, 9};
        System.out.println("Vetor original: " + Arrays.toString(vetorHeap));
        HeapSort.heapSort(vetorHeap);
        System.out.println("vetorHeap ordenado: " + Arrays.toString(vetorHeap));


        int[] vetorQuick = {30, 20, 10, 7, 60, 50, 80, 40, 100};
        System.out.println("Vetor original: " + Arrays.toString(vetorQuick));
        QuickSort.quickSort(vetorQuick, 0, vetorQuick.length - 1);
        System.out.println("vetorQuick ordenado: " + Arrays.toString(vetorQuick));
    }
}
