public class App {
        public static void main(String[] args) {    
        Aluno a1 = new Aluno(1, "Joao", 7.5);
        LDE lista = new LDE();
        lista.insereInicio(a1);
        Aluno a2 = new Aluno(2, "Maria", 8.5);
        lista.insereInicio(a2);
        Aluno a3 = new Aluno(3, "Jose", 9.5);
        lista.insereInicio(a3);
        Aluno a4 = new Aluno(4, "Ana", 10);
        lista.insereFim(a4);
        Aluno a5 = new Aluno(5, "Pedro", 5);
        lista.insereInicio(a5);
      lista.imprime();
    System.out.println("Tamanho: " + lista.tamanho());

            System.out.println("Removendo o aluno 3");
            lista.remove(a3);
            lista.imprime();
            System.out.println("Tamanho: " + lista.tamanho());
    

    }
}
