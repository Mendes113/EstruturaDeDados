public class MapHashVetor {
    private Aluno[] vetor;

    public MapHashVetor() {
        this.vetor = new Aluno[20];
    }

    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    public void put(int chave, Aluno aluno) {
        int index = hash(chave);
        vetor[index] = aluno;
    }

    public Aluno get(int chave) {
        int index = hash(chave);
        return vetor[index];
    }


    public int getHash(int chave) {
        return hash(chave);
    }


    public Aluno remove(int chave) {
        int index = hash(chave);
        Aluno aluno = vetor[index];
        vetor[index] = null;
        return aluno;
    }

}
