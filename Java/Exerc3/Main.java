

public class Main {

	public static void main(String[] args) {
		
		VetorNotasOtimizado vetNotas = new VetorNotasOtimizado();
		Aluno a = new Aluno("andre", 10, 20);
		Aluno b = new Aluno("andre", 10, 20);
		Aluno c = new Aluno("andre", 10, 20);
		Aluno d = new Aluno("andre", 10, 20);
		Aluno e = new Aluno("andre", 10, 20);

		vetNotas.adiciona(a);
		vetNotas.adiciona(b);
		vetNotas.adiciona(c);
		vetNotas.adiciona(d);
		vetNotas.adiciona(e);

		System.out.println(vetNotas.tamanho());

		vetNotas.adiciona(a.getNota());
		vetNotas.adiciona(b.getNota());
		vetNotas.adiciona(c.getNota());
		vetNotas.adiciona(d.getNota());
		vetNotas.adiciona(e.getNota());

		System.out.println(vetNotas.tamanho());


		System.out.println(vetNotas.contem(a.getNota()));

		vetNotas.adiciona(a.getNome());
		vetNotas.adiciona(b.getNome());
		vetNotas.adiciona(c.getNome());
		vetNotas.adiciona(d.getNome());
		vetNotas.adiciona(e.getNome());
		
		



		


	}

}
