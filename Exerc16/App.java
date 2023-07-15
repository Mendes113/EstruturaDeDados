public class App {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserindo elementos na árvore
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("Árvore Largura:");
        arvore.imprimeLargura();
        
        // Imprimindo a árvore em ordem
        System.out.println("Árvore em ordem:");
        arvore.emOrdem();
        System.out.println();

        // Teste de remoção - Caso 1: Removendo folha (20)
        arvore.remover(20);
        System.out.println("Árvore após remoção da folha (20):");
        arvore.emOrdem();
        System.out.println();
        System.out.println("Árvore Largura:");
        arvore.imprimeLargura();

        // Teste de remoção - Caso 2: Removendo nó com um filho (30)
        arvore.remover(30);
        System.out.println("Árvore após remoção do nó com um filho (30):");
        arvore.emOrdem();
        System.out.println();
        System.out.println("Árvore Largura:");
        arvore.imprimeLargura();

        // Teste de remoção - Caso 3: Removendo nó com dois filhos (50)
        arvore.remover(50);
        System.out.println("Árvore após remoção do nó com dois filhos (50):");
        arvore.emOrdem();
        System.out.println();
        System.out.println("Árvore Largura:");
        arvore.imprimeLargura();
        

        // Teste de remoção - Caso especial: Removendo raiz com um filho (70)
        arvore.remover(70);
        System.out.println("Árvore após remoção da raiz com um filho (70):");
        arvore.emOrdem();
        System.out.println();
        System.out.println("Árvore Largura:");
        arvore.imprimeLargura();
    }
}
