public class App {
    
    public static void main(String[] args) throws Exception {
        
        Vetor vetor = new Vetor();
        int [] vetor1 = vetor.gerarVetor(99);
        int [] vetor2 = vetor.gerarVetor2(99);

        vetor.intersecaoVetores(vetor1, vetor2);



    }

}
