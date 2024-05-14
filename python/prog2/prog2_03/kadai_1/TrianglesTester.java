// mainメソッドを含むTrianglesTesterクラスを書く

public class TrianglesTester{
	
	public static void main(String args[]){

		  // 3種類のクラスのインスタンスをそれぞれ生成
		Triangle[] triangles = {
				new Triangle(3, 4, 5),
				new IsoscelesTriangle(2,1),
				new EquilateralTriangle(3)
		};

		  // 各インスタンスの情報を表示
		System.out.println("各インスタンスの情報を表示");
		for(int i = 0;i < triangles.length; i++){
				System.out.println(triangles[i]);
		} 
		System.out.println();
		  // 三辺が異なる三角形となるように更新
		System.out.println("三辺が異なる三角形となるように更新");
		System.out.println("set(4,5,6)");
		for(int i = 0;i < triangles.length; i++){
				triangles[i].set(4, 5, 6);
				System.out.println(triangles[i]);
		} 
		System.out.println("二等辺三角形となるように更新");
		  // 二等辺三角形となるように更新
		System.out.println();
		System.out.println("set(3,3,1)");
		for(int i = 0;i < triangles.length; i++){
				triangles[i].set(3, 3, 1);
				System.out.println(triangles[i]);
		}
		System.out.println();
		  // 正三角形となるように更新
		System.out.println("正三角形となるように更新");
		System.out.println("set(4,4,4)");
		for(int i = 0;i < triangles.length; i++){
				triangles[i].set(4,4,4);
				System.out.println(triangles[i]);
		}
		System.out.println();
		  // 三角形にならない形で更新
		System.out.println("三角形にならない形で更新");
		System.out.println("set(1,1,30)");
		for(int i = 0;i < triangles.length; i++){
				triangles[i].set(1, 1, 30);
				System.out.println(triangles[i]);
		}
		
	}
}
