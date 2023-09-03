public class Noh {

    private int info; //este exemplo armazena números inteiros
    private Noh ant; //destaque para o atributo ant de anterior
    private Noh prox;
    public Noh (int info){
    this.info = info;
    this.ant = null;
    this.prox = null;
    }
    public int getInfo() { 
        return this.info;
     }
    public Noh getProx() { 
        return this.prox;
    }
    public void setProx(Noh n) { this.prox = n; }
    public Noh getAnt() { 
        return this.ant;
    }
    public void setAnt(Noh n) { this.ant = n; }




}