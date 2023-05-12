public class LDE implements Lista {//TAD Lista duplamente encadeada
    private Noh inicio;
    private Noh fim;
    public LDE (){
    this.inicio = null;
    this.fim = null;
    }
    public void insereInicio(int info) { //info = 5
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
        
    public void insereFim(int info) {
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
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
     }


     public boolean busca(int info){
        Noh aux = inicio;
    
        while(aux != null){
            if(aux.getInfo() == info){
                System.out.println("Achei");
                return true; // Retorna true se encontrar o elemento
            }
            aux = aux.getProx();
        }
        return false; // Retorna false se não encontrar o elemento
    }

    public boolean remove(int info){
        if(busca(info)){
            if(info == inicio.getInfo()){
                inicio = inicio.getProx();
                inicio.setAnt(null);
            } else if(info == fim.getInfo()){
                fim = fim.getAnt();
                fim.setProx(null);
            } else {
                Noh aux = inicio;
                while(aux.getInfo() != info){
                    aux = aux.getProx();
                }
                aux.getAnt().setProx(aux.getProx());
                aux.getProx().setAnt(aux.getAnt());
            }
            return true; // Retorna true se o elemento foi removido
        }
        return false; // Retorna false se o elemento não foi encontrado
    
    }
    @Override
    public void insereInicio(Object info) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereInicio'");
    }
    @Override
    public void insereFim(Object info) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }
    @Override
    public boolean remove(Object info) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public boolean busca(Object nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'busca'");
    }

    }