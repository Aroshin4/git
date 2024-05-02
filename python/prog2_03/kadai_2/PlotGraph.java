// PlotGraphクラスを書く

public class PlotGraph{

	public static final int X_MIN = 0;
	public static final int X_MAX = 40;

	public static final int Y_MAX = 10;
	public static final int Y_MIN = - Y_MAX;

	private static char buffer[][] = new char[Y_MAX - ??? + 1][??? - ??? + 1]; // y座標順

	public static void clear(){
		for(char[] b : ???)
			for(int i = 0;i < b.???; i++) b[i] = ' ';
	}

	public static void println(){
		for(char[] b : ???)
			System.out.println(new String(b));
	}

	private char symbol;	

	public PlotGraph(char symbol){ ??? = symbol; }

	public int getY(int x){ return 0; }

	public void plot(){
		for(int x = X_MIN; x <= X_MAX; x++){
			int y = - getY(???);
			if(Y_MIN <= y && ???){
				buffer[y - ???][??? - ???] = symbol; // y座標順
			}
		}
	}

}
