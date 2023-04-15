public class Noh {
    private Object info;
  
    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    private Noh proximo;

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

    public Noh(Object info) {
        this.info = info;
        this.proximo = null;

    }
}