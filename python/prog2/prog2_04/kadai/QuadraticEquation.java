//課題: 方程式のクラス階層 QuadraticEquation.java
class QuadraticEquation extends Equation {
    private double a;
    private double b;
    private double c;
    int i;
    public QuadraticEquation(String name, double x, double y, double z) {
        super(name);
        a = x;
        b = y;
        c = z;
    }
    @Override public void print() {
        System.out.println(getName()+": "+a+"x^2 +("+b+") x + ("+c+") = 0 ");
    }
    @Override public void solve() {
        double in = (b*b) - (4*a*c);
        if (in < 0) {
            in=-in;
            i = 1;
        }
        if(i==1){
            System.out.println("解: x ="+((-b)/ (2 * a))+"+"+(Math.sqrt(in)/ (2 * a))+"i"+","+((-b)/ (2 * a))+"-"+(Math.sqrt(in)/ (2 * a))+"i");
        }else{
            System.out.println("解: x ="+((-b + Math.sqrt(in)) / (2 * a))+","+((-b - Math.sqrt(in)) / (2 * a)));
        }
    }
}