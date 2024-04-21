package prog2_01.enshu_2;

public class AccountTester {
    public static void main(String[] args) {
		// 足立君の口座
		Account[] a = new Account[2];
		// 仲田君の口座("足立幸一","123456",1000);("仲田真二","654321",200)};
		a[0]= new Account("足立幸一","123456",1000,2022,4,10);
        a[1]= new Account("仲田真二","654321",200,2020,5,10);
		a[0].withdraw(200);				// 足立君が200円おろす
		a[1].deposit(100);				// 仲田君が100円預ける

        System.out.println(a[0].toSt());
        System.out.println(a[1].toSt());
	}
}
