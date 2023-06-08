import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        MapHashVetor map = new MapHashVetor();
        Aluno aluno1 = new Aluno("João", 123);
        Aluno aluno2 = new Aluno("Maria", 456);
        Aluno aluno3 = new Aluno("José", 789);
        Aluno aluno4 = new Aluno("Ana", 101);
        Aluno aluno5 = new Aluno("Carlos", 112);
        Aluno aluno6 = new Aluno("Mariana", 131);
        Aluno aluno7 = new Aluno("Fernando", 415);
        Aluno aluno8 = new Aluno("Cristina", 161);
        Aluno aluno9 = new Aluno("Paulo", 718);
        Aluno aluno10 = new Aluno("Sandra", 191);

        map.put(aluno1.getChave(), aluno1);
        map.put(aluno2.getChave(), aluno2);
        map.put(aluno3.getChave(), aluno3);
        map.put(aluno4.getChave(), aluno4);
        map.put(aluno5.getChave(), aluno5);
        map.put(aluno6.getChave(), aluno6);
        map.put(aluno7.getChave(), aluno7);
        map.put(aluno8.getChave(), aluno8);
        map.put(aluno9.getChave(), aluno9);
        map.put(aluno10.getChave(), aluno10);

        int chaveBusca = 789;
        Aluno alunoEncontrado = map.get(chaveBusca);
        if (alunoEncontrado != null) {
            int hash = map.getHash(chaveBusca);
            System.out.println("Aluno encontrado: " + alunoEncontrado.getNome() + " - Hash: " + hash);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        // Removendo um aluno pelo chave
        int chaveRemocao = 456;
        Aluno alunoRemovido = map.remove(chaveRemocao);
        if (alunoRemovido != null) {
            System.out.println("Aluno removido: " + alunoRemovido.getNome());
        } else {
            System.out.println("Aluno não encontrado para remoção.");
        }

        int chaveBusca2 = 456;
        Aluno alunoEncontrado2 = map.get(chaveBusca2);
        if (alunoEncontrado2 != null) {
            int hash = map.getHash(chaveBusca2);
            System.out.println("Aluno encontrado: " + alunoEncontrado2.getNome() + " - Hash: " + hash);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
