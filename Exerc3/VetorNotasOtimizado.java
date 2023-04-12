
public class VetorNotasOtimizado implements Ivetor{
	private String nomes[] = new String[5];
	private double notas[] = new double[5];
	private Object vetor[] = new Object[5];

	private int totalNotas = 0;
	private int totalNomes = 0;
	private int totalObjetos = 0;
	
	public void adiciona(double nota) {
		this.notas[totalNotas] = nota;
		totalNotas++;
	}

	public Object[] getVetor() {
		return vetor;
	}

	public void setVetor(Object vetor[]) {
		this.vetor = vetor;
	}

	public void adiciona(String nomes) {
		this.nomes[totalNomes] = nomes;
		totalNomes++;
	}

	public void adiciona(Object objeto) {
		this.getVetor()[totalObjetos] = objeto;
		totalObjetos++;
	}
	
	

	public int tamanhoNomes() {
		return totalNomes;
	}

	public int tamanhoObjetos() {
		return totalObjetos;
	}


	public boolean contemNomes(String nomes) {
		for(int i=0; i < this.totalNomes; i++) {
			if(this.nomes[i] == nomes) {
				return true;
			}
		}
		return false;
	}


	public int tamanho() {
		return totalNotas;
	}
	
	public boolean contem(int nota) {
		for(int i=0; i < this.totalNotas; i++) {
			if(this.notas[i] == nota) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contem() {
		return false;
		
	}


	

	@Override
	public boolean cheio() {
		for(int i=0; i < this.totalNotas; i++) {
			if(this.notas[i] == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean remove(double elem) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'remove'");
	}
	
}
