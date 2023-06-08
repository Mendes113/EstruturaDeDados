public class Noh {
    
    private Noh proximo;
    private Object info;

    public Noh(Object info) {
        this.proximo = null;
        this.info = info;
    }

 

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    
}
