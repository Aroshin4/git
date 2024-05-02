// PlotGraphのサブクラスのSinPGraphクラスを書く

public class SinPGraph ???{

	double amplitude;
	double period;

	public SinPGraph(???, double amplitude, double period){
		super(???);
		??? = amplitude;
		??? = period;
	}

	double getAmplitude(){ ???; }
	double getPeriod(){ ???; }

	void setAmplitude(double amplitude){ ??? = amplitude; }
	void setPeriod(double period){ ??? = period; }

	@??? public int ???(int x){
		return (int)(Y_MAX * ??? * Math.sin(x / ??? * 2 * Math.PI / X_MAX));
	}

}
