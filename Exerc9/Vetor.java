import java.util.Random;

public class Vetor {
    int[] vetor;
    int totalElem;
    public Vetor() {
        vetor = new int[1000];
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(500);
        }
        this.totalElem = vetor.length;
    }

    

    public int[] ordenaBubbleSort() {
        int aux;
        for (int i = 0; i < vetor.length; i++) { // percorre o vetor
            for (int j = 0; j < vetor.length - 1; j++) { // percorre o vetor até a penúltima posição
                if (vetor[j] > vetor[j + 1]) { // se o valor da posição j for maior que o valor da posição j + 1
                    aux = vetor[j]; // aux recebe o valor da posição j
                    vetor[j] = vetor[j + 1]; // o valor da posição j recebe o valor da posição j + 1
                    vetor[j + 1] = aux;  // o valor da posição j + 1 recebe o valor de aux
                }
            }
        }
        return vetor; // retorna o vetor ordenado
    }

    public int[] getVetor() {
        return vetor;
    }


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
    
    
    public void selection_sort(){
        for (int i = 0; i < this.totalElem; i++) { // percorre o vetor
            int menor = i; // menor recebe a posição i
            for (int j = i+1; j < this.totalElem; j++)  // percorre o vetor a partir da posição i + 1
                if (this.vetor[j] < this.vetor[menor])  // se o valor da posição j for menor que o valor da posição menor
                    menor = j; // menor recebe a posição j
            int aux = vetor[i];  // aux recebe o valor da posição i
            this.vetor[i] = this.vetor[menor]; // o valor da posição i recebe o valor da posição menor
            this.vetor[menor] = aux; // o valor da posição menor recebe o valor de aux
        }
    }


    //     Código para o Método da inserção
    // public void insertion_sort() {
    // for (int i = 1; i < this.totalElem; i++) {
    // int chave = this.vet[i];
    // int j = i - 1;
    // while (j >= 0 && chave < this.vet[j]) {
    // this.vet[j + 1] = this.vet[j];
    // j--;
    // }
    // this.vet[j + 1] = chave;
    // }


    public void insertion_sort(){
        for (int i = 1; i < this.totalElem; i++) { // percorre o vetor da posição 1 até o tamanho do vetor
            int chave = this.vetor[i]; // chave recebe o valor da posição i
            int j = i - 1; // j recebe a posição anterior a i
            while (j >= 0 && chave < this.vetor[j]) { // enquanto j for maior ou igual a 0 e a chave for menor que o valor da posição j
                this.vetor[j + 1] = this.vetor[j];  // o valor da posição j + 1 recebe o valor da posição j
                j--;  // j é decrementado
            } 
            this.vetor[j + 1] = chave; // o valor da posição j + 1 recebe o valor da chave
        }
    }


}


