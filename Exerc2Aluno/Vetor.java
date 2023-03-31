import javax.print.FlavorException;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Vetor {

        int totalNomes = 0;
        private String[] nomes = new String[5];
        public void adiciona (String nomes){
          this.nomes[this.totalNomes] = nomes;
            this.totalNomes++;
        }
    


        public String[] getnomes() {
            return nomes;
        }
    

        public boolean contem (String nomes){
            for (int i = 0; i < this.totalNomes; i++){
                if (this.nomes[i] == nomes){
                    System.out.println("O nome " + nomes + " está no vetor");
                    return true;
                }
                
            }
            return false;
        }

        public int tamanho(){
            return this.totalNomes;
        }


}
