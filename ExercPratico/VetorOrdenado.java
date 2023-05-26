import java.util.Arrays;

public class VetorOrdenado {
    
    int[] vetor = {3, 7, 1, 4, 9, 2};
        
   

public static void bubbleSort(int[] vetor) {
    int n = vetor.length;
    boolean troca;
    
    System.out.println("Bubble Sort:");
    System.out.println(Arrays.toString(vetor));
    
    for (int i = 0; i < n - 1; i++) {
        troca = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (vetor[j] > vetor[j + 1]) {
                int temp = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = temp;
                troca = true;
                System.out.println(Arrays.toString(vetor));
            }
        }
        
        if (!troca) {
            break;
        }
    }
    
    System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    System.out.println();
}

public static void selectionSort(int[] vetor) {
    int n = vetor.length;
    
    System.out.println("Selection Sort:");
    System.out.println(Arrays.toString(vetor));
    
    for (int i = 0; i < n - 1; i++) {
        int indiceMin = i;
        
        for (int j = i + 1; j < n; j++) {
            if (vetor[j] < vetor[indiceMin]) {
                indiceMin = j;
            }
        }
        
        if (indiceMin != i) {
            int temp = vetor[i];
            vetor[i] = vetor[indiceMin];
            vetor[indiceMin] = temp;
            System.out.println(Arrays.toString(vetor));
        }
    }
    
    System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    System.out.println();
}

public static void insertionSort(int[] vetor) {
    int n = vetor.length;
    
    System.out.println("Insertion Sort:");
    System.out.println(Arrays.toString(vetor));
    
    for (int i = 1; i < n; i++) {
        int chave = vetor[i];
        int j = i - 1;
        
        while (j >= 0 && vetor[j] > chave) {
            vetor[j + 1] = vetor[j];
            j--;
        }
        
        vetor[j + 1] = chave;
        System.out.println(Arrays.toString(vetor));
    }
    
    System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    System.out.println();
}



}
