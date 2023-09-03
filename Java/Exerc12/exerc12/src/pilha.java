public class pilha implements IPilha{
    private Noh inicio;
    private Noh fim;

    public pilha() {
        this.inicio = null;
        this.fim = null;
    }


    @Override
    public void push(Object info) {
        Noh novo = new Noh(info);
        if(this.isEmpty()){
            inicio = novo;

        }
        else{
            fim.setProximo(novo);   
        }
        fim = novo;
        
    }

    @Override
    public Object pop() {
        Object info = null;
        if (!this.isEmpty()){
        info = inicio.getInfo();
        inicio = inicio.getProximo();
        }
        return info;

    }
    @Override
    public Object top() {
        if(this.isEmpty()){
            return null;
        }
        else{
           
            return inicio;
        }

    }


    public boolean topString(){
        if(this.top().equals(inicio)){
            String nome = ((Pessoa)inicio.getInfo()).getNome();
            System.out.println(nome);
            return true;
        }
        return false;
    }

    public boolean printAlunos() {
        Noh aux = inicio;
        while (aux != null) {
            if (aux.getInfo() instanceof Pessoa) {
                Pessoa a = (Pessoa) aux.getInfo();
                System.out.println(a.getNome()); // Imprime o nome do aluno
               
                System.out.println(" ----------------------------------");
            }
            aux = aux.getProximo();
        }
        return true;
    }

    @Override
    public int size() {
        
            int tamanho = 0;
            Noh atual = inicio;
    
            while (atual != null) {
                tamanho++;
                atual = atual.getProximo();
            }
    
            return tamanho;
        
    }

    @Override
    public boolean isEmpty() {
        if(this.inicio == null){
            return true;
        }
        return false;
    }
    
}
