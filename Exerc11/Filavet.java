
    public class Filavet implements IFIla {//tem funcionamento circular
        private int nElemFila;
        private int inicio;

        public Filavet(int tamanhoMaximo) {
            this.vetFila = new Object[tamanhoMaximo];
            this.nElemFila = 0;
            this.inicio = 0;
        }

        
        private Object[] vetFila;
        public boolean remove() { //método que retira da fila
        if (this.isEmpty()){ //como verificar se está vazia?
        System.out.println("Fila estah vazia");
        return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
        }


        @Override
        public boolean add(Object info) {
            if (this.isFull()) { // verificar se a fila está cheia
                System.out.println("Fila está cheia");
                return false;
            }
            int posicao = (this.inicio + this.nElemFila) % this.vetFila.length;
            this.vetFila[posicao] = info;
            this.nElemFila++;
            return true;
        }
        @Override
        public boolean isEmpty() {
            return this.nElemFila == 0;
        }
        @Override
        public int size() {
            return this.nElemFila;
        }

        public boolean isFull() {
            return this.nElemFila == this.vetFila.length;
        }
}
