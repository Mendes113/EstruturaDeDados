public class LDE implements Lista {//TAD Lista duplamente encadeada
    private Noh inicio;
    private Noh fim;
    public LDE (){
    this.inicio = null;
    this.fim = null;
    }

    public void insereInicio(Object info) { //info = 5
        Noh novo = new Noh(info);
        if (inicio == null){
        inicio = novo;
        fim = novo;
        }else {
        novo.setProx(inicio);
        inicio.setAnt(novo);
        inicio = novo;
        }


        }
        
    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null){
        inicio = novo;
        fim = novo;
        }else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }



      }
    public boolean estahVazia() {  
        if (inicio == null){
            return true;
        }else {
            return false;
        }
        
    }
  
    public int tamanho() { 
        int cont = 0;
        Noh aux = inicio;
        while (aux != null){
            cont++;
            aux = aux.getProx();
        }
        return cont;
     }


     public void imprime() {
        Noh aux = inicio;
        while (aux != null){
            if(aux.getInfo() instanceof Aluno){
                Aluno a = (Aluno) aux.getInfo();
                System.out.println(a.getNome());
            }
            aux = aux.getProx();
        }
    }


     public boolean busca(Object nome){
        Noh aux = inicio;
        while(aux != null){
            if(aux.getInfo() instanceof Aluno){
                Aluno a = (Aluno) aux.getInfo();
                if(a.getNome().equals(nome)) {
                    return true;
                }
            } 
            
            aux = aux.getProx();
        }
        return false; // Retorna false se não encontrar o elemento
    }

    public boolean remove(Object info){
        Noh aux = inicio;
        while (aux != null) {
            if (aux.getInfo().equals(info)) {
                if (aux == inicio) {
                    inicio = inicio.getProx();
                    if (inicio != null) {
                        inicio.setAnt(null);
                    } else {
                        fim = null;
                    }
                } else if (aux == fim) {
                    fim = fim.getAnt();
                    fim.setProx(null);
                } else {
                    aux.getAnt().setProx(aux.getProx());
                    aux.getProx().setAnt(aux.getAnt());
                }
                return true; // retorna true se o elemento foi removido
            }
            aux = aux.getProx();
        }
        return false; // retorna false se o elemento não foi encontrado
    }

    }