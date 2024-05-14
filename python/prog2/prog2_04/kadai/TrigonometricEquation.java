//課題: 方程式のクラス階層 TrigonometricEquation.java
class TrigonometricEquation extends Equation {
    private double a;

    public TrigonometricEquation(String name, double x) {
        super(name);
        a = x;
    }
    @Override public void print() {
        System.out.println(getName() + ": sin(x) + ("+a+") = 0 ");
    }
    @Override public void solve() {
        double ans = Math.asin(-a);
        System.out.println("解: x =" + ans +"+ 2nπ");
    }
}
