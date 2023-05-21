public class ListaEnc {

    private Noh primeiro;
    private Noh ultimo;

    public ListaEnc() {
        this.primeiro = null;
        this.ultimo = null;
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

    public void inserirFim(int valor) {
        Noh novo = new Noh(valor);
        if (this.primeiro == null) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            this.ultimo.setProximo(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
        }
    }

    public int nroPares() {

        int cont = 0;
        Noh aux = this.primeiro;
        while (aux != null) {
            if (aux.getValor() % 2 == 0) {
                cont++;
            }
            aux = aux.getProximo();
        }
        return cont;
    }

    public int addOrdenado(int valor) {
        Noh novo = new Noh(valor);
        
        if (this.primeiro == null) {
            // Caso a lista esteja vazia, o novo nó se torna o primeiro e o último da lista
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            if (valor > this.ultimo.getValor()) {
                // Se o valor for maior do que o último elemento, insere o novo nó no final da lista
                this.ultimo.setProximo(novo);
                novo.setAnterior(this.ultimo);
                this.ultimo = novo;
            } else {
                Noh atual = this.primeiro;
                
                while (atual != null) {
                    if (valor <= atual.getValor()) {
                        // Se o valor for menor ou igual ao valor do nó atual, insere o novo nó antes dele
                        Noh anterior = atual.getAnterior();
                        
                        if (anterior == null) {
                            // Se o nó atual for o primeiro da lista, atualiza o primeiro nó
                            this.primeiro = novo;
                        } else {
                            anterior.setProximo(novo);
                        }
                        
                        novo.setAnterior(anterior);
                        novo.setProximo(atual);
                        atual.setAnterior(novo);
                        
                        return valor;
                    }
                    
                    atual = atual.getProximo();
                }
            }
        }
        
        return valor;
    }
    

}