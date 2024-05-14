// SinPGraphのサブクラスのSawToothPGraphクラスを書く

public class SawToothPGraph extends SinPGraph{

	public SawToothPGraph(char symbol, double amplitude, double period){
		super(symbol,amplitude,period);
	}

	@Override public int getY(int x){
		return  (int)(amplitude*20*(x / (period *X_MAX)-Math.floor(x / (period* X_MAX) +0.5)));
	}

}
