public class Account {
	private String name;		// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高
	private Day opdate;
    protected long timeBalance;

	//--- コンストラクタ ---//
	public Account(String n, String num,long b, Day d){
		name = n;				// 口座名義
		no = num;				// 口座番号
		balance = b;
		opdate= d;
	}
	public Account(String n, String num, long b, int year, int month, int date){
		name = n;				// 口座名義
		no = num;				// 口座番号
		balance = b;
		opdate = new Day(year, month, date);
	}
	public long getBalance(){
		return balance;
	}
	public long getTimeBalance(){
		return timeBalance;
	}
	//--- k円預ける ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	public void withdraw(long k) {
		balance -= k;
	}
	@Override public String toString() {
		if (timeBalance==0.0){
			return "口座名義: " + name +
                "  口座番号: " + no +
				"  普通預金残高：" + balance+
                "  口座開設日: " + opdate.getYear()+"年"+opdate.getMonth()+"月"+opdate.getDate()+"日";
		}else{
			return "口座名義: " + name +
                "  口座番号: " + no +
				"  普通預金残高：" + balance+
				"  定期預金残高: " +timeBalance+
                "  口座開設日: " + opdate.getYear()+"年"+opdate.getMonth()+"月"+opdate.getDate()+"日";
		}
}
}


