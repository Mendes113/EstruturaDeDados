public class App {
    public static void main(String[] args) {
        
        Lista l = new LSE();
      

        l.insereInicio(10);
        l.insereInicio(20);
        l.insereInicio(30);
        l.insereFim(40);
        l.insereFim(50);
        l.insereFim(60);
        System.out.println(l.tamanho());
      
    }
}
