// Triangleクラスを書く(???を適切に直す)
public class Triangle{
	
	private double a, b, c; // 3辺の長さ
	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public String toString() {
		return "三角形 a=" + a + " b=" + b + " c=" + c;
	}
	public boolean set(double a, double b, double c){
		  // 三角形として成立するかを検査する処理を追加
		if((a+b)>c&&(b+c)>a&&(c+a)>b){
			this.a = a;
			this.b = b;
			this.c = c;
			return true;
	}else{
		return false;
	}
}
}
