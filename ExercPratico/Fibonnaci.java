public class Fibonnaci {
//     Questão 3) Implemente, em Linguagem Java, um método que calcula o enésimo termo da série de Fibonacci, tendo como base a descrição matemática recursiva a seguir.
 
// Exemplo:
// Primeiros números da série de Fibonacci 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, …

  public static int fibonacci(int n) {
    if (n < 2) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
  

    
}


// Questão 2) O método Selection Sort, abaixo, sofreu um pequeno ajuste: passou a trabalhar com a seleção do maior valor, colocando-o na última posição; do segundo maior valor colocando-o na penúltima posição e, assim, sucessivamente. Complete-o!

// public void selectionSort() {
//     for (int i = this.totalElem - 1; i > 0; i--) {
//         int maior = this.posMaior(i);
//         if (maior != i) {
//             this.troca(i, maior);
//         }
//     }
// }
// /* Métodos auxiliares: */
// private int posMaior (int fim) {
//    int maior = fim;
//    for (int i = fim-1; i >= 0; i--)
//       if (valor[i] > valor[maior])
//          maior = i;
//    return maior;
// }

 // Código para o Método da seleção
    // Public void selection_sort(){
    // for (int i = 0; i < this.totalElem; i++) {
    // int menor = i;
    // for (int j = i+1; j < this.totalElem; j++)
    // if (this.vet[j] < this.vet[menor])
    // menor = j;
    // int aux = vet[i];
    // this.vet[i] = this.vet[menor];
    // this.vet[menor] = aux;
    // }
    // }
