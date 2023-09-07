public class Calc {
    private double a;
    private double b;

    public double add(double a, double b){
        return a+b;
    }
    public double substract(double a, double b){
        return a-b;
    }
    public double multiple(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Calc(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
