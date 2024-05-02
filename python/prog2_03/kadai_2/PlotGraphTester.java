// mainメソッドを含むPlotGraphTesterクラスを書く

class PlotGraphTester{

	public static void main(String args[]){

		PlotGraph virtPlotGraphs[] = {
			new PlotGraph('0'),
			new SinPGraph('1', 1, 1),
			new ???('2', 1, 1),
		};

		PlotGraph.clear();
		for(PlotGraph g : virtPlotGraphs) g.???();
		PlotGraph.println();

		System.out.println("-----");

		((???)virtPlotGraphs[1]).???(2);
		((???)virtPlotGraphs[2]).???(.5);

		PlotGraph.???();
		for(PlotGraph g : virtPlotGraphs) g.???();
		PlotGraph.???();

	}

}

