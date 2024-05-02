// mainメソッドを含むTrianglesTesterクラスを書く

public class TrianglesTester{
	 
	 public static void main(String args[]){

		  // 3種類のクラスのインスタンスをそれぞれ生成
		  Triangle[] triangles = {
				new Triangle(3, 4, 5),
				??? ???(2,1),
				??? ???(3)
		  };

		  // 各インスタンスの情報を表示
		  for(int i = 0;i < triangles.???; i++){
				System.out.println(???[i]);
		  } 

		  // 三辺が異なる三角形となるように更新
		  System.out.println("set(4,5,6)");
		  for(int i = 0;i < triangles.???; i++){
				???[i].set(4, 5, 6);
				System.out.println(???[i]);
		  } 

		  // 二等辺三角形となるように更新
		  System.out.println(???);
		  for(int i = 0;i < triangles.???; i++){
				???[i].set(3, 3, 1);
				System.out.println(???[i]);
		  }

		  // 正三角形となるように更新
		  System.out.println(???);
		  for(int i = 0;i < triangles.???; i++){
				???[i].set(4, ???, ???);
				System.out.println(???[i]);
		  }

		  // 三角形にならない形で更新
		  System.out.println(???);
		  for(int i = 0;i < triangles.???; i++){
				???[i].set(???, ???, ???);
				System.out.println(???[i]);
		  }
		  
	 }
}
