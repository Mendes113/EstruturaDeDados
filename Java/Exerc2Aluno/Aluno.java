public class Aluno {

    public static void main (String[] args) {
        
        Vetor vetNotas = new Vetor();
        
        vetNotas.adiciona("andre");
        vetNotas.adiciona("andre");
        vetNotas.adiciona("andre");
        vetNotas.adiciona("andre");
        vetNotas.adiciona("andre");
       


        System.out.println(vetNotas.totalNomes);
        System.out.println(vetNotas.getnomes()[0]);




        vetNotas.contem("andre");
        
    }
    




}

