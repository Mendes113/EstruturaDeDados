import java.util.Random;



public class Vetor {

    Random random = new Random();

    public int[] gerarVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100);
        }
        return vetor;
    }

    public int[] gerarVetor2(int tamanho) {
        int[] vetor2 = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = random.nextInt(100);
        }
        
        return vetor2;
    }

    public void intersecaoVetores(int[] vetor, int[] vetor2) {
        int maxSize = Math.min(vetor.length, vetor2.length);
        int[] vetor3 = new int[maxSize];
        int cont = 0;
    
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor[i] == vetor2[j]) {
                    vetor3[cont] = vetor[i];
                    cont++;
                    break;  // Break the inner loop to avoid duplicate entries in vetor3
                }
            }
        }
    
        for (int i = 0; i < cont; i++) {
            System.out.println(vetor3[i]);
        }
    }



    
    


}   
