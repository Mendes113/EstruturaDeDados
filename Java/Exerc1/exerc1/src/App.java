import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
         System.out.println("Digite o valor de xa: ");
            double xa = sc.nextDouble();
            System.out.println("Digite o valor de ya: ");
            double ya = sc.nextDouble();
            System.out.println("Digite o valor de xb: ");
            double xb = sc.nextDouble();
            System.out.println("Digite o valor de yb: ");
            double yb = sc.nextDouble();
            Grafico g = new Grafico(xa,ya,xb,yb);
            g.calcularDistancia(xa,ya,xb,yb);

    }
}
