import java.util.Random;
public class App{ 
public static void main(String[] args) {


    int tamanho = 1000;
    int[] vetor = new int[tamanho];

    Random random = new Random();

    for (int i = 0; i < tamanho; i++) {
        vetor[i] = random.nextInt(); // Gera um número aleatório
    }

  


    // Algoritmo: maximoRec(vetor, inicio, fim)
    // se (inicio == fim) então
    // retorne vetor[inicio]
    // senão
    // meio = (inicio + fim) div 2
    // max1 = maximoRec(vetor, inicio, meio)
    // max2 = maximoRec(vetor, meio+1, fim)
    // se (max1 > max2) então
    // retorne max1
    // senão
    // retorne max2

    int inicio = 0;
    int fim = vetor.length - 1;
    int maximo = maximoRec(vetor, inicio, fim);

    System.out.println("O maior número é: " + maximo);
    System.out.println("O tamanho do vetor é: " + vetor.length);
    System.out.println("O menor número é: " + vetor[0]);
    


    
}

private static int maximoRec(int[] vetor, int inicio, int fim) {
    if(inicio == fim){
        return vetor[inicio];
    }else{
        int meio = (inicio + fim) / 2;
        int max1 = maximoRec(vetor, inicio, meio);
        int max2 = maximoRec(vetor, meio + 1, fim);
        if(max1 > max2){
            return max1;
        }else{
            return max2;
        }
    }
 

   
    
   
}

}
