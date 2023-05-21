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
        for(int i = 0; i < vetor1.length; i++){
            lista.inserirFim(vetor1[i]);
        }
        System.out.println("Lista Encadeada");
        System.out.println(lista.nroPares());

        System.err.println("Lista Duplamente Encadeada");
        for(int i = 0; i < vetor1.length; i++){
            lista.addOrdenado((vetor1[i]));
        }
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
