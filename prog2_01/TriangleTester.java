// 課題: 三角形クラスのテスタークラス TriangleTester.java

public class TriangleTester {
    public static void main(String[] args) {
    int n=10;
        Triangle[] triangles = new Triangle[n];
        triangles[0]= new Triangle(4,5,6);
        triangles[1]= new Triangle(4,5);
        triangles[2]= new Triangle(4);
        triangles[3]= new Triangle(4,5,6);
        System.out.println("三辺の長さ "+triangles[0].toString());
        System.out.println("二等辺三角形 "+triangles[0].isIsoscales());
        System.out.println("正三角形 " +triangles[0].isEquilateral());
        System.out.println("三角形の成立 "+triangles[0].isInequality());
        System.out.println("a=4,b=5,c=6の三角形と合同 "+triangles[0].isEqual(triangles[3]));
        System.out.println();
        System.out.println("三辺の長さ "+triangles[1].toString());
        System.out.println("二等辺三角形 "+triangles[1].isIsoscales());
        System.out.println("正三角形 " +triangles[1].isEquilateral());
        System.out.println("三角形の成立 "+triangles[1].isInequality());
        System.out.println("a=4,b=5,c=6の三角形と合同 "+triangles[1].isEqual(triangles[3]));
        System.out.println();
        System.out.println("三辺の長さ "+triangles[2].toString());
        System.out.println("二等辺三角形 "+triangles[2].isIsoscales());
        System.out.println("正三角形 " +triangles[2].isEquilateral());
        System.out.println("三角形の成立 "+triangles[2].isInequality());
        System.out.println("a=4,b=5,c=6の三角形と合同 "+triangles[2].isEqual(triangles[3]));
        
    }  
}
