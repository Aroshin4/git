import java.util.Scanner;

class ShapeTester2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("図形は何個：");
		int no = stdIn.nextInt();			// 図形の個数を読み込む
		Shape[] p = new Shape[no];

		for (int i = 0; i < no; i++) {
			int type;
			do {
				System.out.print((i + 1) + "番の図形の種類（1…点／2…水平直線" +
													"／3…垂直直線／4…長方形／5.右半円／6.上半円）：");
				type = stdIn.nextInt();
			} while (type < 1 || type > 6);

			switch (type) {
			 case 1: p[i] = new Point();					// 点
						break;

			 case 2:												// 直線
			case 3: System.out.print("長さ：");
						int len = stdIn.nextInt();
						p[i] = (type == 2) ? new HorzLine(len) : new VertLine(len);
						break;

			 case 4: System.out.print("幅　：");		// 長方形
						int width = stdIn.nextInt();
						System.out.print("高さ：");
						int height = stdIn.nextInt();
						p[i] = new Rectangle(width, height);
						break;
			case 5: System.out.print("半径の長さ：");
			int radius = stdIn.nextInt();
			p[i] = new RightSemicircle(radius);
			case 6: System.out.print("半径の長さ：");
			int radius2 = stdIn.nextInt();
			p[i] = new UpperSemicircle(radius2);
			}
		}

		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}
