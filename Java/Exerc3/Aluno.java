public class Aluno {
    private String nome;
	private double nota;


    public Aluno(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }
    

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
