



public class App {
    public static void main(String[] args) {
        int[] numeros = {51, 57, 98, 19, 11, 45, 79};
        ArvoreAVL arvore = new ArvoreAVL();

        for (int numero : numeros) {
            arvore.raiz = arvore.inserir(arvore.raiz, numero);
            System.out.println("Inserindo " + numero + ":");
            arvore.percursoEmOrdem(arvore.raiz);
            System.out.println("\n");
        }
    }
}
