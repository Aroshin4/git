class Account {
	private String name;		// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高

	//--- コンストラクタ ---//
	Account(String n, String num, long z) {
		name = n;				// 口座名義
		no = num;				// 口座番号
		balance = z;		// 預金残高
	}

	//--- 口座名義を調べる ---//
	String getName() {
		return name;
	}

	//--- 口座番号を調べる ---//
	String getNo() {
		return no;
	}

	//--- 預金残高を調べる ---//
	long getBalance() {
		return balance;
	}

	//--- k円預ける ---//
	void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	void withdraw(long k) {
		balance -= k;
	}
}

// 銀行口座クラス【第２版】をテストするクラス
class AccountTester {

	public static void main(String[] args) {
		// 足立君の口座
		Account[] a = new Account[2];
		// 仲田君の口座("足立幸一","123456",1000);("仲田真二","654321",200)};
		a[0]= new Account("足立幸一","123456",1000);
        a[1]= new Account("仲田真二","654321",200);
		a[0].withdraw(200);				// 足立君が200円おろす
		a[1].deposit(100);				// 仲田君が100円預ける

		System.out.println("■足立君の口座");
		System.out.println("口座名義：" + a[0].getName());
		System.out.println("口座番号：" + a[0].getNo());
		System.out.println("預金残高：" + a[0].getBalance());

		System.out.println("■仲田君の口座");
		System.out.println("口座名義：" + a[1].getName());
		System.out.println("口座番号：" + a[1].getNo());
		System.out.println("預金残高：" + a[1].getBalance());
	}
}
