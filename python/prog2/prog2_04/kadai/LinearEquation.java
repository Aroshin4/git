//課題: 方程式のクラス階層 EquationTester.java
class LinearEquation extends Equation{
    private double a;
    private double b;
    public LinearEquation(String name, double x, double y) {
        super(name);
        a = x;
        b = y;
    }
    @Override void print() {
            System.out.println(getName()+": "+a+"x + ("+b+") = 0 ");
        } 
    @Override void solve(){
        double x = (-b) / a;
        System.out.println("解: x = " + x);
    }
}
