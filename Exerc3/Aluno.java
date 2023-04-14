public class Aluno {
    private String nome;
	private double nota;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
    public int getIdade() {
        return idade;
    }
    private int idade;
}
