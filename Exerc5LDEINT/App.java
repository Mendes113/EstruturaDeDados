public class App {
        public static void main(String[] args) {    
        
        LDE lista = new LDE();
   
        lista.insereFim(6);
        lista.insereInicio(5);
        lista.insereFim(7);

        lista.remove(6);
        lista.imprime();

        lista.busca(5);

        lista.remove(5);

        lista.imprime();


    }
}
