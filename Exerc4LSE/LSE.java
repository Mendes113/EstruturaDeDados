import java.text.BreakIterator;

import javax.lang.model.util.ElementScanner14;

public class LSE implements Lista {
    private Noh inicio;
    Noh ant, p;
    Noh ultimo;
    private int tamanho;

    public LSE() {
        this.inicio = null;
    }

    @Override
    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        novo.setProximo(inicio);
        inicio = novo;
        this.tamanho++;
    }

    

    @Override
    public boolean estahVazia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int tamanho() {
        int cont = 0;
        for (Noh i = inicio; i != null; i = i.getProximo()) {
            cont++;
        }
        return cont;
    }

    @Override
    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
        } else {
            Noh aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
    
            }
            aux.setProximo(novo);
        }
        this.tamanho++;
    }
        

    @Override
    public boolean remove(Object info) {
        
        p = inicio;
        while (p != null && p.getInfo() != info) { // busca
            ant = p;
            p = p.getProximo();
        }
        if (p == null) // não achou, então não faz nada e retorna false
            return false;
        if (ant == null) // retira info do início
            inicio = p.getProximo();
        else
            ant.setProximo(p.getProximo());
        return true;

    }

    }
