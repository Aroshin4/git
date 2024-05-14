//課題: 方程式のクラス階層 Equation.java
abstract class Equation{
    private String name;
    abstract void print();
    abstract void solve();
    public String getName(){
        return name;
    }
    public Equation(String name) {
        this.name = name;
    }
}