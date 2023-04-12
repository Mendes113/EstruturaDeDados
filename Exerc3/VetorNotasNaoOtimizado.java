

public class VetorNotasNaoOtimizado implements Ivetor{
	
	private double notas[] = new double[5];
	
	public void adiciona(double nota) {
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == 0) {
				this.notas[i] = nota;
				break;
			}
		}
	}
	
	public int tamanho() {
		int tamanho = 0;
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == 0) {
				
				break;
			}
			tamanho++;
		}
		return tamanho;
	}
	
	public boolean contem(int nota) {
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == nota) {
				return true;
			}
		}
		return false;
	}

	public boolean cheio() {
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean contem() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'contem'");
	}

	@Override
	public boolean remove(double elem) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'remove'");
	}

}
