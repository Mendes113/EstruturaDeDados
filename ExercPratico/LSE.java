public class LSE {
    
    private Noh primeiro;
    private Noh ultimo;
    
    public LSE() {
        this.primeiro = null;
       
    }

    public void inserirInicio(int valor) {
        Noh novo = new Noh(valor);
        if (this.primeiro == null) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
        }
    }

    // public int[] ordenaBubbleSort() {
    //     int aux;
    //     for (int i = 0; i < vetor.length; i++) { // percorre o vetor
    //         for (int j = 0; j < vetor.length - 1; j++) { // percorre o vetor até a penúltima posição
    //             if (vetor[j] > vetor[j + 1]) { // se o valor da posição j for maior que o valor da posição j + 1
    //                 aux = vetor[j]; // aux recebe o valor da posição j
    //                 vetor[j] = vetor[j + 1]; // o valor da posição j recebe o valor da posição j + 1
    //                 vetor[j + 1] = aux;  // o valor da posição j + 1 recebe o valor de aux
    //             }
    //         }
    //     }
    //     return vetor; // retorna o vetor ordenado
    // }


    public void ordenaBubbleSort() {
        if (primeiro == null || primeiro.getProximo() == null) {
            // Se a lista estiver vazia ou tiver apenas um elemento, não é necessário ordenar
            return;
        }
    
        boolean trocaFeita;
        Noh atual;
        Noh proximo = null;
    
        do {
            trocaFeita = false;
            atual = primeiro;
    
            while (atual.getProximo() != proximo) {
                // Comparação dos valores dos nós adjacentes
                if (atual.getValor() > atual.getProximo().getValor()) {
                    // Troca dos valores dos nós
                    int temp = atual.getValor();
                    atual.setValor(atual.getProximo().getValor());
                    atual.getProximo().setValor(temp);
                    trocaFeita = true;
                }
    
                atual = atual.getProximo();
            }
    
            proximo = atual;
        } while (trocaFeita);
    }
    

    public void imprimir(){
        Noh aux = this.primeiro;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getProximo();
        }
    }
  
}
