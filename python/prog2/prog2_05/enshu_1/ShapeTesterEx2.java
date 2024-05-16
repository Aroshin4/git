// 演習問題1: 図形クラス群の拡張2 ShapeTesterEx2.java
class ShapeTesterEx2 {
	public static void main(String[] args) {
		Shape[] p1 = {
			new Rectangle(6, 3),			// 長方形
			new Parallelogram(5, 6),	// 平行四辺形
		};

		for (Shape s : p1) {
			if (s instanceof Plane2D) {
				s.print();
				System.out.println("面積＝" + ((Plane2D)s).getArea());
				System.out.println("周りの長さ＝" + ((Plane2D)s).getPerimeter());
			}
		}
	}
}