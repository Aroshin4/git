// TriangleクラスのサブクラスIsoscelesTriangleクラスを書く(???を適切に直す)

public class IsoscelesTriangle ??? Triangle{
	 
	 private double side, bottom; // 斜辺(等しい長さの2辺), 底辺(残りの辺) 
	 
	 public IsoscelesTriangle(double s, double b){
		  super(s, ???, b);
		  side = s;
		  bottom = b;
	 }  
	 
	 ??? String toString(){
		  return super.???() + " 二等辺三角形: 斜辺=" + side + " 底辺=" + ???;
	 }
	 
	 public boolean set(double a, double b , double c){
		  if(a == b && super.???(a, b, c)){
				side = a; bottom = ???; return ???;
		  }else if(b == c && ???.???(a, b, c)){
				side = b; bottom = a; return ???;
		  }else if(c == ??? && ???.???(a, b, c)){
				side = c; bottom = b; return ???;
		  }
		  return ???;
	 }
	 
}
