import java.util.LinkedList;
import java.util.Queue;

class ArvoreBinaria {
    Noh raiz;

    ArvoreBinaria() {
        raiz = null;
    }

    void inserir(int chave) {
        raiz = inserirRec(raiz, chave);
    }

    Noh inserirRec(Noh raiz, int chave) {
        if (raiz == null) {
            raiz = new Noh(chave);
            return raiz;
        }

        if (chave < raiz.valor)
            raiz.esq = inserirRec(raiz.esq, chave);
        else if (chave > raiz.valor)
            raiz.dir = inserirRec(raiz.dir, chave);

        return raiz;
    }

    void remover(int chave) {
        raiz = removerRec(raiz, chave);
    }

    Noh removerRec(Noh raiz, int chave) {
        if (raiz == null)
            return raiz;

        if (chave < raiz.valor)
            raiz.esq = removerRec(raiz.esq, chave);
        else if (chave > raiz.valor)
            raiz.dir = removerRec(raiz.dir, chave);
        else {
            if (raiz.esq == null)
                return raiz.dir;
            else if (raiz.dir == null)
                return raiz.esq;

            raiz.valor = valorMinimo(raiz.dir);
            raiz.dir = removerRec(raiz.dir, raiz.valor);
        }
        return raiz;
    }

    int valorMinimo(Noh raiz) {
        int min = raiz.valor;
        while (raiz.esq != null) {
            min = raiz.esq.valor;
            raiz = raiz.esq;
        }
        return min;
    }

    void preOrdem() {
        preOrdem(raiz);
    }

    private void preOrdem(Noh no) {
        if (no != null) {
            System.out.println(no.valor);
            preOrdem(no.esq);
            preOrdem(no.dir);
        }
    }

    void emOrdem() {
        emOrdem(raiz);
    }

    private void emOrdem(Noh no) {
        if (no != null) {
            emOrdem(no.esq);
            System.out.println(no.valor);
            emOrdem(no.dir);
        }
    }

    void posOrdem() {
        posOrdem(raiz);
    }

    private void posOrdem(Noh no) {
        if (no != null) {
            posOrdem(no.esq);
            posOrdem(no.dir);
            System.out.println(no.valor);
        }
    }

void imprimeLargura() {
    if (isEmpty())
        return;

    Queue<Noh> fila = new LinkedList<>();
    fila.add(raiz);

    while (!fila.isEmpty()) {
        int tamanhoFila = fila.size();
        for (int i = 0; i < tamanhoFila; i++) {
            Noh noAtual = fila.poll();
            System.out.print(noAtual.valor + " ");

            if (noAtual.esq != null)
                fila.add(noAtual.esq);

            if (noAtual.dir != null)
                fila.add(noAtual.dir);
        }
        System.out.println();
    }
}
    boolean isEmpty() {
        return raiz == null;
    }
}