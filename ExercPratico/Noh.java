public class Noh {

    private int valor;
    private Noh proximo;
    private Noh anterior;

    public Noh(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    public int getValor() {
        return this.valor;
    }

    public Noh getProximo() {
        return this.proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

    public Noh getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Noh anterior) {
        this.anterior = anterior;
    }

    public String toString() {
        return "Valor: " + this.valor;
    }
    
}
