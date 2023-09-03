public class App {
    public static void main(String[] args) throws Exception {
        ABB arvore = new ABB();

        arvore.add(10);
        arvore.add(5);
        arvore.add(15);
        arvore.add(2);
        arvore.add(7);

       boolean result = arvore.contains(7);


        System.out.println(result);

        boolean result2 = arvore.contains(8);

        System.out.println(result2);


        arvore.imprimePreOrdem();
    }
}
