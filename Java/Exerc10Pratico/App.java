public class App {
    
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor();
        int [] vetor1 = vetor.gerarVetor(98);
        int [] vetor2 = vetor.gerarVetor2(98);

        vetor.intersecaoVetores(vetor1, vetor2);
        System.out.println("Fibonacci");
        Fibonnaci fibonnaci = new Fibonnaci();
        System.out.println(fibonnaci.fibonacci(10));

        ListaEnc lista = new ListaEnc();
        // for(int i = 0; i < vetor1.length; i++){
        //     lista.inserirFim(vetor1[i]);
        // }
        // System.out.println("Lista Encadeada");
        // System.out.println(lista.nroPares());


        // quando usa os dois da conflito
        System.err.println("Lista Duplamente Encadeada");
        for(int i = 0; i < vetor1.length; i++){
            lista.addOrdenado((vetor1[i]));
            
            }
           lista.imprimirOrdenado();
           System.out.println("--------------------------------------------------------");
              System.out.println(lista.nroPares());



        lista.imprimirRec();


        ListaEnc lista2 = new ListaEnc();
        for(int i = 0; i < vetor2.length; i++){
            lista2.inserirInicio(vetor2[i]);
        }
        System.err.println("Lista concatenada");
        lista.concatenar(lista2);
        System.out.println("--------------------------------------------------------");
        

        lista.imprimirRec();








        System.out.println("Lista Encadeada");

        LSE listaEncadeada = new LSE();
        for(int i = 0; i < vetor1.length; i++){
            listaEncadeada.inserirInicio(vetor1[i]);

        }


        System.out.println("Lista aplica bubbleSort");
        listaEncadeada.ordenaBubbleSort();
        System.out.print("Lista ordenada: ");
        listaEncadeada.imprimir();



        int[] vetorOrdenadoNumeros = {3, 7, 1, 4, 9, 2};
        System.out.println("Lista aplica selectionSort");
        VetorOrdenado vetorOrdenado = new VetorOrdenado();
        vetorOrdenado.selectionSort(vetorOrdenadoNumeros);
        System.out.println("Lista aplica bubbleSort");
        int[] vetorOrdenadoNumeros2 = {3, 7, 1, 4, 9, 2};
        vetorOrdenado.bubbleSort(vetorOrdenadoNumeros2);
        System.out.println("Lista aplica insertionSort");
        int[] vetorOrdenadoNumeros3 = {3, 7, 1, 4, 9, 2};
        vetorOrdenado.insertionSort(vetorOrdenadoNumeros3);
    }

    

}
// (Questão 4) Dados quatro algoritmos (A, B, C e D) e suas respectivas fórmulas gerais, analise a complexidade de cada um deles e classifique-os em ordem crescente de complexidade. Responda no seu PIÁ. 
// 	O(n) = 4n² + 3n + 2
// 	O(n) = 2^n + 34
// 	O(n) = 2√n + 12
// 	O(n) = 3 + 5n log⁡n
// A) O(n) = 2√n + 12
// B) O(n) = 3 + 5n log⁡n
// C) O(n) = 4n² + 3n + 2
// D) O(n) = 2^n + 34


// (Questão 5) Implemente um método que retorna o número de elementos pares da lista duplamente encadeada. Este método deve possuir o seguinte protótipo:
// public int nroPares();
