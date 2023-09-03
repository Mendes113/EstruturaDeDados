public class Aluno {
    private String nome;
    private int chave;
    private Aluno[] vetor;

    public Aluno(String nome, int chave) {
        this.nome = nome;
        this.chave = chave;
        this.vetor = new Aluno[10]; // Set the appropriate size for the array
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChave() {
        return this.chave;
    }

    private int hash(int chave) {
        int index = chave % this.vetor.length;
        while (this.vetor[index] != null && this.vetor[index].getChave() != chave) {
            index = reHash(index); // Chamada para o método reHash
        }
        return index;
    }

    public Aluno get(int chave) {
        int hash = hash(chave);
        return this.vetor[hash];
    }

    public void put(int chave, Aluno valor) {
        int hash = hash(chave);
        this.vetor[hash] = valor;
    }

    public Aluno remove(int chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash] = null;
        return aluno;
    }


    public int reHash(int chave) {
        int index = chave % this.vetor.length;
        while (this.vetor[index] != null) {
            index = (index + 1) % this.vetor.length;
        }
        return index;
    }
    
}
