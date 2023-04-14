

public class Main {

	public static void main(String[] args) {
		
		VetorNotasOtimizado vetNotas = new VetorNotasOtimizado();
		Aluno a = new Aluno("andre", 10, 20);
		vetNotas.adiciona(10);
		vetNotas.adiciona(10);
		vetNotas.adiciona(2);
		vetNotas.adiciona(3);

		System.out.println(vetNotas.contem(10));
		System.out.println(vetNotas.contem(2));
		System.out.println(vetNotas.contem(1));

	vetNotas.remove(10);
	System.out.println(vetNotas.contem(10));
	vetNotas.remove(3);
	System.out.println(vetNotas.contem(3));

	System.out.println(vetNotas.tamanho());
	

	vetNotas.adiciona(a);
	System.out.println(vetNotas.contem(a));

	vetNotas.remove(a);

	System.out.println(vetNotas.contem(a));



		


	}

}
