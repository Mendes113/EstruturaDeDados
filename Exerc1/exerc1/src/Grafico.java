public class Grafico {
    
    private double xa;
    private double ya;
    private double xb;
    public double getXb() {
        return xb;
    }

    private double yb;
    

    public double getYb() {
        return yb;
    }

    public void setYb(double yb) {
        this.yb = yb;
    }

    public Grafico(double xa, double ya,double xb, double yb) {
        this.xa = xa;
        this.ya = ya;
        this.xb = xb;
        this.yb = yb;
    }

    public double getXa() {
        return xa;
    }

    public void setX(double xa) {
        this.xa = xa;
    }

    public double getYa() {
        return ya;
    }

    public void setYa(double ya) {
        this.yb = ya;
    }

    public void calcularDistancia(double xa, double ya, double xb, double yb) {
    
        double distancia = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
        System.out.println("A distancia entre os pontos é: " + distancia);

    }


}
