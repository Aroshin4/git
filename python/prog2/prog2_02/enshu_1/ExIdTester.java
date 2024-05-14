// 演習1: クラスIdの拡張 ExIdTester.java
// 識別番号クラス（その１）

class ExId {
	private static int counter = 0;		// 何番までの識別番号を与えたか
    private static int step = 1;
	private int id;				// 識別番号

	public ExId() {
			id = counter+step;	
			counter=counter+step;
		}		// 識別番号
	public static void setStep(int a){
		step=a;
	}
	public static int getStep(){
		return ExId.step;
	}
	public static int getMaxId(){
        return ExId.counter;
	}

	//--- 識別番号を取得 ---//
	public int getId() {
		return id;
	}
}

public class ExIdTester {

	public static void main(String[] args) {
		ExId a = new ExId();		// 識別番号１番
		ExId b = new ExId();		// 識別番号２番
        ExId c = new ExId();	
		ExId.setStep(3);
		ExId d = new ExId();
		ExId e = new ExId();
		ExId f = new ExId();
			

		System.out.println("aの識別番号:" + a.getId());
		System.out.println("bの識別番号:" + b.getId());
		System.out.println("cの識別番号:" + c.getId());
		System.out.println("現在の増分値"+d.getStep());
		System.out.println("dの識別番号:" + d.getId());
		System.out.println("eの識別番号:" + e.getId());
		System.out.println("fの識別番号:" + f.getId());

		System.out.println("ExId.counter = " + ExId.getMaxId());
		System.out.println("a.getMaxId() = " +  a.getMaxId());
		System.out.println("b.getMaxId() = " +  b.getMaxId());
	}
}
