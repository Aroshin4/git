// mainメソッドを含むMonteCarloTesterクラスを書く
??? java.util.SplittableRandom;

??? ??? MonteCarloTester{

	private ??? static int ITERATION = 10000;
	private ??? static long SEED = 0;

	private static SplittableRandom random = new SplittableRandom(SEED);

	public static ??? area(???){

		int count=0;

		for(int i = 0;i < ITERATION;i++){
			double x = random.nextDouble(1.);		
			double ??? = ???;
	
			if(u.???(x, y)) ???++;	
		}

		return (double)??? / ITERATION;
	}

	public static void main(String args[]){

		UpperBounded funcs[] = {
			??? Proportional(???),
			??? Quadrant(???),
			??? And(??? Proportional(???), ??? Quadrant(???)),
		};

		for(??? f : ???){
			System.out.println(f);
			if(f ??? ???){
				FunctionQI q = ??? f;
				for(double x = 0.; x <= 1.; x += .25){
					System.out.println(String.format(" f(%f) = %f", ???, ???));
				}

			}
			System.out.println(String.format("Area=" + ???));
		}

	}

}

