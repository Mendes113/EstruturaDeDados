
public class VetorNotasOtimizado implements Ivetor{
	
	private Object vetor[] = new Object[5];

	private int totalObjetos = 0;
	@Override
	public void adiciona(double obj) {
		this.vetor[totalObjetos] = obj;
		totalObjetos++;
	}

	public void adiciona(Object obj) {
		this.vetor[totalObjetos] = obj;
		totalObjetos++;
	}



	public int tamanho() {
		return totalObjetos;
	}



	@Override
public boolean contem(double nota) {
    for(int i=0; i < this.totalObjetos; i++) {
        if(this.vetor[i] != null) {
            if(this.vetor[i] instanceof Aluno){
                Aluno a = (Aluno) this.vetor[i];
                if(a.getNota() == nota) {
                    return true;
                }
            } else if(this.vetor[i] instanceof Double){
                Double n = (Double) this.vetor[i];
                if(n.doubleValue() == nota) {
                    return true;
                }
            }
        }
    }
    return false;
}

	public boolean contem(String nome) {
		for(int i=0; i < this.totalObjetos; i++) {
			if(this.vetor[i] != null) {
				if(this.vetor[i] instanceof Aluno){
					Aluno a = (Aluno) this.vetor[i];
					if(a.getNome().equals(nome)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean contem(Object obj) {
		for(int i=0; i < this.totalObjetos; i++) {
			if(this.vetor[i] != null) {
				if(this.vetor[i].equals(obj)) {
					return true;
				}
			}
		}
		return false;
	}

	


	

	@Override
	public boolean cheio() {
		if(this.totalObjetos == this.vetor.length) {
			return true;
		}
		return false;
	}
		
	

	@Override
	public boolean remove(double elem) {
		if(this.contem(elem)) {
			for(int i=0; i < this.totalObjetos; i++) {
				if(this.vetor[i] != null) {
					if(this.vetor[i] instanceof Aluno){
						Aluno a = (Aluno) this.vetor[i];
						if(a.getNota() == elem) {
							this.vetor[i] = null;
							totalObjetos--;
							return true;
						}
					}else if(this.vetor[i] instanceof Double){
						Double n = (Double) this.vetor[i];
						if(n.doubleValue() == elem) {
							this.vetor[i] = null;
							totalObjetos--;
							return true;
						}
					}
				}
			}
		}
		return false;
	}


	public boolean remove(Object object){
		if(this.contem(object)) {
			for(int i=0; i < this.totalObjetos; i++) {
				if(this.vetor[i] != null) {
					if(this.vetor[i].equals(object)) {
						this.vetor[i] = null;
						totalObjetos--;
						return true;
					}
				}
			}
		}
		return false;
	}

	

	

	


	


	
}
