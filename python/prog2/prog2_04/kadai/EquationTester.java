//課題: 方程式のクラス階層 EquationTester.java
public class EquationTester {
    public static void main(String[] args) {
        Equation[] equations = new Equation[3];
        equations[0] = new LinearEquation("線形方程式", 3.0, 5.0);
        equations[1] = new QuadraticEquation("二次方程式", 3.0, -5.0, 7.0);
        equations[2] = new TrigonometricEquation("三角方程式", 0.2);

        for (Equation a : equations) {
            a.print();
            a.solve();
            System.out.println();
        }
    }
}