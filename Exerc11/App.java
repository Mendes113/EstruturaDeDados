public class App {
    public static void main(String[] args) {
        Filavet fila = new Filavet(3);
        
        
        System.out.println("Fila está vazia? " + fila.isEmpty());
        
       
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");
        
       
        System.out.println("Tamanho da fila: " + fila.size());
        
       
        fila.remove();
        
      
        System.out.println("Tamanho da fila: " + fila.size());
        
        
        fila.remove();
        
        
        System.out.println("Fila está vazia? " + fila.isEmpty());
    }
}
