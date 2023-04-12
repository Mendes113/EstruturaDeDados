

public class Main {

	public static void main(String[] args) {
		VetorNotasOtimizado nomes = new VetorNotasOtimizado();
		VetorNotasOtimizado object = new VetorNotasOtimizado();
		nomes.adiciona("Teste");
		nomes.adiciona("Teste2");
		nomes.adiciona("Teste3");
		nomes.adiciona("Teste4");
		

		String nome = "Teste";
		object.adiciona((Object)nome); // casting para Object

		object.adiciona("Teste");

	
		
		String s = "exemplo";
        object.adiciona((Object)s); // casting para Object
        System.out.println(object.getVetor()[0]);
		
		


	}

}
