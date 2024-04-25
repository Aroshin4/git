package Report;

public class Account {
	private String name;		// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高
	private Day1 opdate;


	//--- コンストラクタ ---//
	public Account(String n, String num, long z) {
		name = n;				// 口座名義
		no = num;				// 口座番号
		balance = z;		// 預金残高
	}
	public Account(String n, String num,long b, Day1 d){
		name = n;				// 口座名義
		no = num;				// 口座番号
		balance = b;
		opdate=d;
	}
	public Account(String n, String num, long b, int year, int month, int date){
		name = n;				// 口座名義
		no = num;				// 口座番号
		balance = b;
		opdate = new Day1(year, month, date);
	}
	//--- k円預ける ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	public void withdraw(long k) {
		balance -= k;
	}
	public String toSt() {
        return "口座名義: " + name +
                "  口座番号: " + no +
				"  預金残高：" + balance+
                "  口座開設日: " + opdate.getOpeningDate();
    }
}

