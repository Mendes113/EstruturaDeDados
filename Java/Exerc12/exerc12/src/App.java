public class App {
    public static void main(String[] args) throws Exception {
       Pessoa p1 = new Pessoa("João", 20, "123456789");
         Pessoa p2 = new Pessoa("Maria", 30, "987654321");
            Pessoa p3 = new Pessoa("José", 40, "123123123");


            pilha pilha = new pilha();

            pilha.push(p1);
            pilha.push(p2);
            pilha.push(p3);

          

            pilha.pop();
            System.out.println("Topo da pilha aqui: ");
            pilha.topString();
            pilha.pop();

            pilha.printAlunos();





    }
}
