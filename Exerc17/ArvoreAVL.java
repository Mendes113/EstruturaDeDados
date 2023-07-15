class ArvoreAVL {
    No raiz;

    int altura(No no) {
        if (no == null)
            return 0;
        return no.altura;
    }

    int fatorBalanceamento(No no) {
        if (no == null)
            return 0;
        return altura(no.esquerda) - altura(no.direita);
    }

    No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }

    No inserir(No no, int chave) {
        if (no == null)
            return new No(chave);

        if (chave < no.chave)
            no.esquerda = inserir(no.esquerda, chave);
        else if (chave > no.chave)
            no.direita = inserir(no.direita, chave);
        else
            return no;

        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));

        int balanceamento = fatorBalanceamento(no);

        if (balanceamento > 1 && chave < no.esquerda.chave)
            return rotacaoDireita(no);

        if (balanceamento < -1 && chave > no.direita.chave)
            return rotacaoEsquerda(no);

        if (balanceamento > 1 && chave > no.esquerda.chave) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        if (balanceamento < -1 && chave < no.direita.chave) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    void percursoEmOrdem(No no) {
        if (no != null) {
            percursoEmOrdem(no.esquerda);
            System.out.print(no.chave + " ");
            percursoEmOrdem(no.direita);
        }
    }
}